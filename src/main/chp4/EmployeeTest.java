package main.chp4;
import java.time.*;

public class EmployeeTest {
    public static void runEmployeeTest(){
        // fill the staff array with Employee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Potter"  , 150000, 1989, 10, 1);
        staff[2] = new Employee("Forrest Gump", 97000, 1995, 3, 2);

        // raise salaries by 5%
        for(Employee emp : staff){
            emp.raiseSalary(5);
        }

        // printout information about all Employee objects
        for(Employee emp : staff){
            System.out.println("Name: " + emp.getName() + ", salary: " + emp.getSalary() +
                    ", hireDay: " + emp.getHireDay());
        }
    }
}

class Employee{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        salary += salary * (byPercent / 100);
    }
}
