package za.ac.cput.library_management.service.impl;
/*
    BooklineServiceImplTest.java
    Lana Africa (216166640)
    Capstone Project - Service Implementation Test
*/
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.library_management.domain.*;
import za.ac.cput.library_management.factory.BooklineFactory;
import za.ac.cput.library_management.factory.ItemFactory;
import za.ac.cput.library_management.factory.LibraryFactory;
import za.ac.cput.library_management.factory.MemberFactory;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class BooklineServiceImplTest {


    private static final Library library = LibraryFactory.createLibrary("1","Library Street","1st Street","021 123 4567"
    );

    private static final Member member = MemberFactory.createMember(
            "10","Joel","Wall Street","021 002 1123","active"
    );

    private static final Item item = ItemFactory.createItem(
            "1","Lord of the Rings","J.R.R Tolkien", "Fantasy", "Available");


  @Autowired
  private BooklineServiceImpl service;
  private static final Bookline bookline1 = BooklineFactory.createBookline(
          "22", library, item, member, new Date(), null, null);
  private static final Bookline bookline2 = BooklineFactory.createBookline(
            "22", library, item, member, null, null, null);
  private static final Bookline bookline3 = BooklineFactory.createBookline(
            "22", library, item, member, null, new Date(), null);

    @Test
    void a_save() {
        System.out.println("Created: ");
        Bookline created = service.save(bookline1);
        assertNotNull(created);
        System.out.println(created);

        Bookline created2 = service.save(bookline2);
        assertNotNull(created2);
        System.out.println(created2);

        Bookline created3 = service.save(bookline3);
        assertNotNull(created3);
        System.out.println(created3);

    }
    @Test
    void b_read() {
        Bookline read = service.read(bookline1.getId());
        assertEquals(read.getId(), bookline1.getId());
        System.out.println("Read: " + read);
    }

    @Test
    void c_delete() {
        boolean success = service.delete((bookline1.getId()));
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }
}