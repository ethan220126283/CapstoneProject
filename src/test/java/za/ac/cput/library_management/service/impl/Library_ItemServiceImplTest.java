package za.ac.cput.library_management.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.library_management.domain.Item;
import za.ac.cput.library_management.domain.Library;
import za.ac.cput.library_management.domain.Library_Item;
import za.ac.cput.library_management.factory.ItemFactory;
import za.ac.cput.library_management.factory.LibraryFactory;
import za.ac.cput.library_management.factory.Library_ItemFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class Library_ItemServiceImplTest {

    @Autowired
    private Library_ItemServiceImpl service;

    private static final Library library1 = LibraryFactory.createLibrary(
            "11",
            "Green Street Library",
            "1 Green Street",
            "021 345 2342"
    );

    private static final Library library2 = LibraryFactory.createLibrary(
            "12",
            "Blue Street Library",
            "2 Blue Street",
            "021 367 5932"
    );

    private static final Library library3 = LibraryFactory.createLibrary(
            "13",
            "Red Street Library",
            "3 Red Street",
            "021 857 3621"
    );

    private static final Item item1 = ItemFactory.createItem(
            "11",
            "Lord of the Rings",
            "J.R.R Tolkein",
            "Fantasy",
            "Available"
    );

    private static final Item item2 = ItemFactory.createItem(
            "12",
            "Game of Thrones",
            "George Martin",
            "Fantasy",
            "Available"
    );

    private static final Item item3 = ItemFactory.createItem(
            "13",
            "Normal People",
            "Sally Rooney",
            "Drama",
            "Unavailable"
    );

    private static final Library_Item library_item1 = Library_ItemFactory.createLibrary_Item("1",library1,item1);
    private static final Library_Item library_item2 = Library_ItemFactory.createLibrary_Item("2",library2,item2);
    private static final Library_Item library_item3 = Library_ItemFactory.createLibrary_Item("3",library3,item3);

    @Test
    void a_save() {
        System.out.println("Created: ");
        Library_Item created1 = service.save(library_item1);
        assertNotNull(created1);
        System.out.println(created1);

        Library_Item created2 = service.save(library_item2);
        assertNotNull(created2);
        System.out.println(created2);

        Library_Item created3 = service.save(library_item3);
        assertNotNull(created3);
        System.out.println(created3);
    }

    @Test
    void b_read() {
        Library_Item read = service.read(library_item2.getId());
        assertEquals(read.getId(), library_item2.getId());
        System.out.println("Read: " + read);
    }

    @Test
    void c_delete() {
        boolean success = service.delete(library_item1.getId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }
}