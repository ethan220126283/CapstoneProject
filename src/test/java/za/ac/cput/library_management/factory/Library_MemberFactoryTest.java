package za.ac.cput.library_management.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.library_management.domain.Library;
import za.ac.cput.library_management.domain.Library_Member;
import za.ac.cput.library_management.domain.Member;

import static org.junit.jupiter.api.Assertions.*;

class Library_MemberFactoryTest {

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


    @Test
    void createLibrary_Member() {

        Library_Member library_member = Library_MemberFactory.createLibrary_Member("1",library,member);
        System.out.println(library_member.toString());
        assertNotNull(library_member);

    }
}