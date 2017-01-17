package autosalon;

import java.util.Arrays;

/**
 * Created by java on 13.01.2017.
 */
public class Main {

    public static void main(String[] args) {
        Car[] cars = {new Lanos(160, 10, Configuration.BASIC),
                new Mercedes(220, 15, Configuration.LUX),
                new Opel(220, 18, Configuration.EXCLUSIVE),
                new Opel(180, 18, Configuration.BASIC),
                new Lanos(170, 12, Configuration.LUX),
                new Mercedes(180, 18, Configuration.BASIC)
        };

        for (Action car : cars) {
            car.stop();
            car.beep();
            car.drive();
        }

        AutoSalon autoSalon = new AutoSalon(cars);

        System.out.println("Total cars price: " + autoSalon.calculateCarsPrice());
        System.out.println(Arrays.toString(autoSalon.sortByFuelConsumption()));
        System.out.println(Arrays.toString(autoSalon.getCarsBySpeedRange(120, 160)));
    }
}
