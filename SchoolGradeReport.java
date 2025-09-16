public class SchoolGradeReport {
    public static void main(String[] args) {
        int subjectMarks[] = {78,82,91,65,34};
        float totalMarks = 0.0f;
        int flag =0;
        float averageMarks;
        for(int i:subjectMarks) {
            if (i < 35) {
                System.out.println("Fail");
                flag =1;
                break;
            } else {
                totalMarks += i;
            }
            
        }
        if(flag == 0) {
        averageMarks = (totalMarks / subjectMarks.length);
        System.out.println("Average Marks: " + averageMarks);
        if (averageMarks >= 90) {
            System.out.println("Grade:A");
        } else if (averageMarks >=75 && averageMarks < 90) {
            System.out.println("Grade:B");
        } else if (averageMarks >=60 && averageMarks <75) {
            System.out.println("Grade:C");
        } else {
            System.out.println("Grade:D");
        }

        }
       
    }
    
}
