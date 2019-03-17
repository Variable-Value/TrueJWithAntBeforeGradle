package tlang;

import java.util.HashSet;
import java.util.Set;
import org.eclipse.jdt.annotation.Nullable;
import tlang.Scope.VarInfo;

/** <code>FollowingConditionalBranchScope</code> is used for the else branch of an <code>if</code>
 * statement and for all but the first case of a <code>switch</code> statement. The code of the
 * branch is enclosed in a <code>FollowingConditionalBranchScope</code> whether it is a single
 * statement or a block.
 * @see InitialConditionalBranchScope */
public class FollowingConditionalBranchScope extends Scope{

private InitialConditionalBranchScope initialBranchScope;

public InitialConditionalBranchScope getFirstScope() {return initialBranchScope;}

/** The <code>initialConditionalBranchScope</code> collects the valueNames that it defines.
 * <code>nestedValueNames</code> is a copy used to make sure that this following scope also defines
 * those valueNames. */
private HashSet<String> obligatedValueNames;

/** All the valueNames that this following scope is obligated to define because they were defined in
 * the corresponding <code>initialBranchScope</code>. This following scope is also only allowed to
 * define these valuenames.
 *
 * TODO: Allow initial or following branches to define other valueNames that are not referenced
 * outside the branch. This is easy to do if we don't have to issue an error message at the point of
 * reuse -- we just eliminate all these checks that we do now. The reused valueNames will simply not
 * be useful in status statements. To give an error message, we have to instead keep track of a list
 * of "poisened valueNames, which cannot be reused outside the branch they were created in. */
public Set<String> getNestedValueNames() { return obligatedValueNames; }


/** Constructor for the scope of all but the first branch of a conditional statement.
 * @param scopeLabel                An identifying string
 * @param parent                    The enclosing scope
 * @param correspondingInitialScope */
public FollowingConditionalBranchScope(String scopeLabel, Scope parent,
                                       InitialConditionalBranchScope correspondingInitialScope)
{
  super(scopeLabel, parent);
  this.initialBranchScope = correspondingInitialScope;
  this.obligatedValueNames = this.initialBranchScope.getCloneOfDelegatedValueNames();
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

void setCollectionsToEmpty() {
  obligatedValueNames = TUtil.EMPTY_HASH_SET;
}

/** Remove the obligation for defining a valueName, if that valueName is an obligation of this
 * branch. */
public void removeAnyObligationOnValueName(String valueName) {
  obligatedValueNames.remove(valueName);
}

}
