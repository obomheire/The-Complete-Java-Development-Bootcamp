// import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // String[] parts = { "Tires", "Keys" };
        Car[] cars = new Car[] {
                new Car("Nissan", 5000000.99, 2020, "red", new String[] { "Tires", "Keys"}),
                new Car("Dodge", 6000000.99, 2022, "blue", new String[] { "Tires", "Keys" }),
                new Car("Nissan2", 8000000.99, 2023, "yellow", new String[] { "Tires", "Filter" }),
                new Car("Humda", 7000000.99, 2021, "blue", new String[] { "Tires", "Filter" }),
                new Car("mercedes", 4000000.99, 2017, "yellow", new String[] { "Tires", "Filter", "Transmission" }),
        };

        /**
         * 
         * Car nissan = new Car();
         * String[] parts = { "Tires", "Keys" };
         * Car nissan = new Car("Nissan", 5000000.99, 2021, "red", parts);
         * Car dodge = new Car("Dodge", 6000000.99, 2022, "blue", parts);
         * 
         * Car nissan2 = new Car(nissan);
         * 
         * nissan2.setColor("Yellow");
         * 
         * nissan2.setParts(new String[] { "Tires", "Filter" });
         */

        /**
         * nissan.make = "Nissan";
         * nissan.price = 5000000.99;
         * nissan.year = 2021;
         * nissan.color = "red";
         */

        /**
         * Car dodge = new Car();
         * dodge.make = "Dodge";
         * dodge.price = 6000000.99;
         * dodge.year = 2022;
         * dodge.color = "blue";
         */

        /**
         * System.out.println("This " + nissan.make + " is worth $" + nissan.price + ".
         * It was build in " + nissan.year
         * + ". It is " + nissan.color + "\n");
         * 
         * System.out.println("This " + dodge.make + " is worth $" + dodge.price + ". It
         * was build in " + dodge.year
         * + ". It is " + dodge.color + "\n");
         */

        /**
         * nissan.setColor("Get Black");
         * dodge.setColor("Get Black");
         */

        /**
         * double newPrice = nissan.getPrice() / 2;
         * nissan.setPrice(newPrice);
         * dodge.setPrice(dodge.getPrice() / 2);
         */

        /**
         * System.out.println("This " + nissan.getMake() + " is worth $" +
         * nissan.getPrice() + ". It was build in " + nissan.getYear()
         * + ". It is " + nissan.getColor() + "\n");
         * 
         * System.out.println("This " + dodge.getMake() + " is worth $" +
         * dodge.getPrice() + ". It was build in " + dodge.getYear()
         * + ". It is " + dodge.getColor() + "\n");
         * 
         * System.out.println(
         * "This " + nissan2.getMake() + " 2 is worth $" + nissan2.getPrice() + ". It
         * was build in " + nissan2.getYear()
         * + ". It is " + nissan2.getColor() + "\n");
         */

        /**
         * nissan.drive();
         * dodge.drive();
         * nissan2.drive();
         */

        /**
         * System.out.println(Arrays.toString(nissan.getParts()));
         * System.out.println(Arrays.toString(nissan2.getParts()));
         */

        /**
         * NB: When you try to print an object, java will look for the toString() method
         * in the Car class.
         * System.out.println(nissan);
         * System.out.println(nissan2);
         * System.out.println(dodge);
         * 
         */

        Dealership dealership = new Dealership(cars);

        System.out.println(dealership);

        /**
         * dealership.setCars(nissan, 0);
         * dealership.setCars(dodge, 1);
         * dealership.setCars(nissan2, 2);
         */

        /**
         * 
         * for (int i = 0; i < cars.length; i++) {
         * dealership.setCars(cars[i], i);
         * // System.out.println(dealership.getCars(i));
         * }
         */

        /**
         * 
         * Car newCar = dealership.getCars(0);
         * newCar.setColor("Brown");
         * 
         * System.out.println(newCar);
         */
         

        // dealership.sellCar(2);
        // System.out.println(dealership.searchCar("Nissan2", 50000000));
        // System.out.println(dealership);
        
    }

}
