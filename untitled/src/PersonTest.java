import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by johrir on 7/20/2017.
 */
public class PersonTest {
    public static List<Person> createTestData(){
        List<Person> list = new ArrayList<Person>();
        Person p1 = new Person("Ritu", 'f');
        Person p2 = new Person("Priya", 'f');
        Person p3 = new Person("Ritu", 'f');
        Person p4 = new Person("Priya", 'f');
        Person p5 = new Person("Rituja", 'f');

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        return list;
    }
    @Test
    public void testNameEquality() {
        List<Person> personList = createTestData();
        Comparator<Person> comp = new NameComparator();
        for (int i = 0; i < personList.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < personList.size(); j++) {
                if (comp.compare(personList.get(i), personList.get(j)) == 1) {
                    count++;
                    personList.remove(personList.get(j));
                    j--;
                }
            }
            System.out.println(personList.get(i).getName() + count);
        }
    }
}

