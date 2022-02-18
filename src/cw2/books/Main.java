package cw2.books;

public class Main {
    public static void main(String[] args) {
            Papyrus.readyToUse();
            Book book = new Book(168, false ,Cover.HARD);
            System.out.println(book);
            Magazine magazine = new Magazine(75, true, Cover.SOFT, About.FASHION, 45.5);
            System.out.println(magazine);
            Comics comics = new Comics(189, true, Cover.HARD,Edition.MARVEL, "Spider-man",245.5);
            System.out.println(comics);
    }
}
