package za.ac.cput.main.cput.domain;
//import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

/*   Name:       Darryll Merkeur
 *   Student#:   220253595
 *   Date:       21/09/2022
 */

@Entity
public class Item_Type {
    //@NotNull
    @Id
    @GeneratedValue
    private int type_id;
    //@Embedded
    private String item_id;

    protected Item_Type(){

    }
    private Item_Type(Builder builder){
        this.type_id = builder.type_id;
        this.item_id = builder.item_id;
    }

    public int getType_id() {
        return type_id;
    }

    public String getItem_id() {
        return item_id;
    }

    @Override
    public String toString() {
        return "Item_Type{" +
                "type_id=" + type_id +
                ", item_id='" + item_id + '\'' +
                '}';
    }

    public static class Builder{
        private int type_id;
        private String item_id;

        public Builder setType_id(int type_id) {
            this.type_id = type_id;
            return this;
        }

        public Builder setItem_id(String item_id) {
            this.item_id = item_id;
            return this;
        }
        public Builder copy(Item_Type item_type){
            this.type_id = item_type.type_id;
            this.item_id = item_type.item_id;
            return this;
        }
        public Item_Type build(){
            return new Item_Type(this);
        }
    }
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item_Type item_type = (Item_Type) o;
        return item_type.equals(item_type.type_id);
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(type_id);
    }

}
