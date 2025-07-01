package presentation;

import entity.Book;
import entity.BookManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookManager bookManager = new BookManager();

        do {
            System.out.println("Chon chuc nang:");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Xoa sach");
            System.out.println("4. Thoat");
            System.out.println("Lua chon cua ban:");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhap tieu de: ");
                    String bookTitle = sc.nextLine();
                    System.out.print("Nhap tac gia: ");
                    String bookAuthor = sc.nextLine();
                    System.out.print("Nhap ISBN: ");
                    String bookISBN = sc.nextLine();
                    System.out.print("Nhap nam xuat ban: ");
                    int bookYear = Integer.parseInt(sc.nextLine());

                    Book newBook = new Book(bookTitle, bookAuthor, bookISBN, bookYear);
                    bookManager.addBook(newBook);
                    break;

                case 2:
                    System.out.println("Danh sach sach:");
                    bookManager.displayBooks();
                    break;

                case 3:
                    System.out.print("Nhap ISBN sach can xoa: ");
                    String removeISBN = sc.nextLine();
                    bookManager.removeBook(removeISBN);
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Vui long chon so tu 1-4");
            }

        } while (true);
    }
}
