package za.ac.cput.factory;
/*
    BookLineFactoryTest.factoryTest.java
    Lana Africa (216166640)
    Capstone Project - Factory Test
*/
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.BookLine;
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