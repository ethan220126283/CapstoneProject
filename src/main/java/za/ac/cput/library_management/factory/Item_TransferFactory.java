package za.ac.cput.library_management.factory;

import za.ac.cput.library_management.domain.Item;
import za.ac.cput.library_management.domain.Item_Transfer;
import za.ac.cput.library_management.domain.Library;
import za.ac.cput.library_management.util.Helper;

import java.util.Date;

/*
    Item_TransferFactory.factory.java
    Lana Africa (216166640)
    Capstone Project - Factory
 */
public class Item_TransferFactory {
    public static Item_Transfer createItem_Transfer(String id, Item item, Library library_from, Library library_to, Date transfer_date){
        Helper.isNullorEmptyObject(item);
        Helper.isNullorEmptyObject(library_from);
        Helper.isNullorEmptyObject(library_to);
        Helper.getDateAndTimeSeparate(transfer_date);

        return new Item_Transfer.Builder()
                .theirId("1")
                .theirItem(item)
                .theirLibrary_From(library_from)
                .theirLibrary_To(library_to)
                .theirTransfer_Date(transfer_date)
                .build();
    }
}
