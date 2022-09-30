package za.ac.cput.main.cput.factory;
/*
    Item_TransferFactory.factory.java
    Lana Africa (216166640)
    Capstone Project - Factory
 */
import za.ac.cput.main.cput.domain.Item_Transfer;
import za.ac.cput.main.cput.util.Helper;

import java.util.Date;

public class Item_TransferFactory {
    public static Item_Transfer build(String item_id, int library_id_from, int library_id_to, Date transfer_date){
        Helper.isNullorEmpty(item_id);
        Helper.isZero(library_id_from);
        Helper.isZero(library_id_to);
        Helper.getDateAndTimeSeparate(transfer_date);

        return new Item_Transfer.Builder().Item_id(item_id).Library_id_from(library_id_from).Library_id_to(library_id_to).
                Transfer_date(transfer_date).build();
    }
}