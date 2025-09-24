class Student {
    private String name;
    private int rollNo;
    private double percentage;

    public String getName() {
        return name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public double getPercentage() {
        return percentage;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
public class StudentTest {
    public static void main(String[] args) {
        Student objStudent = new Student();
        objStudent.setName("Varun");
        objStudent.setRollNo(101);
        objStudent.setPercentage(90.28);
        System.out.println(objStudent.getName());
        System.out.println(objStudent.getRollNo());
        System.out.println(objStudent.getPercentage());
    }
    
}
