public class Runner {
    public static void main(String[] args) {
        // your code here
        Garage myGarage = new Garage();
        Car newCar = new Car("Daniel");
        Car anotherCar = new Car("Sasha");

        myGarage.add(newCar);
        myGarage.set(0, anotherCar);
        myGarage.get(0);
    }
}
