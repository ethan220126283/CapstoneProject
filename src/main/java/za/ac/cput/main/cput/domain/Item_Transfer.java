package za.ac.cput.main.cput.domain;
/*
    Item_Transfer.domain.java
    Lana Africa (216166640)
    Capstone Project - Domain Entity
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
public class Item_Transfer implements Serializable {
    @Id
    @GeneratedValue
    private String item_id;
    private int library_id_from, library_id_to;
    private Date transfer_date;

    protected Item_Transfer(){}
    private Item_Transfer(Builder builder){
        this.item_id = builder.item_id;
        this.library_id_from = builder.library_id_from;
        this.library_id_to = builder.library_id_to;
        this.transfer_date = builder.transfer_date;
    }
    public String getItem_id() {
        return item_id;
    }

    public int getLibrary_id_from() {
        return library_id_from;
    }

    public int getLibrary_id_to() {
        return library_id_to;
    }

    public Date getTransfer_date() {
        return transfer_date;
    }

    @Override
    public String toString() {
        return "Item_Transfer{" +
                "item_id='" + item_id + '\'' +
                ", library_id_from=" + library_id_from +
                ", library_id_to=" + library_id_to +
                ", transfer_date=" + transfer_date +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item_Transfer item_transfer = (Item_Transfer) obj;
        return item_id.equals(item_transfer.item_id) && Objects.equals(library_id_from, item_transfer.library_id_from)
                && Objects.equals(library_id_to, item_transfer.library_id_to)
                && Objects.equals(transfer_date, item_transfer.transfer_date);
    }

    @Override
    public int hashCode(){
        return Objects.hash(item_id, library_id_from, library_id_to, transfer_date);
    }

    public static class Builder{
        private String item_id;
        private int library_id_from, library_id_to;
        private Date transfer_date;

        public Builder Item_id(String item_id){
            this.item_id = item_id;
            return this;
        }
        public Builder Library_id_from(int library_id_from){
            this.library_id_from = library_id_from;
            return this;
        }
        public Builder Library_id_to(int library_id_to){
            this.library_id_to = library_id_to;
            return this;
        }
        public Builder Transfer_date(Date transfer_date){
            this.transfer_date = transfer_date;
            return this;
        }

        public Builder copy(Item_Transfer item_transfer){
            this.item_id=item_transfer.item_id;
            this.library_id_from=item_transfer.library_id_from;
            this.library_id_to=item_transfer.library_id_to;
            this.transfer_date=item_transfer.transfer_date;
            return this;
        }
        public Item_Transfer build(){
            return new Item_Transfer(this);
        }
    }
}