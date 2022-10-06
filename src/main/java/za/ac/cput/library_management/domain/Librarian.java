package za.ac.cput.library_management.domain;

/*   Name:       Faeedh Daniels
 *   Student#:   219174288
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "librarian")
public class Librarian {
    @Id
    @Column(name = "librarian_id", nullable = false)
    private String id;

    @Column(name = "tel")
    private String tel;

    @Column(name = "address")
    private String address;

    @Column(name = "name")
    private String name;

    //Private constructor
    protected Librarian() {}

    private Librarian(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address;
        this.tel = builder.tel;
    }

    //Builder Class
    public static class Builder {

        //Builder Attributes
        private String id;
        private String name;
        private String address;
        private String tel;

        //Builder constructor
        public Builder() {}

        //Builder returns
        public Builder theirID (String id) {
            this.id = id;
            return this;
        }

        public Builder theirName (String name) {
            this.name = name;
            return this;
        }

        public Builder theirAddress (String address) {
            this.address = address;
            return this;
        }

        public Builder theirTel (String tel) {
            this.tel = tel;
            return this;
        }

        //Builder method
        public Librarian build() {
            Librarian librarian = new Librarian();
            librarian.id = this.id;
            librarian.name = this.name;
            librarian.address = this.address;
            librarian.tel = this.tel;
            return librarian;
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

    @Override
    public String toString() {
        return "Librarian{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

}