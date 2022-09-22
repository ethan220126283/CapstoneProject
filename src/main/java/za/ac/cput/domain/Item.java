package za.ac.cput.domain;

public class Item {

    //Class Attributes
    private String item_Id;
    private String item_Name;
    private String item_Author;
    private String item_Genre;
    private String item_Status;

    //Private constructor
    private Item() {}

    //Builder Class
    public class Builder {

        //Builder Attributes
        private String item_Id;
        private String item_Name;
        private String item_Author;
        private String item_Genre;
        private String item_Status;

        //Builder constructor
        private Builder () {}

        //Builder returns
        public Builder theirItem_ID (String item_Id) {
            this.item_Id = item_Id;
            return this;
        }

        public Builder theirItem_Name (String item_Name) {
            this.item_Name = item_Name;
            return this;
        }

        public Builder theirItem_Author (String item_Author) {
            this.item_Author = item_Author;
            return this;
        }

        public Builder theirItem_Genre (String item_Genre) {
            this.item_Genre = item_Genre;
            return this;
        }

        //Builder method
        public Item build() {
            Item item = new Item();
            item.item_Id = this.item_Id;
            item.item_Name = this.item_Name;
            item.item_Author = this.item_Author;
            item.item_Genre = this.item_Genre;
            item.item_Status = this.item_Status;
            return item;
        }
    }

    //Getters
    public String getItem_Id() {
        return item_Id;
    }

    public String getItem_Name() {
        return item_Name;
    }

    public String getItem_Author() {
        return item_Author;
    }

    public String getItem_Genre() {
        return item_Genre;
    }

    public String getItem_Status() {
        return item_Status;
    }

}