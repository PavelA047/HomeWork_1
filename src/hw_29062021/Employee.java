package hw_29062021;

public class Employee {
    private String name;
    private String post;
    private String mail;
    private String number;
    private float salary;
    private int age;

    public Employee(String name, String post, String mail, String number, float salary, int age) {
        this.name = name;
        this.post = post;
        this.mail = mail;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.printf("Employee parameters: %s, %s, %s, %s, %.2f, %d \n", name, post, mail, number, salary, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", mail='" + mail + '\'' +
                ", number='" + number + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }
}
