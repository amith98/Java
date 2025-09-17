public class ScoreCheckingSystem {
    public static void main(String[] args) {
        int scoreArray[] = {50,40,60,70,90};
        for(int i : scoreArray) {
            if(i >= 90) {
                System.out.println("Score: "+i+" Excellent");
            } else if (i >=75 && i < 90) {
                System.out.println("Score: "+i+" Good");
            } else if (i >= 50 && i < 75) {
                System.out.println("Score: "+i+" Average");
            } else {
                System.out.println("Score: "+i+" Fail");
            }
        }
    }
    
}
