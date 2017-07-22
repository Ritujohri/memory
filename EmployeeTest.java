import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by johrir on 7/22/2017.
 */
public class EmployeeTest {

    public static List<Employee> createTestData() {
        List<Employee> list = Arrays.asList(
                new Employee("Ritu", "Johri", "HR", 100, "Pune"),
                new Employee("Ramesh", "Joshii", "HR", 101, "Pune"),
                new Employee("Prateek", "Khandelwal", "finance", 102, "Pune"),
                new Employee("Gagan", "Khanuja", "finance", 103, "Pune"),
                new Employee("Priya", "Shrivastava", "finance", 104, "Pune"),
                new Employee("Priyal", "Choubey", "R & D", 105, "Pune"),
                new Employee("Prankur", "Johri", "R & D", 106, "Pune"),
                new Employee("Akriti", "Johri", "R & D", 107, "Pune"),
                new Employee("Shiva", "Johri", "HR", 108, "Pune"),
                new Employee("Harsha", "Johri", "finance", 109, "Pune"),
                new Employee("Ritika", "Johri", "HR", 110, "Hyderabad"),
                new Employee("Ramesha", "Joshii", "HR", 200, "Hyderabad"),
                new Employee("Pragati", "Khandelwal", "finance", 201, "Hyderabad"),
                new Employee("Gagandeep", "Khanuja", "finance", 203, "Hyderabad"),
                new Employee("Preetika", "Shrivastava", "finance", 230, "Hyderabad"),
                new Employee("Priyanka", "Choubey", "R & D", 257, "Hyderabad"),
                new Employee("Prakrati", "Johri", "R & D", 260, "Hyderabad"),
                new Employee("Atika", "Johri", "R & D", 288, "Hyderabad"),
                new Employee("Shivansh", "Johri", "HR", 290, "Hyderabad"),
                new Employee("Harshala", "Johri", "finance", 300, "Hyderabad"),
                new Employee("Rituja", "Johri", "HR", 400, "Pune"),
                new Employee("Rama", "Joshii", "HR", 401, "Pune"),
                new Employee("Prati", "Khandelwal", "finance", 402, "Pune"),
                new Employee("Ganga", "Khanuja", "finance", 403, "Pune"),
                new Employee("Priyank", "Shrivastava", "finance", 404, "Pune"),
                new Employee("Priyashi", "Choubey", "R & D", 405, "Pune"),
                new Employee("Prayal", "Johri", "R & D", 406, "Pune"),
                new Employee("Ankita", "Johri", "R & D", 407, "Pune"),
                new Employee("Shivsena", "Johri", "HR", 408, "Pune"),
                new Employee("Harshita", "Johri", "finance", 409, "Pune"),
                new Employee("Ritima", "Johri", "HR", 410, "Hyderabad"),
                new Employee("Raghav", "Joshii", "HR", 500, "Hyderabad"),
                new Employee("Parul", "Khandelwal", "finance", 501, "Hyderabad"),
                new Employee("Gurpreet", "Khanuja", "finance", 503, "Hyderabad"),
                new Employee("Pranjal", "Shrivastava", "finance", 530, "Hyderabad"),
                new Employee("ifla", "Choubey", "R & D", 557, "Hyderabad"),
                new Employee("neha", "Johri", "R & D", 560, "Hyderabad"),
                new Employee("Asif", "Johri", "R & D", 588, "Hyderabad"),
                new Employee("Tanmay", "Johri", "HR", 590, "Hyderabad"),
                new Employee("rishi", "Johri", "finance", 600, "Hyderabad")
        );
        return list;
    }

    @Test
    public void testData(){
       List<Employee> list = EmployeeTest.createTestData();
       Collections.sort(list, new EmployeeComparator());
        for (Employee e:list) {
            System.out.println(e.toString());
        }

    }


}
