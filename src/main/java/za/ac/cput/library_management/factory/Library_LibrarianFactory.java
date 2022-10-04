package za.ac.cput.library_management.factory;

import za.ac.cput.library_management.domain.Library_Librarian;
import za.ac.cput.library_management.util.Helper;

public class Library_LibrarianFactory {

    //Factory Method
    public static Library_Librarian createLibrary_Librarian(int library_id, int librarian_id) {

        if (Helper.isZero(library_id) || Helper.isZero(librarian_id)){
            throw new IllegalArgumentException("");
        }

        //Return
        return new Library_Librarian.Builder()
                .libraryId(library_id)
                .librarianId(librarian_id)
                .build();
    }
}
