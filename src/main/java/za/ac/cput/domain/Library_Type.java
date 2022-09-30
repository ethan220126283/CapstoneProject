package za.ac.cput.domain;

/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       30/09/2022
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Library_Type implements Serializable {

    //Attributes
    @Id
    private int library_id;
    @Id
    private int type_id;

    //Protected constructor for Library_Type
    protected Library_Type() {}

    private Library_Type(Builder builder) {
        this.library_id = builder.library_id;
        this.type_id = builder.type_id;
    }

    //Builder class
    public static class Builder {
        //Builder attributes
        private int library_id;
        private int type_id;

        //Constructor for Builder constructor
        public Builder() {}

        //Builder returns
        public Builder theirLibrary_Id(int library_id) {
            this.library_id = library_id;
            return this;
        }

        public Builder theirType_Id(int type_id) {
            this.type_id = type_id;
            return this;
        }

        //Build method
        public Library_Type build() {
            Library_Type library_type = new Library_Type();
            library_type.library_id = this.library_id;
            library_type.type_id = this.type_id;
            return library_type;
        }
    }

    //Getters
    public int getLibrary_id() {return library_id;}

    public int getType_id() {return type_id;}

    //toString
    @Override
    public String toString() {
        return "Library_Type{" +
                "library_id=" + library_id +
                ", type_id=" + type_id +
                '}';
    }

    //equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library_Type that = (Library_Type) o;
        return library_id == that.library_id && type_id == that.type_id;
    }

    //hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(library_id, type_id);
    }

}
