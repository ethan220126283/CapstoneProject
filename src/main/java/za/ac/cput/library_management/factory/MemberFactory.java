package za.ac.cput.library_management.factory;

/*   Name:       Adrian Bennett
 *   Student#:   214075982
 */

import za.ac.cput.library_management.domain.Member;
import za.ac.cput.library_management.util.Helper;

import java.util.UUID;

public class MemberFactory {

    public static Member createMember( String id, String name, String address, String tel, String status ){

        if (Helper.isNullorEmpty(address ) || Helper.isNullorEmpty(name) || Helper.isNullorEmpty(tel) || Helper.isNullorEmpty(status) || Helper.isNullorEmpty(id)){
            throw new IllegalArgumentException("attributes cannot be empty or null.");
        }

        return new Member.Builder()
                .setId(id)
                .setName(name)
                .setStatus(status)
                .setAddress(address)
                .setStatus(status)
                .build();
    }
}
