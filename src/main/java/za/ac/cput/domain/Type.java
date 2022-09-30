package za.ac.cput.domain;
//import com.sun.istack.NotNull;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
/*   Name:       Darryll Merkeur
 *   Student#:   220253595
 *   Date:       21/09/2022
 */
@Entity
public class Type implements Serializable {
    //@NotNull
    @Id
    private int type_id;
    //@NotNull
    @Column(unique = true)
    @Embedded
    private String type_name;

    protected Type(){

    }
    private Type(Builder builder){
        this.type_id = builder.type_id;
        this.type_name = builder.type_name;
    }

    public int getType_id() {
        return type_id;
    }

    public String getType_name() {
        return type_name;
    }

    @Override
    public String toString() {
        return "Type{" +
                "type_id=" + type_id +
                ", type_name='" + type_name + '\'' +
                '}';
    }

    public static class Builder{
        private int type_id;
        private String type_name;

        public Builder setType_id(int type_id) {
            this.type_id = type_id;
            return this;
        }

        public Builder setType_name(String type_name) {
            this.type_name = type_name;
            return this;
        }
        public Builder copy(Type type){
            this.type_id = type.getType_id();
            this.type_name = type.getType_name();
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
        return type.equals(type.type_id)&&type_name.equals(type.type_name);
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(type_id,type_name);
    }
}
