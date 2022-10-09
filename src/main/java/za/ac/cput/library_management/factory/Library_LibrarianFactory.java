package za.ac.cput.library_management.factory;

import za.ac.cput.library_management.domain.Librarian;
import za.ac.cput.library_management.domain.Library;
import za.ac.cput.library_management.domain.Library_Librarian;
import za.ac.cput.library_management.util.Helper;

public class Library_LibrarianFactory {

    //Factory Method
    public static Library_Librarian createLibrary_Librarian(String id, Library library, Librarian librarian) {

        if (Helper.isNullorEmptyObject(library) || Helper.isNullorEmptyObject(librarian) || Helper.isNullorEmpty(id)){
            throw new IllegalArgumentException("");
        }

        //Return
        return new Library_Librarian.Builder()
                .theirId(id)
                .theirLibrary(library)
                .theirLibrarian(librarian)
                .build();
    }

}
