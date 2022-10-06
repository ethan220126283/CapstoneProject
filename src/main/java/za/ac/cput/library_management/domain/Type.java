package za.ac.cput.library_management.domain;

/*   Name:       Darryll Merkeur
 *   Student#:   220253595
 *   Date:       21/09/2022
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "type")
public class Type {
    @Id
    @Column(name = "type_id", nullable = false)
    private String id;

    @Column(name = "name")
    private String name;

    protected Type(){}

    private Type(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Type{" +
                "type_id=" + id +
                ", type_name='" + name + '\'' +
                '}';
    }

    public static class Builder{
        private String id;
        private String name;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder copy(Type type){
            this.id = type.getId();
            this.name = type.getName();
            return this;
        }
        public Type build(){
            return new Type(this);
        }
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type = (Type) o;
        return type.equals(type.id)&&name.equals(type.name);
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(id,name);
    }

}