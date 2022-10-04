package za.ac.cput.domain;

/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       22/09/2022
 */

import javax.persistence.*;
import java.io.Serializable;

@Entity
//@Table(name = "library")
public class Library implements Serializable {
    
    //Class Attributes
    @Id
    //@GeneratedValue (strategy = GenerationType.AUTO)
    //@Column(name = "id", nullable = false)
    private String id;
    private String name;
    private String address;
    private String tel;

    //Private Constructor for Library
    protected Library() {}

    private Library(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address;
        this.tel = builder.tel;
    }

    public static class Builder {

        //Builder Attributes
        private String id;
        private String name;
        private String address;
        private String tel;

        //Builder Constructor
        public Builder() {}

        //Builder Returns
        public Builder theirId(String id) {
            this.id = id;
            return this;
        }

        public Builder theirName(String name) {
            this.name = name;
            return this;
        }

        public Builder theirAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder theirTel(String tel) {
            this.tel = tel;
            return this;
        }

        //Build Method
        public Library build() {
            Library library = new Library();
            library.id = this.id;
            library.name = this.name;
            library.address = this.address;
            library.tel = this.tel;
            return library;
        }
    }

    //Getters
    public String getLibrary_Id() {
        return id;
    }

    public String getLibrary_Name() {
        return name;
    }

    public String getLibrary_Address() {
        return address;
    }

    public String getLibrary_Tel() {
        return tel;
    }

    //toString Method
    @Override
    public String toString() {
        return 
        "Library: library_Id: " +
        id + ", library_Name: " +
        name + ", library_Address: " +
        address + ", library_Tel: " +
        tel;
    }
}
