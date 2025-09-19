import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class SmallGroceryStore {
    //Function for calculating the final amount
    public static double totalCost(int pricePerUnit[],int quantityPerUnit[]) {
        double costTotal = 0.0d,amountFinal;
        
        for(int i =0;i<pricePerUnit.length;i++) {
            costTotal += (pricePerUnit[i] * quantityPerUnit[i]);
        }
        if (costTotal > 500) {
            double discountAmount = costTotal * (10.0/100.0);
            System.out.println("Total cost above 500. Applying 10% discount. Discount Amount: "+discountAmount);
            amountFinal = costTotal - discountAmount;
        } else {
            amountFinal = costTotal;
        }
        return amountFinal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String items[] = {"Rice","Sugar","Oil","Soap","Milk"};
        int pricePerUnit[] = {50,40,100,25,30};
        int itemsLength = items.length;
        int quantityPerUnit[] = new int[itemsLength];
        System.out.println("Enter the quantity for each item");
        for(int i =0;i<itemsLength;i++) {
            System.out.print(items[i]+": ");
            try {
                //sc.nextLine() to catch new line character after nextInt()
                quantityPerUnit[i] = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                //sc.nextLine() to store invalid input from the sc buffer inorder to avoid infinite loop
                System.out.println("Invalid input.Please enter a number");
                sc.nextLine();
                //i=i-1 to show the same item as it had invalid input
                i=i-1;
            }
        }
        double finalAmount = totalCost(pricePerUnit,quantityPerUnit);
        System.out.println("Final Amount: "+finalAmount);
        LocalDateTime curDateTime = LocalDateTime.now();
        //DateTimeFormatter to format the current date and time as given pattern
        DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = curDateTime.format(formatDateTime);
        System.out.println("Purchase Date & Time: "+formattedDate);
        sc.close();
       
    }
    
}
