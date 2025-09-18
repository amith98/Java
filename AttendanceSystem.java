import java.time.LocalDateTime;
import java.util.Scanner;
public class AttendanceSystem {
    public static double averageMarks(int numberOfStudents, int markArray[]) {
        double totalMarks = 0.0d;
        for(int i : markArray) {
            totalMarks += i;
        }
        double averageMark = totalMarks / numberOfStudents;
        return averageMark;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numOfStudents = sc.nextInt();
        //sc.nextLine() is to consume the new line character left behind by nextInt()
        sc.nextLine();
        String nameOfStudents[] = new String[numOfStudents];
        int markOfStudents[] = new int[numOfStudents];
        System.out.println("Enter the name and marks of students:");
        for(int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter name of student "+(i+1));
            nameOfStudents[i] = sc.nextLine();
            System.out.println("Enter mark of student "+(i+1));
            markOfStudents[i] = sc.nextInt();
            //sc.nextLine() is to consume the new line character left behind by nextInt()
            sc.nextLine();
        }
        for(int i =0; i < numOfStudents; i++) {
            if(markOfStudents[i] < 35)
                System.out.println("Name: "+nameOfStudents[i]+" Marks: "+markOfStudents[i]+" Needs Improvement");
            else
                System.out.println("Name: "+nameOfStudents[i]+" Marks: "+markOfStudents[i]);
        }
        double markAverage = averageMarks(numOfStudents,markOfStudents);
        System.out.println("Average Marks: "+markAverage);
        LocalDateTime curDateTime = LocalDateTime.now();
        System.out.println(curDateTime);

        sc.close();
        
    }
    
}
