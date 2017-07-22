/**
 * Created by johrir on 7/22/2017.
 */
public class Employee {
    private String name;
    private String lastName;
    private String department;
    private int id;
    private String location;

    public Employee(String name, String lastName, String department, int id, String location) {
        this.name = name;
        this.lastName = lastName;
        this.department = department;
        this.id = id;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", id=" + id +
                ", location='" + location + '\'' ;
    }
}
