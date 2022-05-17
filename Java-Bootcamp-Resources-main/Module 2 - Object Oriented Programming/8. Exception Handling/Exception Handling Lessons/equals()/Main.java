public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "Blue");
        Car sameCar1 = new Car(car);
        Car sameCar2= car;
        System.out.println(car.equals(sameCar1));
        System.out.println(car.equals(sameCar2));
        
    }

}
