public class StoreManagerTrack {
    public static void main(String[] args) {
        int salesData[][] = {{10,20,30},
                             {20,30,40},
                             {30,40,50},
                             {60,70,80},
                             {50,30,40}};
        int productTotal[] = new int[3];
        int productTotalSales;
        for(int j=0; j <3; j++) {
            for(int i=0;i <5; i++) {
                productTotal[j] += salesData[i][j];
            }
            System.out.println(productTotal[j]);
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
