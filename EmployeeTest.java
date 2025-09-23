class Employee {
    private String name;
    private int idNumber;
    private String department;
    private double salary;
    
    public String getName() {
        return name;
    }
    public int getIdNumber() {
        return idNumber;
    }
    public String getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setIdNumber(int number) {
        this.idNumber = number;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee objemp1 = new Employee();
        Employee objemp2 = new Employee();
        objemp1.setName("Akhil");
        objemp1.setIdNumber(1);
        objemp1.setDepartment("Computer Science");
        objemp1.setSalary(360.0);
        objemp2.setName("Athul");
        objemp2.setIdNumber(2);
        objemp2.setDepartment("Electronic Engineering");
        objemp2.setSalary(450.0);
        System.out.println("Employee 1 Details:");
        System.out.println("Name: "+objemp1.getName()+" ID Number: "+objemp1.getIdNumber()+" Department: "+objemp1.getDepartment()+" Salary: "+objemp1.getSalary());
        System.out.println("Employee 2 Details: ");
        System.out.println("Name: "+objemp2.getName()+" ID Number: "+objemp2.getIdNumber()+" Department: "+objemp2.getDepartment()+" Salary: "+objemp2.getSalary());
    }
    
}
