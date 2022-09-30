package za.ac.cput.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.lang.management.MemoryManagerMXBean;


@Entity
public class Member implements Serializable {

    @Id
    @GeneratedValue
    private int member_id;

    private String member_name;
    private String member_address;
    private String member_tel;
    private String member_status;

    protected Member(){}

    private Member(Member.Builder builder){
        this.member_id = builder.member_id;
        this.member_name = builder.member_name;
        this.member_address = builder.member_address;
        this.member_tel = builder.member_tel;
        this.member_status = builder.member_status;

    }


    public static class Builder{

        private int member_id;
        private String member_name;
        private String member_address;
        private String member_tel;
        private String member_status;

        public Builder(){}

        public Builder setMember_id(int member_id) {
            this.member_id = member_id;
            return this;
        }

        public Builder setMember_name(String member_name) {
            this.member_name = member_name;
            return this;
        }

        public Builder setMember_address(String member_address) {
            this.member_address = member_address;
            return this;
        }

        public Builder setMember_tel(String member_tel) {
            this.member_tel = member_tel;
            return this;
        }

        public Builder setMember_status(String member_status) {
            this.member_status = member_status;
            return this;
        }

        public Member build(){
            Member member = new Member();
            member.member_id = this.member_id;
            member.member_name = this.member_name;
            member.member_address = this.member_address;
            member.member_tel = this.member_tel;
            member.member_status = this.member_status;
            return member;
        }

    }


    public int getMember_id() {
        return member_id;
    }

    public String getMember_name() {
        return member_name;
    }


    public String getMember_address() {
        return member_address;
    }

    public String getMember_tel() {
        return member_tel;
    }

    public String getMember_status() {
        return member_status;
    }

    @Override
    public String toString() {
        return "Member{" +
                "member_id=" + member_id +
                ", member_name='" + member_name + '\'' +
                ", member_address='" + member_address + '\'' +
                ", member_tel='" + member_tel + '\'' +
                ", member_status='" + member_status + '\'' +
                '}';
    }
}
