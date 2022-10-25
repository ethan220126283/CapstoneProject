package za.ac.cput.library_management.factory;

/*   Name:       Mogammad Faeedh Daniels
 *   Student#:   219174288
 *   LibrarianFactory.java
 */

import za.ac.cput.library_management.domain.Librarian;
import za.ac.cput.library_management.util.Helper;

import java.util.UUID;

public class LibrarianFactory {

    //Factory Method
    public static Librarian createLibrarian(String id, String name, String address, String tel, char[] password) {

        if (Helper.isNullorEmpty(id) || Helper.isNullorEmpty(name) || Helper.isNullorEmpty(address) || Helper.isNullorEmpty(tel)){
            throw new IllegalArgumentException("Attributes cannot be empty or null");
        }

        //Return
        return new Librarian.Builder()
                .theirID(id)
                .theirName(name)
                .theirAddress(address)
                .theirTel(tel)
                .theirPassword(password)
                .build();
    }
}
