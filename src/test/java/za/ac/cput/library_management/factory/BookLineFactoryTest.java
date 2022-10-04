package za.ac.cput.library_management.factory;
/*
    BookLineFactoryTest.factoryTest.java
    Lana Africa (216166640)
    Capstone Project - Factory Test
*/
import org.junit.jupiter.api.Test;
import za.ac.cput.library_management.domain.BookLine;
import za.ac.cput.library_management.factory.BookLineFactory;

import java.util.Date;

class BookLineFactoryTest {
    @Test
    void buildWorking() {
        BookLine bookLine = BookLineFactory.build
                (90, 10, "20", 1, new Date(), null ,null);
        System.out.println(bookLine);
    }

    @Test
    void returnDate() {
        BookLine bookLine = BookLineFactory.build
                (0, 0, null,0,new Date(), null ,null);
        System.out.println(bookLine);
    }
}