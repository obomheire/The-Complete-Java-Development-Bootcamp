import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Car nissan = new Car("Nissan", 2016);
        System.out.println("Nissan: " + nissan.hashCode());

        Car dodge = new Car("Dodge", 2016);
        System.out.println("Dodge: " + dodge.hashCode());

        Car toyota = new Car("Toyota", 2016);
        System.out.println("Toyota: " + toyota.hashCode());

        Car nissan2 = new Car(nissan);
        System.out.println("Nissan2: " + nissan2.hashCode());

        HashMap<Car, Double> prices = new HashMap<Car, Double>();
        prices.put(nissan, 1000.0);
        prices.put(dodge, 2000.0);
        prices.put(toyota, 3000.0);
        System.out.println(prices.get(nissan2));
    }
}
