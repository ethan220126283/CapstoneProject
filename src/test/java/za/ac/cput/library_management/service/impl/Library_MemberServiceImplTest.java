package za.ac.cput.library_management.service.impl;



/*   Name:       Adrian Bennett
 *   Student#:   214075982
 *   Date:       09/10/2022
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.library_management.domain.Library_Member;
import za.ac.cput.library_management.domain.Library;
import za.ac.cput.library_management.domain.Member;


import za.ac.cput.library_management.factory.LibraryFactory;
import za.ac.cput.library_management.factory.Library_MemberFactory;
import za.ac.cput.library_management.factory.MemberFactory;


import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class Library_MemberServiceImplTest {

    @Autowired
    private Library_MemberServiceImpl service;

    Library library = LibraryFactory.createLibrary(
            "1598",
            "Bellvile Library",
            "123 West Street",
            "0215985987"
    );

    Library library2 = LibraryFactory.createLibrary(
            "2589",
            "Cape Town Library",
            "77 South Street",
            "0598487563"
    );

    Library library3 = LibraryFactory.createLibrary(
            "2963",
            "Paarl Library",
            "8 North Street",
            "0220687595"
    );




    Member member = MemberFactory.createMember(
            "1",
            "Tiffany",
            "28 Titan Avernue Ottery",
            "0219875985",
            "active"
    );

    Member member2 = MemberFactory.createMember(
            "2",
            "Jeffrey",
            "15 North End Paarl",
            "0219875036",
            "active"
    );

    Member member3 = MemberFactory.createMember(
            "3",
            "Tom",
            "56 West End Sea Point",
            "0236987896",
            "active"
    );



    private final Library_Member library_member1 = Library_MemberFactory.createLibrary_Member(
            "5987",library,member);

    private final Library_Member library_member2 = Library_MemberFactory.createLibrary_Member(
            "5986",library2,member2);

    private final Library_Member library_member = Library_MemberFactory.createLibrary_Member(
            "8745",library3,member3);
    @Test

    void a_save(){
        System.out.println("Created: ");

        Library_Member created1 = service.save(library_member);
        assertNotNull(created1);
        System.out.println(created1);


        Library_Member created2 = service.save(library_member1);
        assertNotNull(created2);
        System.out.println(created2);

        Library_Member created3 = service.save(library_member2);
        assertNotNull(created3);
        System.out.println(created3);


    }



    @Test
    void b_read(){

        Library_Member read = service.read(library_member.getId());
        assertEquals(read.getId(), library_member.getId());
        System.out.println("Read: " + read);

    }


    @Test
    void c_delete(){


        boolean success = service.delete(library2.getId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }



}