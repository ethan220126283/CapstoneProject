package za.ac.cput.library_management.service.impl;

/*   Name:       Mogammad Faeedh Daniels
 *   Student#:   219174288
 *   Library_LibrarianServiceImplTest.java
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.library_management.domain.*;
import za.ac.cput.library_management.factory.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class Library_LibrarianServiceImplTest {

    @Autowired
    private Library_LibrarianServiceImpl service;

    private static final Library library1 = LibraryFactory.createLibrary(
            "21",
            "Summit Library",
            "2574 James Avenue",
            "123 304 2454"
    );

    private static final Library library2 = LibraryFactory.createLibrary(
            "22",
            "Tempest Library",
            "4773 Hart Ridge Road",
            "123 258 8001"
    );

    private static final Library library3 = LibraryFactory.createLibrary(
            "23",
            "Institute Library",
            "3089 Junkins Avenue",
            "123 737 4991"
    );

    private static final Librarian librarian1= LibrarianFactory.createLibrarian(
            "1",
            "Franko Otiento",
            "1752 Gandy Street",
            "123 465 8586",
            null
    );

    private static final Librarian librarian2= LibrarianFactory.createLibrarian(
            "2",
            "Martina Brant",
            "3768 Maxwell Street",
            "123 745 1504",
            null
    );

    private static final Librarian librarian3= LibrarianFactory.createLibrarian(
            "3",
            "Tobias Norwood",
            "1839 West Fork Street",
            "123 399 5198",
            null
    );

    private final Library_Librarian LL1 = Library_LibrarianFactory.createLibrary_Librarian("5987", library1, librarian1);
    private final Library_Librarian LL2 = Library_LibrarianFactory.createLibrary_Librarian("5986",library2,librarian2);
    private final Library_Librarian LL3 = Library_LibrarianFactory.createLibrary_Librarian("8745",library3,librarian3);

    @Test
    void a_save(){
        System.out.println("Created: ");
        Library_Librarian created1 = service.save(LL1);
        assertNotNull(created1);
        System.out.println(created1);

        Library_Librarian created2 = service.save(LL2);
        assertNotNull(created2);
        System.out.println(created2);

        Library_Librarian created3 = service.save(LL3);
        assertNotNull(created3);
        System.out.println(created3);
    }

    @Test
    void b_read(){
        Library_Librarian read = service.read(LL1.getId());
        assertEquals(read.getId(), LL1.getId());
        System.out.println("Read: " + read);
    }

    @Test
    void c_delete(){
        boolean success = service.delete(library2.getId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

}