/**
 * Created by johrir on 7/22/2017.
 */
public class TestString {
    public static void main(String[] args) {
        String pqr = "cdk";
        String name = new String("Cdk");
        String name1 = name.intern();
        String name2 = "Cdk";

        System.out.println(name==(name1));
        System.out.println(name==(name2));
        System.out.println(name1==(name2));
        System.out.println(name1.equals(name2));




    }
}