/**
 * Created by johrir on 7/19/2017.
 */
public interface Compare {
    public int compare(Object o1, Object o2);
}

class EmpCompareId implements Compare {
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee)o1;
        Employee e2 = (Employee)o2;
        if (e1.getEmpId() == e2.getEmpId()) {
            return 0;
        }
        else if (e1.getEmpId() > e2.getEmpId()) {
            return 1;
        }
        else {
            return -1;
        }
     }
}

class EmpCompareName implements Compare {
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee)o1;
        Employee e2 = (Employee)o2;
        if(e1.getName().compareToIgnoreCase(e2.getName()) == 0){
            return 0;
        }
        else if(e1.getName().compareToIgnoreCase(e2.getName()) > 0){
            return 1;
        }
        else
            return -1;
    }
}