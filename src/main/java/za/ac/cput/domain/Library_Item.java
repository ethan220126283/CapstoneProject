package za.ac.cput.domain;

/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       30/09/2022
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Library_Item implements Serializable {

    @Id
    private int library_id;
    @Id
    private String item_id;

    //Protected constructor for Library_Item
    protected Library_Item() {}

    private Library_Item(Builder builder) {
        this.library_id = builder.library_id;
        this.item_id = builder.item_id;
    }

    public static class Builder {
        //Builder attributes
        private int library_id;
        private String item_id;

        //Constructor for Builder class
        public Builder() {}

        //Returns for builder
        public Builder theirLibrary_Id(int library_id) {
            this.library_id = library_id;
            return this;
        }

        public Builder theirItem_Id(String item_id) {
            this.item_id = item_id;
            return this;
        }

        //Build method
        public Library_Item build() {
            Library_Item library_item = new Library_Item();
            library_item.library_id = this.library_id;
            library_item.item_id = this.item_id;
            return library_item;
        }
    }

    //Getters
    public int getLibrary_id() {return library_id;}

    public String getItem_id() {return item_id;}

    //toString method
    @Override
    public String toString() {
        return "Library_Item{" +
                "library_id=" + library_id +
                ", item_id='" + item_id + '\'' +
                '}';
    }

    //equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library_Item that = (Library_Item) o;
        return library_id == that.library_id && item_id.equals(that.item_id);
    }

    //hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(library_id, item_id);
    }
}
