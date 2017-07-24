/**
 * Created by johrir on 7/24/2017.
 */

public class AnnotationsTest {
    @Company(name = "CDK Global", loacation = "Pune")
    public AnnotationsTest() {
        System.out.println("Using company annotation at constructor level");
    }

    @TimeStamp(day = TimeStamp.Day.MONDAY, month = TimeStamp.Month.AUG, year = TimeStamp.Year.YEAR2017)
    void display(){
        System.out.println("using timestamp annotations");
    }
}
