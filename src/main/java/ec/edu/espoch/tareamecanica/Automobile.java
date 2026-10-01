package ec.edu.espoch.tareamecanica;


public class Automobile {
    
    
    public Automobile(String brand, int model, double engine, FuelType FuelType, CarType CarType, int numberDoors, int numberSeats, double maximumSpeed, Color color, double currentSpeed) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.FuelType = FuelType;
        this.CarType = CarType;
        this.numberDoors = numberDoors;
        this.numberSeats = numberSeats;
        this.maximumSpeed = maximumSpeed;
        this.color = color;
        this.currentSpeed = currentSpeed;
    }

    public Automobile() {
    }
    
    public String brand;
    public int model;
    public double engine;
    public FuelType FuelType;
    public CarType CarType;
    public int numberDoors;
    public int numberSeats;
    public double maximumSpeed;
    public Color color;
    public double currentSpeed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public FuelType getFuelType() {
        return FuelType;
    }

    public void setFuelType(FuelType FuelType) {
        this.FuelType = FuelType;
    }

    public CarType getCarType() {
        return CarType;
    }

    public void setCarType(CarType CarType) {
        this.CarType = CarType;
    }

    public int getNumberDoors() {
        return numberDoors;
    }

    public void setNumberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
    
    public void accelerate(double currentspeed){
    if (currentSpeed + currentspeed > maximumSpeed) {
        System.out.println("No se puede acelerar, supera la velocidad maxima.");
        
    }else{ 
        currentSpeed += currentspeed;
    }
    
    }
    public void decelerate(double currentspeed){
     if (currentSpeed - currentspeed < 0) {
        System.out.println("No se puede desacelerar con una velocidad negativa. ");
        
    }else{ 
        currentSpeed -= currentspeed;
    }
}
    public void brake(){
    currentSpeed = 0;
}
    
    public double calculateTime(double distance){
    if (currentSpeed == 0) {
        System.out.println("No se puede calcular el tiempo porque el automovil esta detenido.");
        return 0;
    }
    return distance/ currentSpeed;
}

    public void show(){
    
    System.out.println(" DATOS DEL AUTOMOVIL ");
    System.out.println("Marca: " + brand);
    System.out.println("Modelo: " + model);
    System.out.println("Motor: " + engine + " litros");
    System.out.println("Tipo de combustible: " + FuelType);
    System.out.println("Tipo de automovil: " + CarType);
    System.out.println("Numero de puertas: " + numberDoors);
    System.out.println("Numero de asientos: " + numberSeats);
    System.out.println("Velocidad maxima: " + maximumSpeed + " km/h");
    System.out.println("Color: " + color);
    System.out.println("Velocidad actual: " + currentSpeed + " km/h");
}
}
   

    

