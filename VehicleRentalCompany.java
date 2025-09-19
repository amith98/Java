interface Vehicle {
    public void start();
    public void stop();
}

interface FuelBased {
    public void refuel();
}

class  Car implements Vehicle,FuelBased {
    public void start() {
        System.out.println("Car engine started.");
    }
    public void stop() {
        System.out.println("Car engine stopped.");
    }
    public void refuel() {
        System.out.println("Car is refueling at the station.");
    }
}

class ElectricScooter implements Vehicle {
    public void start() {
        System.out.println("Electric scooter powered on.");
    }
    public void stop() {
        System.out.println("Electric scooter powered off.");
    }
}
public class VehicleRentalCompany {
    public static void main(String[] args) {
        Car objCar = new Car();
        ElectricScooter objElectricScooter = new ElectricScooter();
        objCar.start();
        objCar.refuel();
        objCar.stop();
        objElectricScooter.start();
        objElectricScooter.stop();
    }
    
}
