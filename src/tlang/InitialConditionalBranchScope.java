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
    final String latestValueForVariable = maplet.getValue();
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

@SuppressWarnings("unchecked")
public HashSet<String> getCloneOfDelegatedValueNames() {
  return (HashSet<String>)delegatedValueNames.clone();
}

@Override
public @Nullable VarInfo getConflictingVarDeclarationInfo(String varName) {
  return parent.getConflictingVarDeclarationInfo(varName);
}

@Override
Scope getDeclarationScope(String varName) {
  return parent.getDeclarationScope(varName);
}

@Override
Scope getVariableDeclarationScope(String varName) {
  return parent.getVariableDeclarationScope(varName);
}

void delegateInScope(String valueName, String currentValueName) {
  delegatedValueNames.add(valueName);
  String varName = variableName(valueName);
  if ( ! varToHeldLatestValue.containsKey(varName)) {
    varToHeldLatestValue.put(varName, currentValueName);
  }
}

void setCollectionsToEmpty() {
  varToHeldLatestValue = TUtil.EMPTY_HASH_MAP;
  delegatedValueNames = TUtil.EMPTY_HASH_SET;
}


}
