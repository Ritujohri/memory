/**
 * Created by johrir on 7/18/2017.
 */
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by johrir on 7/18/2017.
 */

public class Employee {
    enum Location {PUNE, HYDERABAD}

    private int empId;
    private String name;
    private Date dateOfJoining;
    private String department;
    private Date dateOfBirth;
    private Location loaction;

    public Employee(int empId, String name, Date dateOfJoining, String department, Date dateOfBirth, Location loaction) {
        this.empId = empId;
        this.name = name;
        this.dateOfJoining = dateOfJoining;
        this.department = department;
        this.dateOfBirth = dateOfBirth;
        this.loaction = loaction;
    }


    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setLoaction(Location loaction) {
        this.loaction = loaction;
    }


    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public String getDepartment() {
        return department;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Location getLoaction() {
        return loaction;
    }

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MMM-dd");

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                ", department='" + department + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", loaction='" + loaction + '\'' +
                '}';
    }

}

