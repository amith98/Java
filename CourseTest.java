class Course {
    String name;
    int duration;
    int numOfStudents;
    final String courseCreatorName = "CodeMentor Academy";
    static int trackNumberStudents;
    Course(String name,int duration,int numOfStudents) {
        this.name = name;
        this.duration = duration;
        this.numOfStudents = numOfStudents;
        trackNumberStudents += numOfStudents;
    }
    static class Platform {
        public void printMessage() {
            System.out.println("Courses are hosted on CodeMentor");
        }
    }
}
public class CourseTest {
    public static void main(String[] args) {
        Course objcourse1 = new Course("Arun", 20, 10);
        Course objcourse2 = new Course("Vasu", 40, 20);
        System.out.println("Name: "+objcourse1.name+" Duration: "+objcourse1.duration+" Number of Students: "+objcourse1.numOfStudents+" Course Creator: "+objcourse1.courseCreatorName);
        System.out.println("Name: "+objcourse2.name+" Duration: "+objcourse2.duration+" Number of Students: "+objcourse2.numOfStudents+" Course Creator: "+objcourse2.courseCreatorName);
        System.out.println("Total number of Students: "+Course.trackNumberStudents);
        Course.Platform nestedClassObj = new Course.Platform();
        nestedClassObj.printMessage();
    }
    
}
