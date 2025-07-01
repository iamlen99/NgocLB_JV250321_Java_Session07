package entity;

public class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public Employee() {
    }

    public double getSalary() {
        return salary;
    }

    public double increaseSalary(double amount) {
        return salary += amount;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + String.format("%,.1f", salary) +
                '}';
    }
}
