package za.ac.cput.library_management.factory;

import za.ac.cput.library_management.domain.Library;
import za.ac.cput.library_management.domain.Library_Member;
import za.ac.cput.library_management.domain.Member;
import za.ac.cput.library_management.util.Helper;

public class Library_MemberFactory {

    public static Library_Member createLibrary_Member(String id, Library library, Member member){
        if(Helper.isNullorEmptyObject(library) ||   Helper.isNullorEmptyObject(member) || Helper.isNullorEmpty(id) ){
            throw new IllegalArgumentException("missing mandatory attribute");
        }
        return new Library_Member.Builder()
                .setId(id)
                .setMember(member)
                .setLibrary(library)
                .build();
    }
}
