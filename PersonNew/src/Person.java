/**
 * Created by johrir on 7/21/2017.
 */
public class Person {
    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {

        return name;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        Person p=(Person)o;
        if(o == null)
            return false;
        else if(this.getName().equalsIgnoreCase(p.getName()) && this.getGender().equalsIgnoreCase(getGender()))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        int i=0;
        i = (this.getGender().hashCode()+this.getName().hashCode());
        return i;
    }
}