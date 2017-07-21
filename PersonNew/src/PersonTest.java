import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by johrir on 7/21/2017.
 */
public class PersonTest {
    public static void main(String[] args){
        Person p1 =new Person("Ramesh","m");
        Person p2 =new Person("Ramesh","m");
        Person p3 =new Person("Rame","m");


        System.out.println(p1.equals(p2));
        System.out.println("reflexive :");
        System.out.println(p1.equals(p1));
        System.out.println("Symmetric");
        System.out.println(p2.equals(p1));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());

        HashMap<Integer,Person> hashMap= new HashMap<Integer,Person>();
        hashMap.put(p1.hashCode(),p1);
        hashMap.put(p2.hashCode(),p2);
        hashMap.put(p3.hashCode(),p3);

        System.out.println(Arrays.asList(hashMap));
//        for (Map.Entry m : hashMap.entrySet()){
//            System.out.println(m.getKey()+ "" +m.getValue());
//        }



    }
}
