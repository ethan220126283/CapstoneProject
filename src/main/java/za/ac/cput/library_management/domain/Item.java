package za.ac.cput.library_management.domain;

/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       22/09/2022
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item {
    //Attributes
    @Id
    @Column(name = "item_id", nullable = false)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    @Column(name = "genre")
    private String genre;

    @Column(name = "status")
    private String status;

    protected Item() {}

    private Item(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.author = builder.author;
        this.genre = builder.genre;
        this.status = builder.status;
    }

    //Builder Class
    public static class Builder {

        //Builder Attributes
        private String id;
        private String name;
        private String author;
        private String genre;
        private String status;

        //Builder constructor
        public Builder () {}

        //Builder returns
        public Builder theirID (String id) {
            this.id = id;
            return this;
        }

        public Builder theirName (String name) {
            this.name = name;
            return this;
        }

        public Builder theirAuthor (String author) {
            this.author = author;
            return this;
        }

        public Builder theirGenre (String genre) {
            this.genre = genre;
            return this;
        }

        public Builder theirStatus (String status) {
            this.status = status;
            return this;
        }

        //Builder method
        public Item build() {
            Item item = new Item();
            item.id = this.id;
            item.name = this.name;
            item.author = this.author;
            item.genre = this.genre;
            item.status = this.status;
            return item;
        }
    }

    //Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

}