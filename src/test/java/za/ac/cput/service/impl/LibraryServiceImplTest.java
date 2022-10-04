package za.ac.cput.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import za.ac.cput.domain.Library;
import za.ac.cput.factory.LibraryFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest

class LibraryServiceImplTest {

    @Autowired
    private LibraryServiceImpl service;

    private static Library library1 = LibraryFactory.createLibrary(
            "1",
            "Green Street Library",
            "1 Green Street",
            "021 345 2342"
    );

    private static Library library2 = LibraryFactory.createLibrary(
            "2",
            "Blue Street Library",
            "2 Blue Street",
            "021 367 5932"
    );

    private static Library library3 = LibraryFactory.createLibrary(
            "3",
            "Red Street Library",
            "3 Red Street",
            "021 857 3621"
    );

    @Test
    void a_save() {
        System.out.println("Created: ");
        Library created1 = service.save(library1);
        assertNotNull(created1);
        System.out.println(created1);

        Library created2 = service.save(library2);
        assertNotNull(created2);
        System.out.println(created2);

        Library created3 = service.save(library3);
        assertNotNull(created3);
        System.out.println(created3);
    }

    @Test
    void b_read() {
        Library read = service.read(library2.getLibrary_Id());
        assertEquals(read.getLibrary_Id(), library2.getLibrary_Id());
        System.out.println("Read: " + read);
    }

    @Test
    void f_delete() {
        boolean success = service.delete(library1.getLibrary_Id());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

}