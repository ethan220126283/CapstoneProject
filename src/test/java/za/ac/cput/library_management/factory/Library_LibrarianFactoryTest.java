package za.ac.cput.library_management.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.library_management.domain.Librarian;
import za.ac.cput.library_management.domain.Library;
import za.ac.cput.library_management.domain.Library_Librarian;

import static org.junit.jupiter.api.Assertions.*;

class Library_LibrarianFactoryTest {

    Library library = LibraryFactory.createLibrary(
            "1",
            "James Maxwell Library",
            "123 Brown Street",
            "072 123 4567"
    );

    Librarian librarian = LibrarianFactory.createLibrarian(
            "1",
            "James",
            "123 Library Road",
            "123 456 7890"
    );

    @Test
    void createLibrary_Librarian() {
        Library_Librarian library_librarian = Library_LibrarianFactory.createLibrary_Librarian(
                "1",
                library,
                librarian
        );
        System.out.println(library_librarian.toString());
        assertNotNull(library_librarian);
    }
}