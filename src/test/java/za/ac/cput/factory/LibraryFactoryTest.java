package za.ac.cput.factory;

/*  Name:       Ethan Christopher Swart
*   Student#:   220126283
*   Date:       22/09/2022
*/

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Assertions;

import za.ac.cput.domain.Library;
import org.junit.Test;

public class LibraryFactoryTest {
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
    public void testCreateLibraryWithNullValues() {
        IllegalArgumentException thrown = Assertions
        .assertThrows(IllegalArgumentException.class, () -> {
            Library library = LibraryFactory.createLibrary("",null,null,null);
            System.out.println(library.toString());
        }, "IllegalArgumentException was expected");

        assertEquals("id and name mandatory attributes.",thrown.getMessage());
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
}
