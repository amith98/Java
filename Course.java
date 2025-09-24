class Course {
    String courseName;
    int numberOfWeeks;
    static int numberOfCourses;
    final String centerName = "Code Academy";
    Course() {
        courseName = "Python";
        numberOfWeeks = 4;
        numberOfCourses = 1;  
    }
    Course(String name, int duration) {
        this.courseName = name;
        this.numberOfWeeks = duration;
        numberOfCourses++;
    }
    class CourseMaterial {
        public void printMessage(){
            System.out.println("Materials provided for this course");
        }
    }
    public static void main(String[] args) {
        Course objcourse1 = new Course();
        Course objcourse2 = new Course("Java",8);
        System.out.println("Name: "+objcourse1.courseName+" Duration: "+objcourse1.numberOfWeeks+" Center Name: "+objcourse1.centerName);
        System.out.println("Name: "+objcourse2.courseName+" Duration: "+objcourse2.numberOfWeeks+" Center Name: "+objcourse2.centerName);
        System.out.println("Total number of Course: "+Course.numberOfCourses);
        Course outerclassObj = new Course();
        Course.CourseMaterial innerClassObj = outerclassObj.new CourseMaterial();
        innerClassObj.printMessage();
    }
    
}
