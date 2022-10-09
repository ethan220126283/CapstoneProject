package za.ac.cput.library_management.factory;

/*   Name:       Darryll Merkeur
 *   Student#:   220253595
 *   Date:       21/09/2022
 */

import za.ac.cput.library_management.domain.Type;
import za.ac.cput.library_management.util.Helper;

import java.util.UUID;

public class TypeFactory {

    public static Type createType(String id, String name) {

        if (Helper.isNullorEmpty(name)) {
            throw new IllegalArgumentException("");
        }

        return new Type.Builder()
                .setId(id)
                .setName(name)
                .build();

    }
}
