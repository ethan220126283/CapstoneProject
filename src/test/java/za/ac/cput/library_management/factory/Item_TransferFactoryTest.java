package za.ac.cput.library_management.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.library_management.domain.Item;
import za.ac.cput.library_management.domain.Item_Transfer;
import za.ac.cput.library_management.domain.Library;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class Item_TransferFactoryTest {

    private static final Item item = ItemFactory.createItem(
            "1",
            "Lord of the Rings",
            "J.R.R Tolkein",
            "Fantasy",
            "Available"
    );

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

    @Test
    void createItem_Transfer() {

        Item_Transfer item_transfer = Item_TransferFactory.createItem_Transfer(
                "1",
                item,
                library1,
                library2,
                new Date()
        );
        System.out.println(item_transfer);
        assertNotNull(item_transfer);

    }
}