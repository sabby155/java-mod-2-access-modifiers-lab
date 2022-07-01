import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List cars = new ArrayList<>();

    public Car get(int index) {
        Car result = (Car) cars.get(index);
        System.out.println("Getting car:" + result.name);
        return result;
    }

    public void add(Car car) {
        System.out.println("Adding car: " + car.name);
        cars.add(car);
    }

    public void set(int i, Car setCar) {
        System.out.println("Setting car: " + setCar.name);
        cars.set(i, setCar);
    }
}
