package za.ac.cput.library_management.factory;

import za.ac.cput.library_management.domain.Bookline;
import za.ac.cput.library_management.domain.Item;
import za.ac.cput.library_management.domain.Library;
import za.ac.cput.library_management.domain.Member;
import za.ac.cput.library_management.util.Helper;

import java.util.Date;

/*
    BookLineFactory.factory.java
    Lana Africa (216166640)
    Capstone Project - Factory
 */
public class BooklineFactory {
    public static Bookline createBookline(String id, Library library, Item item, Member member, Date borrow_date, Date due_date, Date return_date) {
        Helper.isNullorEmptyObject(id);
        Helper.isNullorEmptyObject(library);
        Helper.isNullorEmptyObject(item);
        Helper.isNullorEmptyObject(member);
        Helper.getDateAndTimeSeparate(borrow_date);
        return new Bookline.Builder().theirId(id).theirLibrary(library).theirItem(item).theirMember(member).theirBorrow_Date(borrow_date).theirDue_Date(due_date).theirReturn_Date(return_date)
                .build();
    }
}
