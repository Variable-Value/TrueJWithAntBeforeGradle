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
 * following branch.
 * @implementation We do not need to check if the varInfo is nonnull here because in the enclosing
 *                 scope {@link #visitT_assignable(T_assignableContext)} only adds the current value
 *                 to the <code>currentScope.varToHeldLatestValue</code> map if the varInfo is
 *                 present.*/
void reestablishEnclosingScopeValues() {
  for (Entry<String,String> maplet : varToHeldLatestValue.entrySet()) {
    final String varName = maplet.getKey();
    String latestValueForVariable = maplet.getValue();
    Optional<VarInfo> optionalInfo = getOptionalExistingVarInfo(varName);
    if (optionalInfo.isPresent()) {
      resetVarToBeforeConditionalStatement(varName, latestValueForVariable, optionalInfo.get());
    }
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

//TODO Clean up this JavaDoc
/** When we assign a value to a new valueName in an initial branch of a conditional, all following
 * branches of the same conditional are obligated to assign a value to that same valueName to ensure
 * that code following the conditional will be able to treat valueNames consistently. This creates
 * an obligation also gets created in
 * all ancestor {@link InitialConditionalBranchScope} scopes until we find an enclosing
 * {@link FollowingConditionalBranchScope}. If this initial branch is enclosed in a
 * following branch, the assignment may be to a valueName fulfilling an obligation of that following
 * branch; in which case, we remove the valueName from the nestedValueNames of the following
 * branch.
 * <p>
 * If this variable was defined in an enclosing scope, then it was assigned a value name there.
 * Preserve that value name so it can be restored to use as a starting point in processing other
 * branches of this conditional statement. This must also be set in any ancestor scopes that are in
 * a chain of immediately enclosing {@link InitialConditionalBranchScope} scopes.
 * @implementation Add to the chain of
 * @param varInfo TODO*/
public void addToDelegatedValueNames(VarInfo varInfo, String varName, String valueName) {
  delegatedValueNames.add(valueName);
  setDelegationsAndremoveObligationForEnclosingScopes(varInfo, varName, valueName);
}

private void setDelegationsAndremoveObligationForEnclosingScopes(VarInfo varInfo, String varName
                                                                 , String valueName) {
  String currentValueName = varInfo.getCurrentValueName();
  Scope s = this;
  while(notAnEnclosingFollowingScope(s)) {
    if (s instanceof InitialConditionalBranchScope) {
      InitialConditionalBranchScope initialS = (InitialConditionalBranchScope)s;
      initialS.delegatedValueNames.add(valueName);
      initialS.varToHeldLatestValue.put(varName, currentValueName);
    }
    s = s.parent;
  }
  if (s instanceof FollowingConditionalBranchScope) {
    ((FollowingConditionalBranchScope)s).removeAnyObligationOnValueName(valueName);
  }
//  while (parentIsStillInExecutable(s)) {
//    s = s.parent;
//    if (s instanceof FollowingConditionalBranchScope) {
//      ((FollowingConditionalBranchScope)s).removeAnyObligationOnValueName(valueName);
//    }
//    if (s instanceof InitialConditionalBranchScope) {
//      ((InitialConditionalBranchScope)s).delegatedValueNames.add(valueName);
//    }
//  }
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
