package UHTest;

public class Teacher {
    // Properties
    private String subject;
    private String name;
    private double salary;
    private int age;

    // Constructor
    public Teacher(String subject, String name, double salary, int age) {
        this.subject = subject;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    // Method
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }

    // Getter dan Setter
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }
}
