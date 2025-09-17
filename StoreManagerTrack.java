public class StoreManagerTrack {
    public static void main(String[] args) {
        int salesData[][] = {{10,20,30},
                             {20,30,40},
                             {30,40,50},
                             {60,70,80},
                             {50,30,40}};
        int productTotal[] = new int[3];
        int productTotalSales;
        for(int i=0; i< 5;i++) {
            for(int j=0; j< 3;j++) {
                switch(j) {
                    case 0: productTotal[0] += salesData[i][j];
                            break;
                    case 1: productTotal[1] += salesData[i][j];
                            break;
                    case 2: productTotal[2] += salesData[i][j];
                            break;
                    default: System.out.println("Invalid condition");
                            break;
                }
            }
    }
    for(int i=0; i < 3;i++){
        productTotalSales = productTotal[i];
        if(productTotalSales >= 500) {
            System.out.println("Product "+(i+1)+" Total Sales "+productTotalSales+" Target Achieved");
        } else if(productTotalSales >= 300 && productTotalSales < 500) {
            System.out.println("Product "+(i+1)+" Total Sales "+productTotalSales+" Average Performance");
        } else {
            System.out.println("Product "+(i+1)+" Total Sales "+productTotalSales+" Needs Improvement");
        }
    }
 }
}
