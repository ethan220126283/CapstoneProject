package za.ac.cput.library_management.service.impl;
/*
    Item_TransferServiceImplTest.java
    Lana Africa (216166640)
    Capstone Project - Service Implementation Test
*/
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.library_management.domain.Item;
import za.ac.cput.library_management.domain.Item_Transfer;
import za.ac.cput.library_management.domain.Library;
import za.ac.cput.library_management.factory.ItemFactory;
import za.ac.cput.library_management.factory.Item_TransferFactory;
import za.ac.cput.library_management.factory.LibraryFactory;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class Item_TransferServiceImplTest {
    private static final Item item = ItemFactory.createItem("1", "Lord of the Rings", "J.R.R Tolkien", "Fantasy", "Available"
    );

    private static final Library library1 = LibraryFactory.createLibrary("1","1st Library","1st Street","021 123 4567"
    );

    private static final Library library2 = LibraryFactory.createLibrary("2","2nd Library","2nd Street","021 987 6543"
    );
    @Autowired
    private Item_TransferServiceImpl service;


    private static final Item_Transfer item_transfer1 = Item_TransferFactory.createItem_Transfer(
            "1",item, library1, library2, new Date());
    private static final Item_Transfer item_transfer2 = Item_TransferFactory.createItem_Transfer("2", item, library1,library2,new Date());
    private static final Item_Transfer item_transfer3 = Item_TransferFactory.createItem_Transfer("3", item, library1,library2, new Date());

    @Test
    void a_save() {
        System.out.println("Created: ");
        Item_Transfer created = service.save(item_transfer1);
        assertNotNull(created);
        System.out.println(created);

        Item_Transfer created2 = service.save(item_transfer2);
        assertNotNull(created2);
        System.out.println(created2);

        Item_Transfer created3 = service.save(item_transfer3);
        assertNotNull(created3);
        System.out.println(created3);

    }

    @Test
    void b_read() {
        Item_Transfer read = service.read(item_transfer1.getId());
        assertEquals(read.getId(), item_transfer1.getId());
        System.out.println("Read: " + read);
    }

    @Test
    void c_delete() {
    boolean success = service.delete((item_transfer1.getId()));
    assertTrue(success);
    System.out.println("Deleted: " + success);
    }
}