package tlang;

import static tlang.TUtil.variableName;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import org.eclipse.jdt.annotation.Nullable;
import tlang.Scope.VarInfo;
import tlang.TLantlrParser.T_assignableContext;

/** <code>InitialConditionalBranchScope</code> is used for the then branch of an <code>if</code>
 * statement and for The first case of a <code>switch</code> statement. The code of the branch is
 * enclosed in an <code>InitialConditionalBranchScope</code> whether a single statement or a block.
 * @see FollowingConditionalBranchScope */
class InitialConditionalBranchScope extends Scope {

/** A map from variables that are assigned values in the initial branch to the value names they had
 * before the execution of the initial branch. */
Map<String, String> varToHeldLatestValue = new HashMap<>();

/** The value names assigned in the initial branch to variables of enclosing scopes. These are saved
 * in order to make sure that all branches assign values to the same value names. Note that this
 * means that if multiple valueNames are assigned to the same variable in one conditional branch,
 * then all the same valueNames must be used in all the branches. If a complicated computation is
 * needed in just one branch, then the others might avoid extra computation by trivially assigning
 * the current value to the unneeded valueNames. */
private HashSet<String> delegatedValueNames = new HashSet<>();;
/**
 * @param scopeLabel
 * @param parent
 */
public InitialConditionalBranchScope(String scopeLabel, Scope parent) {
  super(scopeLabel, parent);
}

/** Restore the current values for all enclosing scopes to set the context for processing any
 * following branch. */
void reestablishEnclosingScopeValues() {
  for (Entry<String,String> maplet : varToHeldLatestValue.entrySet()) {
    final String varName = maplet.getKey();
    String latestValueForVariable = maplet.getValue();
    Optional<VarInfo> optionalInfo = getOptionalExistingVarInfo(varName);
    if (optionalInfo.isPresent())
      resetVarToBeforeConditionalStatement(varName, latestValueForVariable, optionalInfo.get());
  }
}

private void resetVarToBeforeConditionalStatement
      (String varName, String valueForVar, VarInfo varInfo) {
  varInfo.setCurrentValueName(valueForVar);
  for (String valueName : delegatedValueNames)
    if (varName.equals(variableName(valueName)))
      varInfo.removeLineInfo(valueName);
}

void setNewEnclosingScopeCurrentValues() {
  for (Entry<String,String> maplet : varToHeldLatestValue.entrySet()) {
    String variableName = maplet.getKey();
    Scope declarationScope = getVariableDeclarationScope(variableName);
    VarInfo varInfo = parent.varToInfoMap.get(maplet.getKey()); //TODO: finish change
    varInfo.setCurrentValueName(maplet.getValue());
  }
}

@SuppressWarnings("unchecked")
public HashSet<String> getCloneOfDelegatedValueNames() {
  return (HashSet<String>)delegatedValueNames.clone();
}

@Override
public @Nullable VarInfo getConflictingVarDeclarationInfo(String varName) {
  return parent.getConflictingVarDeclarationInfo(varName); // parent may be a BackgroundScope
}

@Override
Scope getDeclarationScope(String varName) {
  return parent.getDeclarationScope(varName);
}

@Override
Scope getVariableDeclarationScope(String varName) {
  return parent.getVariableDeclarationScope(varName);
}

/** Conditional statement handling of valueNames gets complicated. We create a new valueName anytime
 * we assign a value to a variable, and that valueName is used later in the code to represent the
 * value. If the assignment is in a branch of a conditional statement, we must therefore make the
 * valueName available to statements that follow the conditional, but that implies that all paths
 * through the conditional must assign a value to the valueName. So if we assign a value to a new
 * valueName inside any branch of a conditional statement, then all the branches of that conditional
 * are obligated to assign a value to that same valueName; therefore, we will encounter the new
 * valueName first in the initial branch. The "obligation" for all the following branches of the
 * conditional statement is recorded as a "delegation" in the <code>nestedValueNames</code> set of
 * the corresponding initial branch.
 * <p>
 * This kind of obligation can be created in the initial branch even when the assignment to a new
 * valueName happens in a nested conditional statement. So when we assign to a new valueName in an
 * initial branch, we need to check <em>enclosing</em> scopes and set the delegation in every
 * enclosing <code>InitialConditionalBranchScope</code> until we run out of enclosing scopes in the
 * executable, or until we find an enclosing {@link FollowingConditionalBranchScope}. We can stop at
 * a following scope because its corresponding initial scope will have already created the
 * delegation/obligation in its enclosing scopes, as we just described.
 * <p>
 * So, often, we will be left sitting at an enclosing following scope, and in that case it turns out
 * there will be more to do. This is because nested conditional statements under following branches
 * can fulfill that branches obligations. To see this, let's start with the nestedValueNames set of
 * delegations from the initial branch. Each corresponding following branch gets a copy of that set
 * and records meeting its obligations by removing valueNames from its copy of the set. When an
 * assignment is made in the following branch it fulfills the obligation; however, this obligation
 * may also be fulfilled by a nested conditional statement in our following branch with the
 * assignment in all of its branches. So, when we are searching upwards from an initial branch
 * assignment, the assignment may be to a valueName fulfilling an obligation created by a following
 * branch's corresponding initial branch. Therefore, we remove the valueName from the
 * nestedValueNames of the following branch where the search stops. */
public void setDeligationObligationForEnclosingScopes(String valueName) {
  Scope s;
  for (s = this; notAnEnclosingFollowingScope(s); s = s.parent)
    if (s instanceof InitialConditionalBranchScope)
      delegateInScope((InitialConditionalBranchScope)s, valueName);

  if (s instanceof FollowingConditionalBranchScope)
    ((FollowingConditionalBranchScope)s).removeAnyObligationOnValueName(valueName);
}

private void delegateInScope(InitialConditionalBranchScope scope, String valueName) {
  scope.delegatedValueNames.add(valueName);
  scope.varToHeldLatestValue.put(variableName(valueName), valueName);
}

/**
 * @param s
 * @return
 */
private boolean notAnEnclosingFollowingScope(Scope s) {
  return ! (s instanceof FollowingConditionalBranchScope) && scopeIsStillInExecutable(s);
}

private boolean scopeIsStillInExecutable(Scope s) {
  return ! (s instanceof BackgroundScope);
}

void setCollectionsToEmpty() {
  varToHeldLatestValue = TUtil.EMPTY_HASH_MAP;
  delegatedValueNames = TUtil.EMPTY_HASH_SET;
}


}
