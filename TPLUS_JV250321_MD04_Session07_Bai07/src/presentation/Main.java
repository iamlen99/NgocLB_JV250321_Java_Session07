package presentation;

import entity.Developer;
import entity.Employee;
import entity.Manager;

public class Main {
    public static void main(String[] args) {
        Employee employee1 =  new Employee("Ngoc", 12345, 8000000.0);
        Manager manager1 = new Manager("Long", 23456, 12000000.0, 3000000.0);
        Developer developer1 = new Developer("Hien", 34567, 10000000.0, "C++");

        System.out.println(employee1.toString());
        System.out.printf("Luong cua nhan vien 1: %,8.1f\n", employee1.getSalary());

        System.out.println(manager1.toString());
        System.out.printf("Luong cua quan ly 1: %,8.1f\n", manager1.getSalary());

        System.out.println(developer1.toString());
        System.out.printf("Luong cua lap trinh vien 1: %,8.1f\n", developer1.getSalary());

        System.out.println();
        System.out.println("Tang luong cho nhan vien:");
        employee1.increaseSalary(2000000);
        System.out.println(employee1.toString());
        System.out.printf("Luong cua nhan vien 1 sau tang: %,8.1f\n", employee1.getSalary());
    }
}
