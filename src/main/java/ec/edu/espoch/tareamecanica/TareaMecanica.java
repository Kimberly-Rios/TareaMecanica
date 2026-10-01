package ec.edu.espoch.tareamecanica;


public class TareaMecanica {

    public static void main(String[] args) {
        
        Automobile automobileOne = new Automobile("Chevrolet", 2020, 1.8, FuelType.GASOLINE, CarType.FAMILY, 4, 5, 180, Color.VIOLET, 0);
        automobileOne.show();
        automobileOne.setCurrentSpeed(100);
        System.out.println("Velocidad Actual :" + automobileOne.getCurrentSpeed()+ " Km/h");
        automobileOne.accelerate(20);
        System.out.println("Velocidad Actual despues de acelerar los 20km :" + automobileOne.getCurrentSpeed()+ " Km/h");
        automobileOne.decelerate(50);
        System.out.println("Velocidad Actual despues de desacelerarlos 50km  :" + automobileOne.getCurrentSpeed()+ " Km/h");
        automobileOne.brake();
        System.out.println("Velocidad Actual despues de frenar :" + automobileOne.getCurrentSpeed()+ " Km/h");
        
    }
}
    

