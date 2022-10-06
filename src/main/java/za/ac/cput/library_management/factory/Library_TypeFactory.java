package za.ac.cput.library_management.factory;

/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       30/09/2022
 */


import za.ac.cput.library_management.domain.Library;
import za.ac.cput.library_management.domain.Library_Type;
import za.ac.cput.library_management.domain.Type;
import za.ac.cput.library_management.util.Helper;

import java.util.UUID;

public class Library_TypeFactory {

    public static Library_Type createLibrary_Type(String id, Library library, Type type) {

        if (Helper.isNullorEmptyObject(library) || Helper.isNullorEmptyObject(type) || Helper.isNullorEmpty(id)){
            throw new IllegalArgumentException("missing mandatory attribute.");
        }

        //Return
        return new Library_Type.Builder()
                .theirId(id)
                .theirLibrary(library)
                .theirType(type)
                .build();
    }
}
