package za.ac.cput.library_management.factory;

/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       22/09/2022
 */

import za.ac.cput.library_management.domain.Library;
import za.ac.cput.library_management.util.Helper;

import java.util.UUID;

public class LibraryFactory {

    public static Library createLibrary(String id, String name, String address, String tel) {

        if (Helper.isNullorEmpty(name)){
            throw new IllegalArgumentException("name mandatory attribute.");
        }

        //Return
        return new Library.Builder()
                .theirId(id)
                .theirName(name)
                .theirAddress(address)
                .theirTel(tel)
                .build();
    }
}

