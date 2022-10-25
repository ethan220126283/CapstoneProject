package za.ac.cput.library_management.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.cput.library_management.domain.Bookline;
import za.ac.cput.library_management.domain.Item;
import za.ac.cput.library_management.domain.Library;
import za.ac.cput.library_management.domain.Member;
import za.ac.cput.library_management.factory.BooklineFactory;
import za.ac.cput.library_management.service.impl.BooklineServiceImpl;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Component
public class BooklineAPI {
    private BooklineServiceImpl booklineService;

    @Autowired
    BooklineAPI(BooklineServiceImpl booklineService) {
        this.booklineService = booklineService;
    }

    //getBooklines() //returns Objects
    public Object[][] getBooklineTable() {

        List<Bookline> booklines = booklineService.getAll();
        Object[][] objects = new Object[booklines.size()][7];

        for (int i = 0; i < booklines.size(); i++) {
            Bookline bookline = booklines.get(i);
            if (bookline == null) {
                objects[i] = null;
            } else {
                objects[i][0] = bookline.getId();
                objects[i][1] = bookline.getMember();
                objects[i][2] = bookline.getItem();
                objects[i][3] = bookline.getLibrary();
                objects[i][4] = bookline.getDue_Date();
                objects[i][5] = bookline.getBorrow_Date();
                objects[i][6] = bookline.getReturn_Date();
            }
        }
        return objects;
    }

    //getBooklineById(String id) // returns Bookline
    public Bookline getId(String id) {
        return booklineService.read(id);
    }

    //getBooklineByLibrary
    public Bookline getBooklineByLibrary(Library library) {
        List<Bookline> booklines = booklineService.getAll();
        Bookline m = null;

        for (Bookline bookline : booklines) {
            if (Objects.equals(bookline.getLibrary(), library)) {
                m = bookline;
            }
        }
        return m;
    }

    //getBooklineByItem
    public Bookline getBooklineByItem(Item item) {
        List<Bookline> booklines = booklineService.getAll();
        Bookline m = null;

        for (Bookline bookline : booklines) {
            if (Objects.equals(bookline.getItem(), item)) {
                m = bookline;
            }
        }
        return m;
    }

    //getBooklineByMembers
    public Bookline getBooklineByMember(Member member) {
        List<Bookline> booklines = booklineService.getAll();
        Bookline m = null;

        for (Bookline bookline : booklines) {
            if (Objects.equals(bookline.getMember(), member)) {
                m = bookline;
            }
        }
        return m;
    }
    //addBookline(Bookline bookline) //void
    public void save(String id, Library library, Item item, Member member, Date borrow_date, Date due_date, Date return_date) {
        Bookline bookline = BooklineFactory.createBookline("ID", library, item, member, new Date(), null, null);
        booklineService.save(bookline);
    }

    //deleteBookline(String id) //returns boolean
    public Boolean deleteById(String id) {
        return booklineService.delete(id);
    }

}
