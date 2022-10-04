package za.ac.cput.library_management.factory;
/*
    Item_Transfer.factoryTest.java
    Lana Africa (216166640)
    Capstone Project - Factory Test
*/
import org.junit.jupiter.api.Test;
import za.ac.cput.library_management.domain.Item_Transfer;
import za.ac.cput.library_management.factory.Item_TransferFactory;

import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class Item_TransferFactoryTest {


    @Test
    void buildWorking() {
        Item_Transfer item_transfer = Item_TransferFactory.build
                ("1", 10, 20, new Date());
        System.out.println(item_transfer);
        assertNotNull(item_transfer);
    }

    @Test
    void returnDate() {
        Item_Transfer item_transfer = Item_TransferFactory.build
                (null, 0, 0, new Date());
        System.out.println(item_transfer);
    }
}