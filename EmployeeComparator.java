import java.util.Comparator;

/**
 * Created by johrir on 7/22/2017.
 */
public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        int v =(e1.getLocation()).compareTo(e2.getLocation());
        if (v==0)
            v=(e1.getDepartment()).compareTo(e2.getDepartment());
        if (v==0)
            v=(e1.getName()).compareTo(e2.getName());
        if (v==0)
            v=(e1.getLastName()).compareTo(e2.getLastName());
        if (v==0)
            v=e1.getId()-e2.getId();
        return v;
    }
}

