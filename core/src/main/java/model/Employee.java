package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {

    private static final long serialVersionUID = 103229847384567356L;

    Integer age;
    Double salary;
    String name;
    String id;
    String address;
    int rating;


    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;

        if (this.getClass() != obj.getClass())
            return false;

        Employee emp = (Employee) obj;

        return (this.id == emp.id || this.id.equals(emp.id)) && (this.name == emp.name || this.name.equals(emp.name));
    }


    @Override
    public int hashCode(){
        int hash = (this.id == null? 0:this.id.hashCode()) +
                (this.name == null?0:this.name.hashCode());
        return hash;
    }

    @Override
    public String toString(){
        return "Employee id= "+id+
                ", Name = " +name+
                ", Address = "+address+
                ", Salary = "+salary+
                ", Rating = "+rating+
                ", Age = "+age;

    }

}
