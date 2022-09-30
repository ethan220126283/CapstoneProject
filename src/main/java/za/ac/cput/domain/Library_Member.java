package za.ac.cput.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Library_Member implements Serializable{

    @Id
    @GeneratedValue
    private int library_id;
    //Columb (name = "library_Member")
    private int member_id;

    protected Library_Member(){}



    private Library_Member(Builder builder) {


        this.library_id = builder.library_id;
        this.member_id = builder.member_id;
        }


        public static class Builder{

            private int library_id;
            private int member_id;


        public Builder(){}


        public Builder setLibrary_id(int library_id) {
            this.library_id = library_id;
            return this;
        }

            public Builder setMember_id(int member_id) {
                this.member_id = member_id;
                return this;
            }

            public Library_Member build(){
            Library_Member library_member = new Library_Member();
            library_member.library_id = this.library_id;
            library_member.member_id = this.member_id;
            return library_member;
        }

    }

    public int getLibrary_id() {
        return library_id;
    }

    public int getMember_id() {
        return member_id;
    }

    @Override
    public String toString() {
        return "Library_Member{" +
                "library_id=" + library_id +
                ", member_id=" + member_id +
                '}';
    }
}
