package map;

import model.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class HashMap1 {

    private static boolean aBoolean;

    public static void main(String ...s){
        Map<Integer, Employee> map = new HashMap<>();

        Employee emp1 = new Employee(32, 2500001.0, "Raju", "100230", "Bangalore", 5);
        Employee emp2 = new Employee(35, 2500002.0, "Kolar", "100231", "London", 1);
        Employee emp3 = new Employee(31, 2500003.0, "Venkat", "100232", "Bangalore", 2);
        Employee emp4 = new Employee(28, 1500004.0, "Abrahim", "100233", "New Jersey", 3);
        Employee emp5 = new Employee(26, 1500005.0, "Mike", "100234", "Chennai", 4);
        Employee emp6 = new Employee(45, 2500006.0, "Pamela", "100235", "Bangalore", 1);


        map.put(emp1.hashCode(), emp1);
        map.put(emp2.hashCode(), emp2);
        map.put(emp3.hashCode(), emp3);
        map.put(emp4.hashCode(), emp4);
        map.put(emp5.hashCode(), emp5);
        map.put(emp6.hashCode(), emp6);


        // Displaying the HashMap
//        System.out.println("Initial Mappings are: " + map);

        // Displaying the size of the map
//        System.out.println("The size of the map is " + map.size());


        //Converting Map to List
        List<Employee> list = map.values().stream().collect(Collectors.toList());

        int maxAge = list.stream().map(Employee::getAge).max(Integer::compare).get();

        //Displaying the max age of Employee
        System.out.println("\n\nMaximum Age of Employee:: ");
        list.stream().filter(e -> e.getAge() == maxAge).forEach(System.out::println);

        //Displaying the employee list who's age is greater than 35
        System.out.println("\n\nEmployee who's age is >= 35:: ");
        list.stream().filter(e-> e.getAge() >= 35).forEach(System.out::println);

        //Displaying the max Salary of Employee
        Double maxSalary = map.values().stream().map(Employee::getSalary).max(Double::compare).get();
        System.out.println("\n\nMaximum Salary of Employee:: ");
        map.values().stream().filter(e -> e.getSalary() == maxSalary).forEach(System.out::println);


//        //Increase salary on Rating Basis

        map.values().stream().forEach( e ->
        {
            if (e.getRating() == 1) {
                e.setSalary(e.getSalary()+1000);
            } else if (e.getRating() == 2) {
                e.setSalary(e.getSalary()+2000);
            }else if (e.getRating() == 3) {
                e.setSalary(e.getSalary()+3000);
            }else if (e.getRating() == 4) {
                e.setSalary(e.getSalary()+4000);
            }else if (e.getRating() == 5) {
                e.setSalary(e.getSalary()+5000);
            }
        });

        System.out.println("\n\n");

        map.values().stream().forEach(System.out::println);

    }

}
