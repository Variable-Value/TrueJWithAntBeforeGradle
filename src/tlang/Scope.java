package tlang;

import java.util.Map;
import java.util.Optional;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import org.antlr.v4.runtime.Token;
import org.eclipse.jdt.annotation.Nullable;
import static tlang.TUtil.*;

/** A range of code where a name can be declared and used. When a name is declared within a scope,
 * then it is only visible within that scope. The possible types of scopes are Class, Instance,
 * Initializer, Constructor, Method, Block, Interface, EnumType, and EnumValue. */
class Scope {

@SuppressWarnings("unused")

//@formatter:off

protected @Nullable Scope    parent;
  public            void       setParent(Scope parent) { this.parent = parent; }
  public  @Nullable Scope      getParent()             {return parent;}
  public            boolean    hasParent()             {return (parent != null);}
  public            boolean    isTopLevelScope()       {return ! hasParent();}

final String label;
  public String getLabel()         { return label; }
  public String getAncestryLabel() {
    final String ancestry = hasParent() ? parent.getAncestryLabel() +"." : "";
    return ancestry + getLabel();
  }

//@formatter:on

/** Map from a variable name to its information, if the variable is declared in this scope */
protected Map<String, VarInfo> varToInfoMap = new HashMap<>();


public Scope(String scopeLabel, Scope parent) {
  this.label = scopeLabel;
  this.parent = parent;
}


/** Track the information for a field.
 * @return an Optional with the new field information. An empty Optional means that the field
 *         variable name already exists. */
public Optional<VarInfo> declareFieldName(Token varOrValueName, String type) {
  final String nameText = varOrValueName.getText();
  final String varName = variableName(nameText);
  VarInfo existingVarInfo = varToInfoMap.get(varName);
  final boolean varIsNew = (existingVarInfo == null);
  if (varIsNew) {
    final int declarationLine = varOrValueName.getLine();
    String valueName = isUndecorated(nameText) ? "'"+nameText : nameText;
    VarInfo newVarInfo = new VarInfo(this, declarationLine, type, valueName);
    varToInfoMap.put(varName, newVarInfo);
    return Optional.of(newVarInfo);
  } else {
    return Optional.empty();
  }
}

// TODO: Calling routine must look up VarInfo again. Save the VarInfo or issue an exception here
/** Note that either a new VarInfo or a null value is returned. If a null is returned, a previously
 * existing varInfo exists and an error msg needs to be issued.
 *
 * @param  varOrValueName A variable name or value name Token
 * @param  type           The declared type of the new variable
 * @return                optional new VarInfo for the variable. If not present, a declaration for
 *                        that variable already exists. */
public Optional<VarInfo> declareVarName(Token varOrValueName, String type) {
  final String nameText = varOrValueName.getText();
  final String varName = variableName(nameText);
  @Nullable VarInfo existingVarInfo = getConflictingVarDeclarationInfo(varName);
  final boolean varIsNew = (existingVarInfo == null);
  if (varIsNew) {
    final int declarationLine = varOrValueName.getLine();
    final VarInfo newVarInfo = new VarInfo(this, declarationLine, type, nameText);
    varToInfoMap.put(varName, newVarInfo);
    return Optional.of(newVarInfo);
  } else { // error: variable already declared
    return Optional.empty();
  }
}

private boolean isMissing(Optional<?> optional) {
  return !optional.isPresent();
}

/* Notes on getConflictingVarDeclarationInfo and getVarReferenceInfo
 *
 * Although these two methods (immediately below) have essentially the same definition here, their
 * effect is different because of the overridden definitions in the BackgroundScope subclass. */

/** If a variable cannot be declared at the current scope, return the information about the
 * conflicting declaration. Return a null if no variable was declared with the name or if it was
 * declared as a field, which allows a shadowing declaration. This requires a search for a
 * declaration of the variable name in all the scopes up to, but not including, the field-level
 * scope.
 * @param  varName
 * @return         conflicting information for the variable, else null */
public @Nullable VarInfo getConflictingVarDeclarationInfo(String varName) {
  if (isTopLevelScope()) // field level scope, no conflict exists
    return null;

  @Nullable VarInfo varInfo = varToInfoMap.get(varName);
  final boolean varDefinedInThisScope = (varInfo != null);
  if (varDefinedInThisScope) {
    return varInfo;
  } else { // may be able to find the variable in an ancestor scope
    return parent.getConflictingVarDeclarationInfo(varName); // parent may be a BackgroundScope
  }
}

/** Returns the information for the variable or a null if the variable was not declared in any
 * ancestor scope. Otherwise see BackgroundScope.getExistingVarInfo(String)
 * @param  variableName
 * @return              variable's information or a null */
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

/** Returns an Optional for the information for the variable. The Optional is empty if the variable
 * was not declared in any ancestor scope. Otherwise see BackgroundScope.getExistingVarInfo(String)
 * @param  variableName
 * @return              variable's information or a null */
//TODO: finish converting all users from getExistingVarInfo(String) to getOptionalExistingVarInfo(String)
public Optional<VarInfo> getOptionalExistingVarInfo(String variableName) {
  VarInfo varInfo = varToInfoMap.get(variableName);
  final boolean varDefinedInThisScope = (varInfo != null);
  if (varDefinedInThisScope) {
    return Optional.of(varInfo);
  } else if (isTopLevelScope()) { // the varName was not found in any ancestor scope
    return Optional.empty();
  } else { // may be able to find the variable in an ancestor scope
    return parent.getOptionalExistingVarInfo(variableName);
  }
}


/** When declaring a local variable, we search up to but not in the background scope. Even if the
 * new local variable name is declared in the background scope, the local variable is allowed to
 * shadow it.
 * @param  varName
 * @return */
Scope getDeclarationScope(String varName) { // overriden in BackgroundScope
  if (varToInfoMap.containsKey(varName)) {
    return this;
  } else {
    return parent.getDeclarationScope(varName);
  }
}

Scope getVariableDeclarationScope(String varName) { // overriden in BackgroundScope
  if (varToInfoMap.containsKey(varName)) {
    return this;
  } else {
    return parent.getVariableDeclarationScope(varName);
  }
}

@Override
public String toString() {
  return label;
}

/** Keep scope variable info for code generation */
void clearForCodeGeneration() {
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

    public Scope getScopeWhereDeclared() {
      return scopeWhereDeclared;
    }

    /** The computational type of the variable, e.g., int, Employee. */
    private String type;

    /** @return the variable type, such as int, Employee */
    public String getType() {
      return type;
    }

    private int lineWhereDeclared;

    public int getLineWhereDeclared() {
      return lineWhereDeclared;
    }

    private String currentValueName = "";

    /** @return the name of the most recent value that has been assigned to this variable */
    public String getCurrentValueName() {
      return currentValueName;
    }

    public void setCurrentValueName(String newCurrentValueName) {
      currentValueName = newCurrentValueName;
    }

    /** Maps a valueName of this variable to the line where it was given a value. */
    private Map<String, Integer> valueToLineMap = new HashMap<>();

    /** The code generator needs to know which values are needed after they have been overwritten with
     * new values. Temporary variables can then be created to store these values. */
    public Set<String> reusedValueNames = new HashSet<>();

    public boolean hasDefinedValue(String valueName) {
      return valueToLineMap.containsKey(valueName);
    }

    public Set<String> definedValues() {
      return valueToLineMap.keySet();
    }

    /** Accept a new value name and make it the current value name that is being considered. This
     * should happen during assignment. */
    public void defineNewValue(String valueName, int definitionLine) {
      setCurrentValueName(valueName);
      valueToLineMap.put(valueName, definitionLine);
    }

    public void defineNewValue(Token valueNameToken) {
      defineNewValue(valueNameToken.getText(), valueNameToken.getLine());
    }

    /** @param valueName
     * @return           The line where the valueName was given a value. */
    public Integer lineOf(String valueName) {
      return valueToLineMap.get(valueName);
    }



    public VarInfo(
      Scope scopeWhereDeclared,
      int lineWhereDeclared,
      String type,
      String varOrValueName)
    {
      this.scopeWhereDeclared = scopeWhereDeclared;
      this.lineWhereDeclared = lineWhereDeclared;
      this.type = type;
      if (isDecorated(varOrValueName)) {
        this.currentValueName = varOrValueName;
        valueToLineMap.put(varOrValueName, lineWhereDeclared);
      }
    /* TODO: Why isn't this next needed? Why does it screw things up? The 'varName must be inserted as a
     * current value at the beginning of executables in a different way */
    //    else {
    //      this.currentValueName = "'"+ varOrValueName;
    //      valueToLineMap.put(varOrValueName, lineWhereDeclared);
    //    }
    }

    public VarInfo(VarInfo shadowedInfo) {
      this.scopeWhereDeclared = shadowedInfo.scopeWhereDeclared;
      this.lineWhereDeclared = shadowedInfo.lineWhereDeclared;
      this.type = shadowedInfo.type;
      currentValueName = shadowedInfo.getCurrentValueName();
      // Can't just use pointers to the map and set instead of copying because each method will define
      // its own values and will reuse different values. The original VarInfo that is being shadowed
      // must be kept clean.
      valueToLineMap.putAll(shadowedInfo.valueToLineMap);
      reusedValueNames.addAll(shadowedInfo.reusedValueNames);
    }

    /** frees all data that is not needed for generating code. This enables faster garbage collection.
     * Because this data will never be used again the nulls do not violate any null checking. TODO:
     * create a base object for VarInfo that does not have these objects and use a copy constructor here
     * to go from VarInfo to the base object. This would get rid of the unwanted objects that are
     * contained in VarIngo and still prevent a downstream program from attempting to use them. */
    @SuppressWarnings("null")
    // null suppressed so we can use null to free up unneeded objects for garbage collection
    public void clearForCodeGen() {
    //    valueToLineMap.clear(); // we need valueToLineMap for setting the type for all values in prover
    //    valueToLineMap   = null;
      currentValueName = "";
    }

    /** Free all data for garbage collection. */
    @SuppressWarnings({ "null" })
    // null suppressed so we can cleanup with null
    // may need to be all suppressed so we don't have to have null checking in effect
    public void clear() {
      clearForCodeGen();
      scopeWhereDeclared = null;
      reusedValueNames.clear();
      reusedValueNames = null;
    }

    public String varName() {
      return variableName(currentValueName);
    }

    void removeLineInfo(String valueName) {
      valueToLineMap.remove(valueName);
    }

  } // end inner class

} // end class
