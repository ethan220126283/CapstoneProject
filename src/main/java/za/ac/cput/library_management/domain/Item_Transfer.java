package za.ac.cput.library_management.domain;

/*
    Item_Transfer.domain.java
    Lana Africa (216166640)
    Capstone Project - Domain Entity
 */

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "item_transfer")
public class Item_Transfer {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @ManyToOne
    @JoinColumn(name = "library_id_to_")
    private Library library_to;

    @ManyToOne
    @JoinColumn(name = "library_id_from")
    private Library library_from;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @Temporal(TemporalType.DATE)
    @Column(name = "transfer_date")
    private Date transfer_date;

    protected Item_Transfer(){}

    private Item_Transfer(Builder builder){
        this.id = builder.id;
        this.item = builder.item;
        this.library_from = builder.library_from;
        this.library_to = builder.library_to;
        this.transfer_date = builder.transfer_date;
    }

    public String getId() {return id;}

    public Item getItem() {return item;}

    public Library getLibrary_From() {return library_from;}

    public Library getLibrary_To() {return library_to;}

    public Date getTransfer_Date() {return transfer_date;}

    @Override
    public String toString() {
        return "Item_Transfer{" +
                "id='" + id + '\'' +
                ", library_to=" + library_to +
                ", library_from=" + library_from +
                ", item=" + item +
                ", transfer_date=" + transfer_date +
                '}';
    }

    public static class Builder{

        private String id;
        private Item item;
        private Library library_from, library_to;
        private Date transfer_date;

        public Builder theirId(String id){
            this.id = id;
            return this;
        }

        public Builder theirItem(Item item){
            this.item = item;
            return this;
        }
        public Builder theirLibrary_From(Library library_from){
            this.library_from = library_from;
            return this;
        }
        public Builder theirLibrary_To(Library library_to){
            this.library_to = library_to;
            return this;
        }
        public Builder theirTransfer_Date(Date transfer_date){
            this.transfer_date = transfer_date;
            return this;
        }

        public Builder copy(Item_Transfer item_transfer){
            this.id=item_transfer.id;
            this.item=item_transfer.item;
            this.library_from=item_transfer.library_from;
            this.library_to=item_transfer.library_to;
            this.transfer_date=item_transfer.transfer_date;
            return this;
        }
        public Item_Transfer build(){
            return new Item_Transfer(this);
        }
    }
}