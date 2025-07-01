package entity;

public class BookManager implements IBookManager {
    private Book[] books = new Book[100];
    private int currentIndex = 0;

    @Override
    public void addBook(Book book) {
        books[currentIndex] = book;
        currentIndex++;
    }

    @Override
    public void removeBook(String isbn) {
        int removeIndex = -1;
        for (int i = 0; i < currentIndex; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                removeIndex = i;
            }
        }
        if (removeIndex == -1) {
            System.out.println("Sach khong ton tai");
            return;
        }
        for (int i = removeIndex; i < currentIndex - 1; i++) {
            books[i] = books[i + 1];
        }
        currentIndex--;
        books[currentIndex] = null;
        System.out.println("Da xoa sach voi ISBN: " + isbn);
    }

    @Override
    public void displayBooks() {
        for (int i = 0; i < currentIndex; i++) {
            books[i].getDetails();
        }
    }
}
