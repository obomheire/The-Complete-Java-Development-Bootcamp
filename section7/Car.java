import java.util.Arrays;

public class Car {

    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;
        
    public Car(String make, double price, int year, String color, String[] parts) {
        // System.out.println("Hello from constructor!");
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }
    
    //This is a copy constructor

    public Car(Car copyConstructor) {
        this.make = copyConstructor.make;
        this.price = copyConstructor.price;
        this.year = copyConstructor.year;
        this.color = copyConstructor.color;
        this.parts = Arrays.copyOf(copyConstructor.parts, copyConstructor.parts.length);
    }

    public String getMake() {
        return this.make;
    }

    public double getPrice() {
        return this.price;
    }

    public int getYear() {
        return this.year;
    }

    public String getColor() {
        return this.color;
    }

    public String[] getParts() {
        //NB: return this.parts will only return the refrence to the parts array but bellow will
        // return a copy of the class array.
        return Arrays.copyOf(this.parts, this.parts.length);
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void  setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public void drive() {
        System.out.println("You bougth the beautiful " + this.year + " " + this.color + " " + this.make + " for "
                + this.price + ".");
        System.out.println("Please drive your car to the neartest exit. \n");
    }

    public String toString() {
        return "Make: " + this.make + ".\n" + "Price: " + this.price + ".\n" + "Year: " + this.year + ".\n" + "Color: "
                + this.color + ".\n" + "Parts: " + Arrays.toString(this.parts) + ".\n";
    }
    
}
