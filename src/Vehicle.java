import java.util.Random;

class Vehicle {
    private String brand;
    private int speed;
    private double distanceTraveled;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        this.distanceTraveled = 0;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public void updateDistanceTraveled(double timeElapsed) {
        distanceTraveled += (speed * timeElapsed) / 3600.0;
    }
}