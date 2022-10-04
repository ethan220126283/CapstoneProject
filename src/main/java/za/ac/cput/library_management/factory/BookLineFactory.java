package za.ac.cput.library_management.factory;
/*
    BookLineFactory.factory.java
    Lana Africa (216166640)
    Capstone Project - Factory
 */
import za.ac.cput.library_management.domain.BookLine;
import za.ac.cput.library_management.util.Helper;
import java.util.Date;

public class BookLineFactory {
    public static BookLine build(int bookLine_id, int library_id, String item_id, int member_id, Date borrow_date, Date due_date, Date return_date){
        Helper.isZero(bookLine_id);
        Helper.isZero(library_id);
        Helper.isNullorEmpty(item_id);
        Helper.isZero(member_id);
        Helper.getDateAndTimeSeparate(borrow_date);
        return new BookLine.Builder().BookLine_id(bookLine_id).Library_id(library_id).Item_id(item_id).Member_id(member_id).Borrow_date(borrow_date).Due_date(due_date).Return_date(return_date)
                .build();
    }
}