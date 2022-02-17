package hw2.print;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        Magazine magazine = new Magazine();
        List<Printable> prints = new ArrayList<>();
        prints.add(book);
        prints.add(magazine);
        System.out.println(prints);
    }
}
