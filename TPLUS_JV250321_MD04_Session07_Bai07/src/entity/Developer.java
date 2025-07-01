package entity;

public class Developer extends Employee {
    private String proprammingLanguage;
    public Developer() {}
    public Developer(String name, int id, double salary, String proprammingLanguage) {
        super(name, id, salary);
        this.proprammingLanguage = proprammingLanguage;
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public String toString() {
        return "Developer {" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + String.format("%,.1f", salary) +
                ", language=" + proprammingLanguage +
                '}';
    }
}
