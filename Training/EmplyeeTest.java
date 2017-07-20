import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by johrir on 7/18/2017.
 */
public class EmplyeeTest {
    static List<Employee> createTestData(){
        List<Employee> list = new ArrayList<Employee>();
        Employee emp1 = new Employee(110, "Aditya", new Date(92,8,12), "R & D", new Date(92, 07,7 ), Employee.Location.PUNE );
        Employee emp2 = new Employee(101, "Pranati", new Date(92,8,12), "R & D", new Date(92, 07,7 ), Employee.Location.PUNE );
        Employee emp3 = new Employee(102, "Pranali", new Date(92,8,12), "R & D", new Date(92, 07,7 ), Employee.Location.PUNE );

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        return list;
    }
    public static void main(String[] args) {

        EmplyeeTest employeeTest = new EmplyeeTest();
        List<Employee> list = employeeTest.createTestData();
//        Collections.sort(list, Employee.NameComparator);

        for(Employee emp : list) {
           System.out.println(emp.toString());
        }

//        Collections.sort(list, Employee.idComparator);

        for(Employee emp : list) {
            System.out.println(emp.toString());
        }

    }
}

