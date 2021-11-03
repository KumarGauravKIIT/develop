package streamApi;

import lombok.val;
import model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EntryObjExample {

    public static void main(String[] args) {
        val empEntry = new Map.Entry<Integer, List<Employee>>() {
            @Override
            public Integer getKey() {
                return null;
            }

            @Override
            public List<Employee> getValue() {
                return null;
            }

            @Override
            public List<Employee> setValue(List<Employee> value) {
                return null;
            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }
        };
        Employee emp1 = new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0);
        Employee emp2 = new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0);
        Employee emp3 = new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0);
        Employee emp4 = new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0);
        Employee emp5 = new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0);
        Employee emp6 = new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0);
        Employee emp7 = new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0);
        Employee emp8 = new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0);
        Employee emp9 = new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0);
        Employee emp10 = new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5);


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        employeeList.add(emp8);
        employeeList.add(emp9);
        employeeList.add(emp10);

        empEntry.setValue(employeeList);
        System.out.println(empEntry.getValue());

    }
}
