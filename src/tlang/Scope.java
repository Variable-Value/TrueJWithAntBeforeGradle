package tlang;

import java.util.Map;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.eclipse.jdt.annotation.Nullable;

import static tlang.TUtil.*;

/** A range of code where a name can be declared and used. When a name is declared within a scope,
 * then it is only visible within that scope. The possible types of scopes are Class, Instance,
 * Initializer, Constructor, Method, Block, Interface, EnumType, and EnumValue.
 */
class Scope {

@SuppressWarnings("unused")
private final String invokingProgram;

protected @Nullable Scope    parent;
  public            void       setParent(Scope parent) { this.parent = parent; }
  public  @Nullable Scope      getParent()             {return parent;}
  public            boolean    hasParent()             {return (parent != null);}
  public            boolean    isTopLevelScope()       {return ! hasParent();}

private final String label;
  public String getLabel()         { return label; }
  public String getAncestryLabel() {
    final String ancestry = hasParent() ? parent.getAncestryLabel() +"." : "";
    return ancestry + getLabel();
  }

  //TODO: remove the @Nullable
protected Map<String,@Nullable VarInfo> varToInfoMap = new HashMap<>();
  // The current valueName for this variable, if the variable is declared in this scope

public Scope( String invokingProgram
            , String scopeLabel
            , Scope parent
            )
{ this.invokingProgram = invokingProgram;
  this.label = scopeLabel;
  this.parent = parent;
}

//TODO cleanup from here down ********************************


@Deprecated
public void addParamName(@SuppressWarnings("unused") Token valueNameToken) {
//  // return, is added as declareVarName("return").
//  final String valueName = valueNameToken.getText();
//  final boolean correctDecoration
//                = isInitialDecorated(valueName) || isFinalDecorated(valueName);
//  if ( ! correctDecoration) {
//    errs.collectMsg( program, valueNameToken
//                   , "Parameters must be initial or final values, "
//                    +"i.e., pre- or post-decorated"
//                   );
//  }
//  final String varName = variableName(valueName);
//  VarInfo oldVarInfo = varToInfoMap.get(varName);
//  final boolean duplicateParamVar = oldVarInfo != null;
//  if (duplicateParamVar) {
//    errs.collectMsg( program, valueNameToken
//                    ,   "Attempted to declare parameter "+ valueName
//                      + ", but parameter "+ oldVarInfo.getCurrentValueName()
//                      + "has the same base variable name"
//                    );
//  } else {
//    varToInfoMap.put(varName, new VarInfo(valueNameToken.getLine(), valueName));
//  }
}


public @Nullable VarInfo declareFieldName(Token varOrValueName, String type) {
  final String nameText = knownToBeNonNull(varOrValueName.getText());
  final String varName = variableName(nameText);
  VarInfo existingVarInfo = varToInfoMap.get(varName);
  final boolean varIsNew = (existingVarInfo == null);
  if (varIsNew) {
    final int declarationLine = varOrValueName.getLine();
    VarInfo newVarInfo = new VarInfo(this, declarationLine, type, nameText);
    varToInfoMap.put(varName, newVarInfo);
    return newVarInfo;
  } else {
    // During semantic check, we detect this pre-existing field declaration by
    // comparing its line number with the line number at this new invalid
    // declaration
    return null;
  }
}

// TODO: Calling routine must look up VarInfo again. Save the VarInfo or issue an exception here
/** Note that either a new VarInfo or a null value is returned. If a null is
 *  returned, a previously existing varInfo exists and an error msg needs to
 *  be issued.
 *
 * @param varOrValueName
 * @return new VarInfo for the variable or null to signal an error (a pre-existing
 *         declaration for that variable cannot be shadowed)
 */
public @Nullable VarInfo declareVarName(Token varOrValueName, String type) {
  final String nameText = knownToBeNonNull(varOrValueName.getText());
  final String varName = variableName(nameText);
  @Nullable VarInfo existingVarInfo = getConflictingVarDeclarationInfo(varName);
  final boolean varIsNew = (existingVarInfo == null);
  if (varIsNew) {
    final int declarationLine = varOrValueName.getLine();
    final VarInfo newVarInfo = new VarInfo(this, declarationLine, type, nameText);
    varToInfoMap.put(varName, newVarInfo);
    return newVarInfo;
  } else { // error: variable already declared
    return null;
  }
}

/* Notes on getConflictingVarDeclarationInfo and getVarReferenceInfo
 *
 *   Although these two methods (immediately below)
 *   have essentially the same definition here, their
 *   effect is different because of the overridden definitions in the
 *   BackgroundScope subclass.
 */

/**
 * If a variable cannot be declared at the current scope, return the information about the
 * conflicting declaration. Return a null if no variable was declared with the name or if it was
 * declared as a field, which allows a shadowing declaration.
 * This requires a search for a declaration of the variable name in all the scopes up to, but not
 * including, the field-level scope.
 * @param varName
 * @return conflicting information for the variable, else null
 */
public @Nullable VarInfo getConflictingVarDeclarationInfo(String varName) {
  if (this.label == "this" || isTopLevelScope()) // field level scope, no conflict exists
    return null;

  @Nullable VarInfo varInfo = varToInfoMap.get(varName);
  final boolean varDefinedInThisScope = (varInfo != null);
  if (varDefinedInThisScope) {
    return varInfo;
  } else { // may be able to find the variable in an ancestor scope
    return parent.getConflictingVarDeclarationInfo(varName); // parent may be a BackgroundScope
  }
}

/**
 * Returns the information for the variable or a null if the variable was not
 * declared in any ancestor scope. Otherwise see BackgroundScope.getExistingVarInfo(String)
 * @param variableName
 * @return variable's information or a null
 */
public VarInfo getExistingVarInfo(String variableName) {
  VarInfo varInfo = varToInfoMap.get(variableName);
  final boolean varDefinedInThisScope = (varInfo != null);
  if (varDefinedInThisScope) {
    return varInfo;
  } else {
    if (isTopLevelScope()) { // the varName was not found in any ancestor scope
      return null;
    } else { // may be able to find the variable in an ancestor scope
      return parent.getExistingVarInfo(variableName);
    }
  }
}

//TODO: finish converting all users from getExistingVarInfo(String) to getOptionalExistingVarInfo(String)
public Optional<VarInfo> getOptionalExistingVarInfo(String variableName) {
  VarInfo varInfo = varToInfoMap.get(variableName);
  final boolean varDefinedInThisScope = (varInfo != null);
  if (varDefinedInThisScope) {
    return Optional.of(varInfo);
  } else {
    if (isTopLevelScope()) { // the varName was not found in any ancestor scope
      return Optional.empty();
    } else { // may be able to find the variable in an ancestor scope
      return Optional.ofNullable(parent.getExistingVarInfo(variableName));
    }
  }
}


/**
 * When declaring a local variable, we search up to but not in the background
 * scope. Even if the new local variable name is declared in the background
 * scope, the local variable is allowed to shadow it.
 * @param varName
 * @return
 */
Scope getDeclarationScope(String varName) { // overriden in BackgroundScope
  if (varToInfoMap.containsKey(varName)) {
    return this;
  } else {
    return parent.getDeclarationScope(varName);
  }
}

Scope getReferenceScope(String varName) { // overriden in BackgroundScope
  if (varToInfoMap.containsKey(varName)) {
    return this;
  } else {
    return parent.getReferenceScope(varName);
  }
}

void clearForCodeGen() {
  for (VarInfo v : varToInfoMap.values()) {
    v.clearForCodeGen();
  }
}

void clear() {
  for (VarInfo v : varToInfoMap.values()) {
    v.clear();
  }
  varToInfoMap.clear();
  varToInfoMap = null;
}


// inner
class VarInfo {

  private Scope scopeWhereDeclared;
    public Scope getScopeWhereDeclared() { return scopeWhereDeclared; }

  /** The computational type of the variable, e.g., int, Employee. */
  private String type;
      /** @return the variable type, such as int, Employee */
      public String getType() { return type; }

  private int lineWhereDeclared;
      public int getLineWhereDeclared() { return lineWhereDeclared; }

  private String currentValueName;
      /** @return the name of the most recent value that has been assigned to this variable*/
      public String getCurrentValueName() { return currentValueName; }
      /**
       * Change the name to that of the value that is now being assigned to the variable.
       * @return the value that is being set in the variable info
       */
      public void setCurrentValueName(String newCurrentValueName) {
        currentValueName = newCurrentValueName;
        }

  /** Maps a valueName of this variable to the line where it was given a value. */
  private Map<String,Integer> valueToLineMap = new HashMap<>();

  public boolean hasDefinedValue(String valueName) {
    return valueToLineMap.containsKey(valueName);
  }

  public Set<String> definedValues() {
    return valueToLineMap.keySet();
  }

  /**
     * Define a new name for a value and make it the current value name that is being considered.
     * @param valueName
     * @param definitionLine
     */
  public void defineNewValue(String valueName, int definitionLine) {
    setCurrentValueName(valueName);
    valueToLineMap.put(valueName, definitionLine);
  }

  /**
   * @param valueName
   * @return The line where the valueName was given a value.
   */
  public Integer lineOf(String valueName) { return valueToLineMap.get(valueName); }

  /**
   * The code generator needs to know which values are needed after they have been
   * overwritten with new values. Temporary variables can then be created to store
   * these values.
   */
  public Set<String> reusedValueNames  = new HashSet<>();

  public VarInfo(Scope scopeWhereDeclared, int lineWhereDeclared, String type, String varOrValueName) {
    this.scopeWhereDeclared = scopeWhereDeclared;
    this.lineWhereDeclared = lineWhereDeclared;
    this.type = type;
    if (isDecorated(varOrValueName)) {
      this.currentValueName = varOrValueName;
      valueToLineMap.put(varOrValueName, lineWhereDeclared);
    }
  }

  public VarInfo(Scope scopeWhereDeclared, VarInfo shadowedInfo) {
    this.scopeWhereDeclared = shadowedInfo.scopeWhereDeclared;
    this.lineWhereDeclared = shadowedInfo.lineWhereDeclared;
    this.type = shadowedInfo.type;
    currentValueName = shadowedInfo.getCurrentValueName();
    // Can't just use pointers to the map and set instead of copying because each method will have
    // its own values and will reuse different values. The original VarInfo that is being shadowed
    // must be kept clean.
    valueToLineMap.putAll(shadowedInfo.valueToLineMap);
    reusedValueNames.addAll(shadowedInfo.reusedValueNames);
  }

  /** frees all data that is not needed for generating code. This enables faster
   * garbage collection. Because this data will never be used again the nulls
   * do not violate any null checking.
   * TODO: create a base object for VarInfo that does not have these objects and use a copy
   *       constructor here to go from VarInfo to the base object. This would get rid of the
   *       unwanted objects that are contained in VarIngo and still prevent a
   *       downstream program from attempting to use them.
   */
  @SuppressWarnings("null")
    // null suppressed so we can use null to free up unneeded objects for garbage collection
  public void clearForCodeGen() {
//    valueToLineMap.clear(); // we need valueToLineMap for setting the type for all values in prover
//    valueToLineMap   = null;
    currentValueName = null;
  }

  /** Free all data for garbage collection.
   */
  @SuppressWarnings({"null"})
    // null suppressed so we can cleanup with null
    // may need to be all suppressed so we don't have to have null checking in effect
  public void clear() {
    clearForCodeGen();
    scopeWhereDeclared = null;
    reusedValueNames.clear();
    reusedValueNames = null;
  }

} // end inner class

} // end class
