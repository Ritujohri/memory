/**
 * Created by johrir on 7/19/2017.
 */
public class Book {
    private float price;
    private String title;

    public Book(float price, String title) {
        this.price = price;
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", title='" + title + '\'' +
                '}';
    }
}

class CompareTitle implements Compare {
    public int compare(Object o1, Object o2) {
        Book b1 = (Book) o1;
        Book b2 = (Book) o2;
        if (b1.getTitle().compareToIgnoreCase(b2.getTitle()) == 0) {
            return 0;
        } else if (b1.getTitle().compareToIgnoreCase(b2.getTitle()) > 0) {
            return 1;
        } else
            return -1;

    }
}

class ComparePrice implements Compare {
    public int compare(Object o1, Object o2) {
        Book e1 = (Book) o1;
        Book e2 = (Book) o2;
        if (e1.getPrice() == e2.getPrice()) {
            return 0;
        } else if (e1.getPrice() > e2.getPrice()) {
            return 1;
        } else {
            return -1;
        }
    }
}