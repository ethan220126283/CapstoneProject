package za.ac.cput.library_management.service.impl;

/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       05/10/2022
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.library_management.domain.Item;
import za.ac.cput.library_management.factory.ItemFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class ItemServiceImplTest {

    @Autowired
    private ItemServiceImpl service;

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

    @Test
    void a_save() {
        System.out.println("Created: ");
        Item created1 = service.save(item1);
        assertNotNull(created1);
        System.out.println(created1);

        Item created2 = service.save(item2);
        assertNotNull(created2);
        System.out.println(created2);

        Item created3 = service.save(item3);
        assertNotNull(created3);
        System.out.println(created3);
    }

    @Test
    void b_read() {
        Item read = service.read(item2.getId());
        assertEquals(read.getId(), item2.getId());
        System.out.println("Read: " + read);
    }

    @Test
    void c_delete() {
        boolean success = service.delete(item1.getId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

}