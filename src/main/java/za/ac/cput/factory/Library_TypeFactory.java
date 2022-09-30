package za.ac.cput.factory;

/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       30/09/2022
 */

import za.ac.cput.domain.Library_Type;
import za.ac.cput.util.Helper;

public class Library_TypeFactory {

    //Factory method
    public static Library_Type createLibrary_Type(int library_id, int type_id) {

        if (Helper.isZero(library_id) || Helper.isZero(type_id)){
            throw new IllegalArgumentException("");
        }

        //Return
        return new Library_Type.Builder()
                .theirLibrary_Id(library_id)
                .theirType_Id(type_id)
                .build();
    }
}
