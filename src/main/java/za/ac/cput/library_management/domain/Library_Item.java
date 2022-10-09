package za.ac.cput.library_management.domain;

import javax.persistence.*;

@Entity
@Table(name = "library_item")
public class Library_Item {
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "library_id")
    private Library library;

    @Id
    @Column(name = "library_item_id", nullable = false)
    private String id;

    //Protected constructor for Library_Item
    protected Library_Item() {
    }

    private Library_Item(Builder builder) {
        this.id = builder.id;
        this.library = builder.library;
        this.item = builder.item;
    }


    public static class Builder {
        //Builder attributes
        private String id;
        private Library library;
        private Item item;

        //Constructor for Builder class
        public Builder() {
        }

        //Returns for builder
        public Builder theirId(String id) {
            this.id = id;
            return this;
        }

        public Builder theirLibrary(Library library) {
            this.library = library;
            return this;
        }

        public Builder theirItem(Item item) {
            this.item = item;
            return this;
        }

        //Build method
        public Library_Item build() {
            Library_Item library_item = new Library_Item();
            library_item.id = this.id;
            library_item.library = this.library;
            library_item.item = this.item;
            return library_item;
        }

    }

    //Getters
    public String getId() {
        return id;
    }

    public Library getLibrary() {
        return library;
    }

    public Item getItem() {
        return item;
    }

    //toString method
    @Override
    public String toString() {
        return "Builder{" +
                "id='" + id + '\'' +
                ", library=" + library +
                ", item=" + item +
                '}';

    }
}