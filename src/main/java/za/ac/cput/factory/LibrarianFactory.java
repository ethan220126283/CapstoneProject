package za.ac.cput.factory;

import za.ac.cput.domain.Librarian;
import za.ac.cput.util.Helper;

public class LibrarianFactory {

    //Factory Method
    public static Librarian createLibrarian(int id, String name, String address, String tel) {

        if (Helper.isZero(id) || Helper.isNullorEmpty(name)){
            throw new IllegalArgumentException("");
        }

        //Return
        return new Librarian.Builder()
                .librarian_ID(id)
                .librarian_Name(name)
                .librarian_Address(address)
                .librarian_Tel(tel)
                .build();
    }
}
