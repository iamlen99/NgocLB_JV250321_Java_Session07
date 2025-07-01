package entity;

public class Manager extends Employee {
    private double bonus;
    public Manager() {}

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + this.bonus;
    }

    @Override
    public String toString() {
        return "Manager {" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", base salary=" + String.format("%,.1f", salary) +
                ", bonus" + String.format("%,.1f", bonus) +
                ", total salary=" + String.format("%,.1f", getSalary()) +
                '}';
    }
}
