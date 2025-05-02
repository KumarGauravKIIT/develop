package functional;

import model.Employee;
import model.EmployeeDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ComsumerExample {

    public static void main(String[] args) {
        Consumer<Integer> display = (a) -> System.out.println(a);
        display.accept(5);



        Consumer<List<Integer>> modify = list ->  {
            for(int i=0; i<list.size(); i++) {
                list.set(i, 2 * list.get(i));
            }
        };

        // Consumer to display a list of numbers
        Consumer<List<Integer> >
                dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        //Modify and Display an integer list
        modify.accept(list);
        dispList.accept(list);

        //Display a String
        Consumer<String> con = (s) -> System.out.println(s.toUpperCase());
        con.accept("my Name is Gaurav");

        //Consumer to display Employee's name
        Consumer<Employee> conEmp1 = (e) -> System.out.println(e.getName());
        List<Employee> employees  = EmployeeDatabase.getAllEmployeeDetails();
        employees.forEach(conEmp1);



    }
}
