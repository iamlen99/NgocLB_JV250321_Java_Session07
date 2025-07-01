package entity;

public class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        setName(name);
        setAge(age);
    }

    public Animals() {
    }

    public void displayInfo () {
        System.out.println("Ten: " + name + ", Tuoi: " + age);
        System.out.println("Am thanh: " + makeSound());
    }

    public String makeSound() {
        return "Some generic sound";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "Unknown";
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Tuoi khong hop le");
        } else {
            this.age = age;
        }
    }
}
