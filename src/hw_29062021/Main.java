package hw_29062021;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivan", "boss", "1@mail.ru", "8999999",
                150000, 30);
        employees[1] = new Employee("Stepan", "manager", "2@mai.ru", "8999998",
                60000, 25);
        employees[2] = new Employee("Fedor", "manager", "3@mai.ru", "8999997",
                60000, 44);
        employees[3] = new Employee("Alex", "manager", "4@mai.ru", "8999996",
                60000, 23);
        employees[4] = new Employee("Nick", "manager", "5@mai.ru", "8999995",
                60000, 51);

//        System.out.println(Arrays.toString(employees));
//        employees[3].info();
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}
