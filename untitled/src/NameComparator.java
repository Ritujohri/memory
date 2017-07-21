import java.util.Comparator;

/**
 * Created by johrir on 7/20/2017.
 */
public class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getName().compareToIgnoreCase(o2.getName())==0)
            return 1;
        else
            return 0;
    }
}
