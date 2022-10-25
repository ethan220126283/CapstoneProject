package za.ac.cput.library_management.api;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.library_management.domain.Librarian;
import za.ac.cput.library_management.domain.Member;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class LibrarianAPITest {

    @Autowired LibrarianAPI api;

    @Test
    void a_addLibrarian() {
        api.addLibrarian("17", "Debby Powe", "3214 Central Avenue", "123 416 2107", new char[]{'D'});
    }

    @Test
    void b_getLibrarianById() {
        Librarian result = api.getLibrarianById("17");
        System.out.println(result);
        assertEquals("17",result.getId());
    }

    @Test
    void c_getLibrarians() {
        List<Librarian> librarians = api.getLibrarians();
        System.out.println(librarians);
        assertNotNull(librarians);
    }

    @Test
    void d_getLibrarianByName() {
        Librarian result = api.getLibrarianByName("Debby Powe");
        System.out.println(result);
        assertEquals("Debby Powe", result.getName());
    }

    @Test
    void e_deleteLibrarianById() {
        assertTrue(api.deleteLibrarianById("17"));
    }
}
