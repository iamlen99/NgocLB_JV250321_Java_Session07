package entity;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int year;

    public Book(String title, String author, String isbn, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
    }

    public void getDetails() {
        System.out.printf("Tieu de: %s, Tac gia: %s, ISBN: %s, Nam: %d\n", this.title, this.author, this.isbn, this.year);
    }

    public String getIsbn() {
        return isbn;
    }
}
