package za.ac.cput.library_management.domain;

import javax.persistence.*;

@Entity
@Table(name = "library_member")
public class Library_Member {
    @Id
    @Column(name = "library_member_id", nullable = false)
    private String id;

    @ManyToOne
    @JoinColumn(name = "library_id")
    private Library library;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    protected Library_Member(){}

    private Library_Member(Builder builder) {

        this.id = builder.id;
        this.library = builder.library;
        this.member = builder.member;
    }


    public static class Builder {

        private String id;
        private Library library;
        private Member member;

        public Builder() {}

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setLibrary(Library library) {
            this.library = library;
            return this;
        }

        public Builder setMember(Member member) {
            this.member = member;
            return this;
        }

        public Library_Member build(){
            Library_Member library_member = new Library_Member();
            library_member.id = this.id;
            library_member.library = this.library;
            library_member.member = this.member;
            return library_member;
        }
    }

    //Getters

    public String getId() {
        return id;
    }

    public Library getLibrary() {
        return library;
    }

    public Member getMember() {
        return member;
    }

    //toString
    @Override
    public String toString() {
        return "Library_Member{" +
                "id='" + id + '\'' +
                ", library=" + library +
                ", member=" + member +
                '}';
    }
}