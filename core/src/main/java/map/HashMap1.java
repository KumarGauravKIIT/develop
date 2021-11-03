package map;

import model.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class   HashMap1 {

    private static boolean aBoolean;

    public static void main(String ...s){
        Map<Integer, Employee> map = new HashMap<>();

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
        Employee emp11 = new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0);
        Employee emp12 = new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0);
        Employee emp13 = new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0);
        Employee emp14 = new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5);
        Employee emp15 = new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0);
        Employee emp16 = new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0);
        Employee emp17 = new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0);


        map.put(emp1.hashCode(), emp1);
        map.put(emp2.hashCode(), emp2);
        map.put(emp3.hashCode(), emp3);
        map.put(emp4.hashCode(), emp4);
        map.put(emp5.hashCode(), emp5);
        map.put(emp6.hashCode(), emp6);
        map.put(emp6.hashCode(), emp7);
        map.put(emp6.hashCode(), emp8);
        map.put(emp6.hashCode(), emp9);
        map.put(emp6.hashCode(), emp10);
        map.put(emp1.hashCode(), emp11);
        map.put(emp2.hashCode(), emp12);
        map.put(emp3.hashCode(), emp13);
        map.put(emp4.hashCode(), emp14);
        map.put(emp5.hashCode(), emp15);
        map.put(emp6.hashCode(), emp16);
        map.put(emp6.hashCode(), emp17);

        // Displaying the HashMap
//        System.out.println("Initial Mappings are: " + map);

        // Displaying the size of the map
//        System.out.println("The size of the map is " + map.size());


        //Converting Map to List
        List<Employee> list = map.values().stream().collect(Collectors.toList());

        int maxAge = list.stream().map(Employee::getAge).max(Integer::compare).get();

//        list.stream().flatMap(a -> a.getAge()).forEach(System.out::println);

        //Displaying the max age of Employee
        System.out.println("\n\nMaximum Age of Employee:: ");
        list.stream().filter(e -> e.getAge() == maxAge).forEach(System.out::println);

        //Displaying the employee list who's age is greater than 35
        System.out.println("\n\nEmployee who's age is >= 35:: ");
        list.stream().filter(e-> e.getAge() >= 25 && e.getGender().equals('M')&& e.getSalary()> 2000000.00)
                .forEach(System.out::println);


        System.out.println("Mr. ======");
        Stream<Employee> maleEmps = list.stream().filter(e -> e.getSalary() > 2000000.00).filter(e ->e.getGender().equals('M'));

//        list.stream().collect(Collectors.groupingBy(Employee::getGender)).forEach(System.out.println();


        //Displaying the max Salary of Employee
        Double maxSalary = map.values().stream().map(Employee::getSalary).max(Double::compare).get();
        System.out.println("\n\nMaximum Salary of Employee:: ");
        map.values().stream().filter(e -> e.getSalary() == maxSalary).forEach(System.out::println);

//        How many male and female employees are there in the organization?
//         map.entrySet().stream()
//                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));



    }

}
