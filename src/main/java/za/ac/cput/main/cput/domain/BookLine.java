package za.ac.cput.main.cput.domain;
/*
    BookLine.domain.java
    Lana Africa (216166640)
    Capstone Project - Domain Entity
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
public class BookLine implements Serializable {
    @Id
    @GeneratedValue
    private int bookLine_id;

    private int library_id;
    private String item_id;
    private int member_id;
    private Date borrow_date;
    private Date due_date;
    private Date return_date;

    protected BookLine(){}

    private BookLine(Builder builder){
        this.bookLine_id = builder.bookLine_id;
        this.library_id = builder.library_id;
        this.item_id = builder.item_id;
        this.member_id = builder.member_id;
        this.borrow_date = builder.borrow_date;
        this.due_date = builder.due_date;
        this.return_date = builder.return_date;
    }
    public int getBookLine_id(){
        return bookLine_id;
    }
    public int getLibrary_id(){
        return library_id;
    }
    public String getItem_id(){
        return item_id;
    }
    public int getMember_id(){
        return member_id;
    }
    public Date getBorrow_date(){
        return borrow_date;
    }
    public Date getDue_date(){
        return due_date;
    }
    public Date getReturn_date(){
        return return_date;
    }


    @Override
    public String toString() {
        return "BookLine{" +
                "bookLine_id=" + bookLine_id +
                ", library_id=" + library_id +
                ", item_id='" + item_id + '\'' +
                ", member_id=" + member_id +
                ", borrow_date=" + borrow_date +
                ", due_date=" + due_date +
                ", return_date=" + return_date +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BookLine bookline = (BookLine) obj;
        return Objects.equals(bookLine_id, bookline.bookLine_id) && Objects.equals(library_id, bookline.library_id)
                && Objects.equals(item_id, bookline.item_id) && Objects.equals(member_id, bookline.member_id)
                && Objects.equals(borrow_date, bookline.borrow_date) & Objects.equals(due_date, bookline.due_date)
                && Objects.equals(return_date, bookline.return_date);
    }


    @Override
    public int hashCode(){
        return Objects.hash(bookLine_id,library_id, item_id, member_id, borrow_date, due_date, return_date);
    }


    public static class Builder{
        private int bookLine_id;
        private int library_id;
        private String item_id;
        private int member_id;
        private Date borrow_date;
        private Date due_date;
        private Date return_date;

        public Builder BookLine_id(int bookLine_id) {
            this.bookLine_id = bookLine_id;
            return this;
        }
        public Builder Library_id(int library_id){
            this.library_id = library_id;
            return this;
        }
        public Builder Item_id(String item_id){
            this.item_id = item_id;
            return this;
        }
        public Builder Member_id(int member_id){
            this.member_id = member_id;
            return this;
        }
        public Builder Borrow_date(Date borrow_date){
            this.borrow_date = borrow_date;
            return this;
        }
        public Builder Due_date(Date due_date){
            this.due_date = due_date;
            return this;
        }
        public Builder Return_date(Date return_date){
            this.return_date = return_date;
            return this;
        }

        Builder copy (BookLine bookline){
            this.bookLine_id=bookline.bookLine_id;
            this.library_id=bookline.library_id;
            this.item_id=bookline.item_id;
            this.member_id=bookline.member_id;
            this.borrow_date=bookline.borrow_date;
            this.due_date=bookline.due_date;
            this.return_date=bookline.return_date;
            return this;
        }
        public BookLine build(){
            return new BookLine(this);
        }
    }
}