package za.ac.cput.library_management.factory;
import za.ac.cput.library_management.domain.Type;
import za.ac.cput.library_management.util.Helper;

/*   Name:       Darryll Merkeur
 *   Student#:   220253595
 *   Date:       21/09/2022
 */
public class TypeFactory {
    public static Type buildType(String type_name, int type_id) {
        if (Helper.isZero(type_id) || Helper.isNullorEmpty(type_name)) {
            throw new IllegalArgumentException("");
        }

        return new Type.Builder()
                .setType_id(type_id)
                .setType_name(type_name)
                .build();
    }
}
