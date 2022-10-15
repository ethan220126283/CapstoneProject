package za.ac.cput.library_management.domain;

/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       22/09/2022
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "library")
public class Library {
    @Id
    @Column(name = "library_id", nullable = false)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "tel")
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
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTel() {
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

    //Equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return id.equals(library.id) && name.equals(library.name) && Objects.equals(address, library.address) && Objects.equals(tel, library.tel);
    }

    //hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, tel);
    }
}