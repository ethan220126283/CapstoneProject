package za.ac.cput.library_management.factory;

/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       22/09/2022
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.library_management.domain.Library;

import static org.junit.jupiter.api.Assertions.*;

class LibraryFactoryTest {

    @Test
    public void testCreateLibrary() {
        Library library = LibraryFactory.createLibrary(
                "1",
                "James Maxwell Library",
                "123 Brown Street",
                "072 123 4567"
        );
        System.out.println(library.toString());
        assertNotNull(library);
    }

    @Test
    public void testCreateLibraryWithoutOptionalValues() {
        Library library = LibraryFactory.createLibrary(
                "1",
                "James Maxwell Library",
                null,
                null
        );
        System.out.println(library.toString());
        assertNotNull(library);
    }

    @Test
    public void testCreateLibraryWithNullValues() {
        IllegalArgumentException thrown = Assertions
                .assertThrows(IllegalArgumentException.class, () -> {
                    Library library = LibraryFactory.createLibrary(null,null,null,null);
                    System.out.println(library.toString());
                }, "IllegalArgumentException was expected");

        assertEquals("name mandatory attribute.",thrown.getMessage());
    }
}