/**
 * We need a little runtime help, but we try to keep it to a minimum.
 *
 * <p>* Java is a trademark of Oracle, Inc.
 */
@NonNullByDefault //TODO: reinstate Eclipse warnings for null and eliminate all warnings
                  //      currently most null messages are set to informational
   ( { ARRAY_CONTENTS, FIELD, PARAMETER, RETURN_TYPE
     , TYPE_ARGUMENT , TYPE_BOUND      , TYPE_PARAMETER
     }      // all possibilities
   )
package tlang.runtime;

import static org.eclipse.jdt.annotation.DefaultLocation.*;
import org.eclipse.jdt.annotation.*;
