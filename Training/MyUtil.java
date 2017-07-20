import java.util.ArrayList;
import java.util.List;

/**
 * Created by johrir on 7/19/2017.
 */
public class MyUtil {
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length - i ; j++) {
                if(arr[j] > arr[j+1]){
                    arr[j] = arr[j+1] + arr[j];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
        }
        return arr;
    }

    public static ArrayList<Object> sort(ArrayList<Object> arr, Compare comp) {
        for (int i = 0; i < arr.size() ; i++) {
            for (int j = 0; j < arr.size() - i -1 ; j++) {
                Object o1 = arr.get(j);
                Object o2 = arr.get(j + 1);
                if(comp.compare(o1,o2) > 0){
                    arr.set(j,o2);
                    arr.set(j + 1, o1);
                }

            }
        }
        return arr;
    }
    public static void main(String[] args) {
        EmplyeeTest employeeTest = new EmplyeeTest();
        List<Employee> list = employeeTest.createTestData();

        MyUtil.sort((ArrayList)list, new EmpCompareId());
        for(Employee emp : list) {
            System.out.println(emp.toString());
        }
        MyUtil.sort((ArrayList)list, new EmpCompareName());
        for(Employee emp : list) {
            System.out.println(emp.toString());
        }

        ArrayList<Book> arr = new ArrayList<Book>();
        Book b1 = new Book(250, "who moved my cheese");
        Book b2 = new Book(100, "Pride and prejudice");
        Book b3 = new Book(350, "revolution ");
        arr.add(b1);
        arr.add(b2);
        arr.add(b3);

        MyUtil.sort((ArrayList) arr, new ComparePrice());
        for (Book b : arr) {
            System.out.println(b.toString());
        }
        MyUtil.sort((ArrayList) arr, new CompareTitle());
        for (Book b : arr) {
            System.out.println(b.toString());
        }
    }


}
