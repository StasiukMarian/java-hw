package cw2.books;

public class Comics extends Book {
    private Edition edition;
    private String superhero;
    private double price;

    public Comics() {
    }

    public Comics(int pages, boolean pictures, Cover cover, Edition edition, String superhero, double price) {
        super(pages, pictures, cover);
        this.edition = edition;
        this.superhero = superhero;
        this.price = price;
    }

    public Edition getEdition() {
        return edition;
    }

    public void setEdition(Edition edition) {
        this.edition = edition;
    }

    public String getSuperhero() {
        return superhero;
    }

    public void setSuperhero(String superhero) {
        this.superhero = superhero;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "edition=" + edition +
                ", superhero='" + superhero + '\'' +
                ", price=" + price +
                '}';
    }
}
enum Edition {
    MARVEL , DC
}
