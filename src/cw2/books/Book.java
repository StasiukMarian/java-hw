package cw2.books;

import lombok.*;



public class Book extends Papyrus{
    private int pages;
    private boolean pictures;
    private Cover cover;

    public Book() {
    }

    public Book(int pages, boolean pictures, Cover cover) {
        this.pages = pages;
        this.pictures = pictures;
        this.cover = cover;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isPictures() {
        return pictures;
    }

    public void setPictures(boolean pictures) {
        this.pictures = pictures;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                ", pictures=" + pictures +
                ", cover=" + cover +
                '}';
    }
}
enum Cover {
    SOFT, HARD
}
