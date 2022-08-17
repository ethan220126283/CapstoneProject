package za.ac.cput.domain;

public class Library {
    
    //Class Attributes
    private int library_Id;
    private String library_Name;
    private String library_Address;
    private String library_Tel;

    //Private Constructor for Library
    private Library() {}

    public static class Builder {

        //Builder Attributes
        private int library_Id;
        private String library_Name;
        private String library_Address;
        private String library_Tel;

        //Builder Constructor
        public Builder() {}

        //Builder Returns
        public Builder theirLibrary_Id(int library_Id) {
            this.library_Id = library_Id;
            return this;
        }

        public Builder theirLibrary_Name(String library_Name) {
            this.library_Name = library_Name;
            return this;
        }

        public Builder theirLibrary_Address(String library_Address) {
            this.library_Address = library_Address;
            return this;
        }

        public Builder theirLibrary_Tel(String library_Tel) {
            this.library_Tel = library_Tel;
            return this;
        }

        //Build Method
        public Library build() {
            Library library = new Library();
            library.library_Id = this.library_Id;
            library.library_Name = this.library_Name;
            library.library_Address = this.library_Address;
            library.library_Tel = this.library_Tel;
            return library;
        }
    }

    //Getters
    public int getLibrary_Id() {
        return library_Id;
    }

    public String getLibrary_Name() {
        return library_Name;
    }

    public String getLibrary_Address() {
        return library_Address;
    }

    public String getLibrary_Tel() {
        return library_Tel;
    }

    //toString Method
    @Override
    public String toString() {
        return 
        "Library: library_Id: " +
        library_Id + ", library_Name: " +
        library_Name + ", library_Address: " +
        library_Address + ", library_Tel: " +
        library_Tel;
    }
}
