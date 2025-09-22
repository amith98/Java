import java.util.Scanner;
abstract class Ride {
    abstract int calculateFare(int distance);
    public void rideType() {
        System.out.println("Generic Ride");
    }
}
class AutoRide extends Ride {
    public int calculateFare(int distance) {
        int fareResult = 10 * distance;
        return fareResult;
    }
    public void rideType() {
        System.out.println("Auto Ride");
    }
}
class CarRide extends Ride {
    public int calculateFare(int distance) {
        int fareResult = 20 * distance;
        return fareResult;
    }
    public void rideType() {
        System.out.println("Car Ride");
    }
}
public class BookingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the ride type 'Auto' or 'Car'");
        String rideType = sc.nextLine();
        System.out.println("Please enter the distance in km");
        int distanceKm = sc.nextInt();
        sc.nextLine();
        //equalIngoreCase() to compare string value ignoring input case type
        if (rideType.equalsIgnoreCase("auto")) {
            AutoRide objAuto = new AutoRide();
            objAuto.rideType();
            int fareDistance = objAuto.calculateFare(distanceKm);
            System.out.println("Total Fare: "+fareDistance);

        } else {
            CarRide objCar = new CarRide();
            objCar.rideType();
            int fareDistance = objCar.calculateFare(distanceKm);
            System.out.println("Total Fare: "+fareDistance);
        }
        sc.close();

    }
    
}
