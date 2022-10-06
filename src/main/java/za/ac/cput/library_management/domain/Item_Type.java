package za.ac.cput.library_management.domain;

/*   Name:       Darryll Merkeur
 *   Student#:   220253595
 *   Date:       21/09/2022
 */


import javax.persistence.*;

@Entity
@Table(name = "item_type")
public class Item_Type {
    @Id
    @Column(name = "item_type_id", nullable = false)
    private String id;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "type_type_id")
    private Type type;

    protected Item_Type(){}

    private Item_Type(Builder builder){
        this.id = builder.id;
        this.item = builder.item;
        this.type = builder.type;
    }

    public String getId() {return id;}

    public Type getType() {return type;}

    public Item getItem() {return item;}

    @Override
    public String toString() {
        return "Item_Type{" +
                "id='" + id + '\'' +
                ", item=" + item +
                ", type=" + type +
                '}';
    }

    public static class Builder{
        private String id;
        private Type type;
        private Item item;

        public Builder theirId(String id) {
            this.id = id;
            return this;
        }

        public Builder theirType(Type type) {
            this.type = type;
            return this;
        }

        public Builder theirItem(Item item) {
            this.item = item;
            return this;
        }

        public Builder copy(Item_Type item_type){
            this.id = item_type.id;
            this.type = item_type.type;
            this.item = item_type.item;
            return this;
        }

        public Item_Type build(){
            return new Item_Type(this);
        }
    }
}