package za.ac.cput.factory;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Library_Member;
import org.junit.jupiter.api.Assertions;
import za.ac.cput.domain.Member;


class Library_MemberFactoryTest {
    @Test

    public void testCreateLibraryMember() {
        Library_Member library_member = Library_MemberFactory.createLibraryMember(151, 5464);

        System.out.println(library_member.toString());
        assertNotNull(library_member);

    }

    @Test

    public void testCreateLibraryMembersWithNullValues(){
        IllegalArgumentException thrown = Assertions
                .assertThrows(IllegalArgumentException.class, () -> {
                    Library_Member library_member = Library_MemberFactory.createLibraryMember(0,0);
                    System.out.println(library_member.toString());
                 },"IllegalArgumentException was expected");

        assertEquals("attributes cannot be empty or null.",thrown.getMessage());
        }
}