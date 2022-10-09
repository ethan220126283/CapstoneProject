package za.ac.cput.library_management.domain;

import javax.persistence.*;

@Entity
@Table(name = "library_librarian")
public class Library_Librarian {
    @Id
    @Column(name = "libary_librarian_id", nullable = false)
    private String id;

    @ManyToOne
    @JoinColumn(name = "library_id")
    private Library library;

    @ManyToOne
    @JoinColumn(name = "librarian_id")
    private Librarian librarian;

    //Private constructor
    protected Library_Librarian() {}

    private Library_Librarian(Builder builder) {
        this.id = builder.id;
        this.library = builder.library;
        this.librarian = builder.librarian;
    }
    public static class Builder {

        //Builder Attributes
        private String id;
        private Library library;
        private Librarian librarian;

        //Builder Constructor
        public Builder() {}

        //Builder Returns
        public Builder theirId(String id) {
            this.id = id;
            return this;
        }

        public Builder theirLibrary(Library library) {
            this.library = library;
            return this;
        }

        public Builder theirLibrarian(Librarian librarian) {
            this.librarian = librarian;
            return this;
        }

        //Build Method
        public Library_Librarian build() {
            Library_Librarian library_librarian = new Library_Librarian();
            library_librarian.id = this.id;
            library_librarian.library = this.library;
            library_librarian.librarian = this.librarian;
            return library_librarian;
        }
    }

    //Getters
    public String getId() {
        return id;
    }

    public Library getLibrary() {
        return library;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    //toString
    @Override
    public String toString() {
        return "Library_Librarian{" +
                "id='" + id + '\'' +
                ", library=" + library +
                ", librarian=" + librarian +
                '}';
    }
}