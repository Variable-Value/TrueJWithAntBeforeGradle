package tlang;

import static tlang.TUtil.variableName;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
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
private HashSet<String> delegatedValueNames = new HashSet<>();

/** The value of the variables at the end of the initial branch. If a following branch ends with a
 * different valueName we change its value here to $T$. Then at the end of the conditional
 * statement, we set that variable's varInfo.currentValueName to $T$. This will force the next
 * refernce to the variable, whatever the valueName, to be seen as a reference to an overwritten
 * valueName, and the code necessary to access the valueName's value will be generated, whether it
 * was the ending currentValueName or not. */
Map<String, String> varToEndingValueName = new HashMap<>();

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

void setEndingValueNames() {
  Set<String> modififedVariables = varToHeldLatestValue.keySet();
  for (String var : modififedVariables) {
    VarInfo varInfo = getExistingVarInfo(var);
    varToEndingValueName.put(var, varInfo.getCurrentValueName());
  }
}

public void captureConflictingEndingValueNames() {
  for (Entry<String,String> maplet : varToEndingValueName.entrySet()) {
    String var = maplet.getKey();
    String endingValueName = maplet.getValue();
    VarInfo varInfo = getExistingVarInfo(var);
    String currentValueName = varInfo.getCurrentValueName();
    if ( ! endingValueName.equals(currentValueName) ) {
      if (endingValueName != TLantlrRewriteVisitor.$T$)
        varInfo.reusedValueNames.add(endingValueName);
      varInfo.reusedValueNames.add(currentValueName);
      varToEndingValueName.put(var, TLantlrRewriteVisitor.$T$);
      varInfo.setCurrentValueName(TLantlrRewriteVisitor.$T$);
    }
  }
}

void setCollectionsToEmpty() {
  varToHeldLatestValue = TUtil.EMPTY_HASH_MAP;
  delegatedValueNames = TUtil.EMPTY_HASH_SET;
}


}
