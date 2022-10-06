package za.ac.cput.library_management.domain;

/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       30/09/2022
 */


import javax.persistence.*;

@Entity
@Table(name = "library_type")
public class Library_Type {
    @Id
    @Column(name = "library_type_id", nullable = false)
    private String id;

    @ManyToOne
    @JoinColumn(name = "library_id")
    private Library library;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;

    protected Library_Type() {}

    private Library_Type(Builder builder) {
        this.id = builder.id;
        this.library = builder.library;
        this.type = builder.type;
    }

    //Builder class
    public static class Builder {
        //Builder attributes
        private String id;
        private Library library;
        private Type type;

        //Constructor for Builder constructor
        public Builder() {}

        //Builder returns
        public Builder theirId(String id) {
            this.id = id;
            return this;
        }

        public Builder theirLibrary(Library library) {
            this.library = library;
            return this;
        }

        public Builder theirType(Type type) {
            this.type = type;
            return this;
        }

        //Build method
        public Library_Type build() {
            Library_Type library_type = new Library_Type();
            library_type.id = this.id;
            library_type.library = this.library;
            library_type.type = this.type;
            return library_type;
        }
    }

    //Getters

    public String getId() {return id;}

    public Library getLibrary() {return library;}

    public Type getType() {return type;}

    //toString method
    @Override
    public String toString() {
        return "Library_Type{" +
                "id='" + id + '\'' +
                ", library=" + library +
                ", type=" + type +
                '}';
    }
}