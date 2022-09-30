package za.ac.cput.factory;
/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       27/09/2022
 */



import za.ac.cput.domain.Library_Member;
import za.ac.cput.domain.Member;
import za.ac.cput.util.Helper;



public class Library_MemberFactory {

    public static Library_Member createLibraryMember(int library_id, int member_id){
        if(Helper.isZero(library_id) ||   Helper.isZero(member_id) ){
            throw new IllegalArgumentException("library id and member id are mandatory attribute");
        }
        return new Library_Member.Builder()
                .setMember_id(member_id)
                .setLibrary_id(library_id)
                .build();
    }

}
