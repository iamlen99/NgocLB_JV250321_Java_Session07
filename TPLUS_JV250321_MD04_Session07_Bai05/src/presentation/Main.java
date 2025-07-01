package presentation;

import entity.Category;
import entity.CategoryManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CategoryManagement categoryManagement = new CategoryManagement();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menu:");
            System.out.println("1. Them danh muc");
            System.out.println("2. Hien thi danh muc");
            System.out.println("3. Cap nhat danh muc");
            System.out.println("4. Xoa danh muc");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon: ");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhap ID danh muc: ");
                    int categoryId = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhap ten danh muc: ");
                    String categoryName = sc.nextLine();
                    System.out.print("Nhap mo ta danh muc: ");
                    String categoryDescription = sc.nextLine();

                    Category newCategory = new Category(categoryId, categoryName, categoryDescription);
                    categoryManagement.addCategory(newCategory);

                    System.out.println("Danh muc da duoc them.");
                    break;

                case 2:
                    for(Category category : categoryManagement.findAll()) {
                        category.display();
                    }
                    break;

                case 3:
                    System.out.print("Nhap ID danh muc can cap nhat: ");
                    int updateId = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhap ten moi: ");
                    String updateName = sc.nextLine();
                    System.out.print("Nhap mo ta moi: ");
                    String updateDescription = sc.nextLine();

                    Category updateCategory = new Category(updateId, updateName, updateDescription);
                    categoryManagement.updateCategory(updateCategory);
                    System.out.println("Danh muc da duoc cap nhat.");
                    break;

                case 4:
                    System.out.print("Nhap ID danh muc can xoa: ");
                    int deleteId = Integer.parseInt(sc.nextLine());
                    categoryManagement.deleteById(deleteId);
                    System.out.println("Danh muc da duoc xoa.");
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.err.println("Vui long nhap so tu 1-5");

            }
        } while (true);
    }
}
