package cw2.books;

public class Magazine extends Book{
    private About about;
    private double price;

    public Magazine() {
    }

    public Magazine(int pages, boolean pictures, Cover cover, About about, double price) {
        super(pages, pictures, cover);
        this.about = about;
        this.price = price;
    }

    public About getAbout() {
        return about;
    }

    public void setAbout(About about) {
        this.about = about;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "about=" + about +
                ", price=" + price +
                '}';
    }
}
enum About {
    SCIENCE, COOKING , FASHION , MUSIC ,TV_SHOW
}
