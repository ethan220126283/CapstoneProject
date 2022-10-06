package za.ac.cput.library_management.domain;

/*
    BookLine.domain.java
    Lana Africa (216166640)
    Capstone Project - Domain Entity
 */

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bookline")
public class Bookline {
    @Id
    @Column(name = "bookline_id", nullable = false)
    private String id;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "library_id")
    private Library library;

    @Temporal(TemporalType.DATE)
    @Column(name = "borrow_date")
    private Date borrow_date;

    @Temporal(TemporalType.DATE)
    @Column(name = "due_date")
    private Date due_date;

    @Temporal(TemporalType.DATE)
    @Column(name = "return_date")
    private Date return_date;

    protected Bookline(){}

    private Bookline(Builder builder){
        this.id = builder.id;
        this.library = builder.library;
        this.item = builder.item;
        this.member = builder.member;
        this.borrow_date = builder.borrow_date;
        this.due_date = builder.due_date;
        this.return_date = builder.return_date;
    }

    public String getId(){
        return id;
    }
    public Library getLibrary(){
        return library;
    }
    public Item getItem(){
        return item;
    }
    public Member getMember(){
        return member;
    }
    public Date getBorrow_Date(){
        return borrow_date;
    }
    public Date getDue_Date(){
        return due_date;
    }
    public Date getReturn_Date(){
        return return_date;
    }

    @Override
    public String toString() {
        return "Bookline{" +
                "id='" + id + '\'' +
                ", item=" + item +
                ", member=" + member +
                ", library=" + library +
                ", borrow_date=" + borrow_date +
                ", due_date=" + due_date +
                ", return_date=" + return_date +
                '}';
    }

    public static class Builder{
        private String id;
        private Library library;
        private Item item;
        private Member member;
        private Date borrow_date;
        private Date due_date;
        private Date return_date;

        public Builder theirId(String id) {
            this.id = id;
            return this;
        }
        public Builder theirLibrary(Library library){
            this.library = library;
            return this;
        }
        public Builder theirItem(Item item){
            this.item = item;
            return this;
        }
        public Builder theirMember(Member member){
            this.member = member;
            return this;
        }
        public Builder theirBorrow_Date(Date borrow_date){
            this.borrow_date = borrow_date;
            return this;
        }
        public Builder theirDue_Date(Date due_date){
            this.due_date = due_date;
            return this;
        }
        public Builder theirReturn_Date(Date return_date){
            this.return_date = return_date;
            return this;
        }

        Builder copy (Bookline bookline){
            this.id=bookline.id;
            this.library=bookline.library;
            this.item=bookline.item;
            this.member=bookline.member;
            this.borrow_date=bookline.borrow_date;
            this.due_date=bookline.due_date;
            this.return_date=bookline.return_date;
            return this;
        }
        public Bookline build(){
            return new Bookline(this);
        }
    }
}