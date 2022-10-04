package za.ac.cput.library_management.factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Assertions;

import za.ac.cput.library_management.domain.Librarian;
import org.junit.Test;
import za.ac.cput.library_management.factory.LibrarianFactory;

public class LibrarianFactoryTest {
    @Test
    public void testCreateLibrarian() {
        Librarian librarian = LibrarianFactory.createLibrarian(
                1,
                "District Six Library",
                "123 Library Road",
                "123 456 7890"
        );
        System.out.println(librarian.toString());
        assertNotNull(librarian);
    }

    @Test
    public void testCreateLibrarianWithNullValues() {
        IllegalArgumentException thrown = Assertions
                .assertThrows(IllegalArgumentException.class, () -> {
                    Librarian librarian = LibrarianFactory.createLibrarian(0,null,null,null);
                    System.out.println(librarian.toString());
                }, "IllegalArgumentException was expected");

        assertEquals("id and name mandatory attributes.",thrown.getMessage());
    }

    @Test
    public void testCreateLibrarianWithoutOptionalValues() {
        Librarian librarian = LibrarianFactory.createLibrarian(
                1,
                "District Six Library",
                null,
                null
        );
        System.out.println(librarian.toString());
        assertNotNull(librarian);
    }
}
