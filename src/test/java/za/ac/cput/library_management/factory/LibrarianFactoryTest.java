package za.ac.cput.library_management.factory;

/*   Name:       Faeedh Daniels
 *   Student#:   219174288
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.library_management.domain.Librarian;

import static org.junit.jupiter.api.Assertions.*;

class LibrarianFactoryTest {

    @Test
    public void testCreateLibrarian() {

        char[] passwordArray = new char[]{'p','a','s','s','w','o','r','d'};

        Librarian librarian = LibrarianFactory.createLibrarian(
                "1",
                "James",
                "123 Library Road",
                "123 456 7890",
                passwordArray
        );
        System.out.println(librarian.toString());
        assertNotNull(librarian);
    }

    @Test
    public void testCreateLibrarianWithNullValues() {
        IllegalArgumentException thrown = Assertions
                .assertThrows(IllegalArgumentException.class, () -> {
                    Librarian librarian = LibrarianFactory.createLibrarian(null,null,null,null, null);
                    System.out.println(librarian.toString());
                }, "IllegalArgumentException was expected");

        assertEquals("",thrown.getMessage());
    }

    @Test
    public void testCreateLibrarianWithoutOptionalValues() {
        Librarian librarian = LibrarianFactory.createLibrarian(
                "1",
                "District Six Library",
                null,
                null,
                null
        );
        System.out.println(librarian.toString());
        assertNotNull(librarian);
    }
}