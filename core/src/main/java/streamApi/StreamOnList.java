package streamApi;


import model.Employee;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamOnList {

    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(4);
//        list.add(10);
//        list.add(5);
//        list.add(3);
//        list.add(9);

        //Print the List
//        list.stream().forEach(System.out::print);
//        System.out.println("\n");

        //Sort the List
//        list.stream().sorted().forEach(System.out::print);
//        System.out.println("\n");

        //Find Maximum Even Number
//        System.out.println(list.stream().filter(n -> n % 2 == 1).max(Integer::compare).orElse(0));
//        System.out.println("\n");

        //Find minimum Even Number
//        System.out.println(list.stream().filter(n -> n % 2 == 1).min(Integer::compare).orElse(0));
//        System.out.println("\n");


        //Find Maximum Odd Number
//        System.out.println(list.stream().filter(n -> n % 2 != 1).max(Integer::compare).orElse(0));
//        System.out.println("\n");


        //Find Minimum Off Number
//        System.out.println(list.stream().filter(n -> n % 2 != 1).min(Integer::compare).orElse(0));
//        System.out.println("\n");

//        //Displaying multiple of the list elements
//        list.stream().map(i -> i*5).forEach(System.out::println);
//

        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        empList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        empList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        empList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        empList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        empList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        empList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        empList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        empList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        empList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        empList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        empList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        empList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        empList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        empList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        empList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        empList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


        // How many male and female employees are there in the organization?

//        Map<String, Long> count = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//        System.out.println("How many male and female employees are there in the organization?\n"+count);

//         Map<String, Double>  mm =   empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.(Employee::getAge)));
//        Set<Map.Entry<String, Double>> es = mm.entrySet();
//        for (Map.Entry<String, Double> entry : es){
//            System.out.println(entry.getKey() + ": "+entry.getValue());
//        }


        //Print the name of all departments in the organization?
//        empList.stream().map(employee -> employee.getDepartment()).distinct().forEach(System.out::println);


        //What is the average age of male and female employees?
//        Map<> empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

        //Get the details of highest paid employee in the organization?
//        empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))


//        empList.stream().sorted().forEach(System.out::println);


//        int number = 746;
//        int digit = 5;
//        String s = "746";
//        StringBuilder str1;

        List<Employee> eList = empList.stream().filter(e -> e.getName().equals("Jiya Brein")).collect(Collectors.toList());
       Employee em = eList.get(0);
//        System.out.println(em);



//        Employee resultUser = empList.stream()
//                .filter(user -> user.getName().equals("Amelia Zoe"))
//                .collect(toSingleton());
//
//        System.out.println(resultUser.toString());


        //Maximum number in list
//        List<Integer> noList = Arrays.asList(12,45,23,22,98,102, 78);
//        System.out.println("Maximum number in the list is : "+noList.stream().mapToInt(v -> v).max());





    }


    public static <T> Collector<T, ?, T> toSingleton() {
        return Collectors.collectingAndThen(
                Collectors.toList(),
                list -> {
                    if (list.size() != 1) {
                        throw new IllegalStateException();
                    }
                    return list.get(0);
                }
        );
    }


}
