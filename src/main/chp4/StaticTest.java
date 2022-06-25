package main.chp4;
// program demonstrates  static methods

public class StaticTest {
    public static void main(String[] args) {
        // fill the array with Employees
        EmployeeOfStaticTest[] staff = new EmployeeOfStaticTest[3];
        staff[0] = new EmployeeOfStaticTest("John Smith", 45333d);
        staff[1] = new EmployeeOfStaticTest("Robin Williams", 49888d);
        staff[2] = new EmployeeOfStaticTest("Harry Potter", 47343d);

        // print out information about all Employees
        for(var e : staff){
            e.setId();
            System.out.println(("name: " + e.getName() + ", id: " + e.getId() +
                    ", salary: " + e.getSalary()));
        }

        int nextId = EmployeeOfStaticTest.getNextId();
        System.out.println(("Next available id: " + nextId));
    }
}

class EmployeeOfStaticTest{
    private static int nextId = 1;
    private String name;
    private double salary;
    private int id;


    EmployeeOfStaticTest(String name, double salary){
        this.name = name;
        this.salary = salary;
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

    public int getId() {
        return id;
    }

    public static int getNextId(){
        return EmployeeOfStaticTest.nextId;
    }

    public void setId() {
        this.id = EmployeeOfStaticTest.nextId;
        EmployeeOfStaticTest.nextId++;
    }

}
