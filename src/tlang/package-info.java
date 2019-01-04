/**
 * The T language uses much of the underlying assumptions and structure of the
 * Java* language, but focuses on the state produced by each procedural
 * statement as well as the operational statements of the procedure. The
 * notation for state uses unique variable
 * names for each value that will be computed. To construct the value names, variable names are
 * pre-decorated with an apostrophe for the initial value of the variable,
 * post-decorated with an apostrophe for the final value, and middle-decorated for intermediate
 * values by appending an apostrophe and additional name characters.
 *
 * <p>* Java is a trademark of Oracle, Inc.
 */
@NonNullByDefault //TODO: reinstate Eclipse warnings for null and eliminate all warnings
                  //      currently most null messages are set to informational
   ( { ARRAY_CONTENTS, FIELD, PARAMETER, RETURN_TYPE
     , TYPE_ARGUMENT , TYPE_BOUND      , TYPE_PARAMETER
     }      // all possibilities
   )
package tlang;

import static org.eclipse.jdt.annotation.DefaultLocation.*;
import org.eclipse.jdt.annotation.*;
