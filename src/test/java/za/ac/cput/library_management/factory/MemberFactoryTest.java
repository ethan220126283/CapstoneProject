package za.ac.cput.library_management.factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import za.ac.cput.library_management.domain.Member;
import org.junit.jupiter.api.Assertions;
import za.ac.cput.library_management.factory.MemberFactory;


class MemberFactoryTest {

    @Test

    public void testCreateMember(){

        Member member = MemberFactory.createMember(985,"John","26 West Street Strand","0219875036","active");
        System.out.println(member.toString());
        assertNotNull(member);

        }

    @Test

    public void testCreateMemberWithNullValues(){
        IllegalArgumentException thrown = Assertions
                .assertThrows(IllegalArgumentException.class, () -> {
                    Member member = MemberFactory.createMember(0, "","","","");
                    System.out.println(member.toString());
                },"IllegalArgumentException was expected");
        assertEquals("attributes cannot be empty or null.",thrown.getMessage());
    }

}