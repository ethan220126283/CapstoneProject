package za.ac.cput.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Librarian implements Serializable {

    //Class Attributes
    @Id
    @GeneratedValue
    //@Column(name = "librarian_id")
    private int id;
    private String name;
    private String address;
    private String tel;

    //Private constructor
    protected Librarian() {}

    private Librarian(Librarian.Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address;
        this.tel = builder.tel;
    }

    //Builder Class
    public static class Builder {

        //Builder Attributes
        private int id;
        private String name;
        private String address;
        private String tel;

        //Builder constructor
        public Builder() {}

        //Builder returns
        public Librarian.Builder librarian_ID (int id) {
            this.id = id;
            return this;
        }

        public Librarian.Builder librarian_Name (String name) {
            this.name = name;
            return this;
        }

        public Librarian.Builder librarian_Address (String address) {
            this.address = address;
            return this;
        }

        public Librarian.Builder librarian_Tel (String tel) {
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
    public int getLibrarian_Id() {
        return id;
    }

    public String getLibrarian_Name() {
        return name;
    }

    public String getLibrarian_Address() {
        return address;
    }

    public String getLibrarian_Tel() {
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
