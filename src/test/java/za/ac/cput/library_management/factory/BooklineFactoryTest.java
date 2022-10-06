package za.ac.cput.library_management.factory;
/*
    BookLineFactoryTest.factoryTest.java
    Lana Africa (216166640)
    Capstone Project - Factory Test
*/
import org.junit.jupiter.api.Test;
import za.ac.cput.library_management.domain.Bookline;
import za.ac.cput.library_management.domain.Item;
import za.ac.cput.library_management.domain.Library;
import za.ac.cput.library_management.domain.Member;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class BooklineFactoryTest {

    Library library = LibraryFactory.createLibrary(
            "1",
            "James Maxwell Library",
            "123 Brown Street",
            "072 123 4567"
    );

    Member member = MemberFactory.createMember(
            "1",
            "John",
            "26 West Street Strand",
            "0219875036",
            "active"
    );

    Item item = ItemFactory.createItem(
            "1",
            "Narnia",
            "C.S. Lewis",
            "Fantasy",
            "Available"
    );

    @Test
    void buildWorking() {
        Bookline bookLine = BooklineFactory.createBookline
                ("1", library, item, member, new Date(), null ,null);
        System.out.println(bookLine);
    }

}