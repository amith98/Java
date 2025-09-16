public class InventoryCheck {
    public static void main(String[] args) {
        int stockQuantity[] = {20,15,30,0,25};
        int totalQuantity = 0;
        int flag = 0;
        for (int i=0; i < stockQuantity.length; i++) {
            if (stockQuantity[i] == 0) {
                System.out.println("Out of Stock");
                flag =1;
                break;
            } else {
                totalQuantity += stockQuantity[i];
            }
        }
        if(flag ==0) {
        System.out.println("Total quantity:" + totalQuantity);
        if(totalQuantity < 50) {
            System.out.println("Low Stock");
          
        } else if (totalQuantity >=50 && totalQuantity <=100) {
            System.out.println("Moderate Stock");
        } else {
            System.out.println("Good Stock");
        }

        }
        
        
    }
    
}
