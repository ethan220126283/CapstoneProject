package za.ac.cput.library_management.domain;

/*   Name:       Adrian Bennett
 *   Student#:   214075982
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "member")
public class Member {
    @Id
    @Column(name = "member_id", nullable = false)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "tel")
    private String tel;

    @Column(name = "status")
    private String status;

    protected Member(){}

    private Member(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address;
        this.tel = builder.tel;
        this.status = builder.status;

    }


    public static class Builder{

        private String id;
        private String name;
        private String address;
        private String tel;
        private String status;

        public Builder(){}

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setTel(String tel) {
            this.tel = tel;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Member build(){
            Member member = new Member();
            member.id = this.id;
            member.name = this.name;
            member.address = this.address;
            member.tel = this.tel;
            member.status = this.status;
            return member;
        }

    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public String getAddress() {
        return address;
    }

    public String getTel() {
        return tel;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

}