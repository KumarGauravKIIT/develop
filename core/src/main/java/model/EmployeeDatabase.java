package model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDatabase {

    public static List<Employee> getAllEmployeeDetails() {
        Employee e1 = Employee.builder().age(36).id(1001).department("IT").gender("Male").name("Kumar Gaurav").salary(2600000.0).yearOfJoining(2022).build();
        Employee e2 = Employee.builder().age(35).id(1002).department("IT").gender("Male").name("Hemant Rai").salary(2400000.0).yearOfJoining(2021).build();
        Employee e3 = Employee.builder().age(34).id(1003).department("IT").gender("Male").name("Ajay Patel").salary(2450000.0).yearOfJoining(2021).build();
        Employee e4 = Employee.builder().age(26).id(1004).department("IT").gender("Male").name("Suraj Kumar Dubey").salary(1200000.0).yearOfJoining(2021).build();
        Employee e5 = Employee.builder().age(34).id(1005).department("HR").gender("Female").name("Pratibha Sinha").salary(1250000.0).yearOfJoining(2005).build();
        Employee e6 = Employee.builder().age(40).id(1006).department("Transport").gender("Male").name("Rajat Yadav").salary(600000.0).yearOfJoining(2025).build();
        Employee e7 = Employee.builder().age(24).id(1007).department("HR").gender("Female").name("Shalini").salary(900000.0).yearOfJoining(2024).build();
        Employee e8 = Employee.builder().age(42).id(1008).department("Management").gender("Male").name("Rahul Mishra").salary(3600000.0).yearOfJoining(2021).build();
        Employee e9 = Employee.builder().age(36).id(1009).department("IT").gender("Male").name("Mohsin Khan").salary(2400000.0).yearOfJoining(2022).build();
        Employee e10 = Employee.builder().age(36).id(1010).department("IT").gender("Male").name("Pramod Yadav").salary(2400000.0).yearOfJoining(2021).build();


        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);
        employees.add(e9);
        employees.add(e10);

        return employees;
    }




}
