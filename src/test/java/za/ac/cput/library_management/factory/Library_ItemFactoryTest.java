package za.ac.cput.library_management.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.library_management.domain.Item;
import za.ac.cput.library_management.domain.Library;
import za.ac.cput.library_management.domain.Library_Item;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class Library_ItemFactoryTest {

    Library library = LibraryFactory.createLibrary("1","Browns Public Library","123 Brownville Lane","034 234 5431");
    Item item = ItemFactory.createItem("2","Lord of the Rings", "J.R.R Tolkein","Fantasy","Available");

    @Test
    void createLibrary_Item() {

        Library_Item library_item = Library_ItemFactory.createLibrary_Item("1",library,item);
        System.out.println(library_item);
        assertNotNull(library_item);

    }
}