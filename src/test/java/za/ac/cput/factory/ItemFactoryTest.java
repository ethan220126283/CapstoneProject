package za.ac.cput.factory;

/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       27/09/2022
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Item;

import static org.junit.jupiter.api.Assertions.*;

class ItemFactoryTest {

    @Test
    void createItem() {
        Item item = ItemFactory.createItem(
                "1",
                "Narnia",
                "C.S. Lewis",
                "Fantasy",
                "Available"
        );
        System.out.println(item.toString());
        assertNotNull(item);
    }
}