import java.util.Random;

public class VehicleRace {
    public static void main(String[] args) {
        Random rand = new Random();

        Vehicle Ford = new Vehicle("Ford", rand.nextInt(11) + 95); // Speed between 95 and 105 mph
        Vehicle Ferrari = new Vehicle("Ferrari", rand.nextInt(11) + 95); // Speed between 95 and 105 mph

        System.out.println("Initial information:");
        System.out.println(Ford.getBrand() + ": Speed: " + Ford.getSpeed() + " mph, Distance Traveled: " + Ford.getDistanceTraveled() + " miles");
        System.out.println(Ferrari.getBrand() + ": Speed: " + Ferrari.getSpeed() + " mph, Distance Traveled: " + Ferrari.getDistanceTraveled() + " miles");

        double finishLine = 500.0;
        while (Ford.getDistanceTraveled() < finishLine && Ferrari.getDistanceTraveled() < finishLine) {
            double timeElapsed = 1.0; // 1 second
            int car1SpeedVariation = rand.nextInt(21) - 10;
            int car2SpeedVariation = rand.nextInt(21) - 10;

            Ford.updateDistanceTraveled(timeElapsed * (Ford.getSpeed() + car1SpeedVariation));
            Ferrari.updateDistanceTraveled(timeElapsed * (Ferrari.getSpeed() + car2SpeedVariation));

            System.out.println("\nRace Progress:");
            System.out.println(Ford.getBrand() + ": Speed: " + Ford.getSpeed() + " mph Distance Traveled: " + Math.round(Ford.getDistanceTraveled()) + " miles");
            System.out.println(Ferrari.getBrand() + ": Speed: " + Ferrari.getSpeed() + " mph Distance Traveled: " + Math.round(Ferrari.getDistanceTraveled()) + " miles");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nRace Results:");
        if (Ford.getDistanceTraveled() >= finishLine && Ferrari.getDistanceTraveled() >= finishLine) {
            if (Ford.getDistanceTraveled() > Ferrari.getDistanceTraveled()) {
                System.out.println("It's a tie!");
            } else {
                System.out.println("It's a tie!");
            }
        } else if (Ford.getDistanceTraveled() >= finishLine) {
            System.out.println(Ford.getBrand() + " wins!");
        } else {
            System.out.println(Ferrari.getBrand() + " wins!");
        }
    }
}