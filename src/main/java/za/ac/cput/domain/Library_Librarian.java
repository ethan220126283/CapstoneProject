package za.ac.cput.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Library_Librarian implements Serializable {

    //Class Attributes
    @Id
    @Column(name = "librarylibrarian_id")
    private int library_id;
    private int librarian_id;

    //Private constructor
    protected Library_Librarian() {
    }

    private Library_Librarian(Builder builder) {
        this.library_id = builder.library_id;
        this.librarian_id = builder.librarian_id;
    }

    public static class Builder {

        //Builder Attributes
        private int library_id;
        private int librarian_id;

        //Builder Constructor
        public Builder() {
        }

        //Builder Returns
        public Library_Librarian.Builder libraryId(int library_id) {
            this.library_id = library_id;
            return this;
        }

        public Library_Librarian.Builder librarianId(int librarian_id) {
            this.librarian_id = librarian_id;
            return this;
        }

        //Build Method
        public Library_Librarian build() {
            Library_Librarian library_librarian = new Library_Librarian();
            library_librarian.library_id = this.library_id;
            library_librarian.librarian_id = this.librarian_id;
            return library_librarian;
        }

        //Getters
        public int getLibrary_Id() {
            return library_id;
        }

        public int getLibrarian_id() {
            return librarian_id;
        }


        //toString Method
        @Override
        public String toString() {
            return
                    "Library: library_Id: " +
                            library_id + ", library_Name: " +
                            librarian_id;
        }
    }
}