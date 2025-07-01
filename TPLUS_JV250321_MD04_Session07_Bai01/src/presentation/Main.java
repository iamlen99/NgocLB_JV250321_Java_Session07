package presentation;

import entity.Animals;
import entity.Cat;
import entity.Dog;

public class Main {
    public static void main(String[] args) {
        Animals[] animals = new Animals[100];
        int currentIndex = 0;
        animals[0] = new Dog("Buddy", 3, "Golden Retriever");
        animals[1] = new Cat("Whiskers", 2, "Ghi");
        animals[2] = new Cat("Whiskers", -5, "Ghi");
        currentIndex = currentIndex + 3;

        for (int i= 0; i < currentIndex; i++) {
            animals[i].displayInfo();
            System.out.println();
        }
    }
}
