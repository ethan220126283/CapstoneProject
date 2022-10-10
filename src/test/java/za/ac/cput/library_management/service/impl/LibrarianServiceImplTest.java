package za.ac.cput.library_management.service.impl;

/*   Name:       Mogammad Faeedh Daniels
 *   Student#:   219174288
 *   LibrarianServiceImplTest.java
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.library_management.domain.Librarian;
import za.ac.cput.library_management.factory.LibrarianFactory;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class LibrarianServiceImplTest {

    @Autowired
    private LibrarianServiceImpl service;

    private static final Librarian librarian1= LibrarianFactory.createLibrarian(
            "1",
            "Franko Otiento",
            "1752 Gandy Street",
            "123 465 8586"
    );

    private static final Librarian librarian2= LibrarianFactory.createLibrarian(
            "2",
            "Martina Brant",
            "3768 Maxwell Street",
            "123 745 1504"
    );
    private static final Librarian librarian3= LibrarianFactory.createLibrarian(
            "3",
            "Tobias Norwood",
            "1839 West Fork Street",
            "123 399 5198"
    );

    @Test
    void a_save(){
        System.out.println("Created: ");
        Librarian created1 = service.save(librarian1);
        assertNotNull(created1);
        System.out.println(created1);

        Librarian created2 = service.save(librarian2);
        assertNotNull(created1);
        System.out.println(created2);

        Librarian created3 = service.save(librarian3);
        assertNotNull(created1);
        System.out.println(created3);
    }

    @Test
    void b_read(){
        Librarian read = service.read(librarian2.getId());
        assertEquals(read.getId(), librarian2.getId());
        System.out.println("Read: " + read);
    }

    @Test
    void c_delete(){
        boolean success = service.delete(librarian1.getId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

}
