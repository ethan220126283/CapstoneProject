package za.ac.cput.main.cput.factory;
/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       27/09/2022
 */



import za.ac.cput.main.cput.domain.Member;
import za.ac.cput.main.cput.util.Helper;

public class MemberFactory {

    public static Member createMember(int member_id, String member_name, String member_address, String member_tel, String member_status ){

        if (Helper.isNullorEmpty(member_address ) || Helper.isZero(member_id) || Helper.isNullorEmpty(member_name) || Helper.isNullorEmpty( member_tel ) || Helper.isNullorEmpty( member_status )){
            throw new IllegalArgumentException("member id, name , tell, status and address are manditory");
        }

        return new Member.Builder()
                .setMember_id(member_id)
                .setMember_name(member_name)
                .setMember_status(member_status)
                .setMember_address(member_address)
                .setMember_status( member_status)
                .build();
    }

}
