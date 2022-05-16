// import java.util.Arrays;

public class Dealership {
    
    private Car[] cars;

    /**
     * 
     * NB:
     * don't use Arrays.copyof() on an array of obeject,
     * Arrays.copyof() will shallow copies the refrence in each elements,
     * 
     */

    public Dealership(Car[] cars) {
        this.cars = new Car[cars.length];
        for (int i = 0; i < cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }
    }
  

    public void setCars(Car car, int index) {
        this.cars[index] = new Car(car);
    }

    public Car getCars(int index) {
        return new Car(this.cars[index]); // This will return a copy of the Car class object.
    }
    
    public void sellCar(int index) {
        this.cars[index].drive();
        this.cars[index] = null;
    }

    public String searchCar(String make, int budget) {

        for (int i = 0; i < cars.length; i++) {
            if (this.cars[i] == null) {
                continue;
            } else if (this.cars[i].getMake().equals(make) && this.cars[i].getPrice() <= budget) {
                // this.sellCar(i);
                return "\nWe found one in sport " + i + "\n" + this.cars[i].toString() + "\nAre you interested?";
            }
        }

        return "Sorry we could't find any car";

    }
    
    public String toString() {
        String temp = "";
        for (int i = 0; i < cars.length; i++) {
            temp += "\nParking sport " + i + "\n";
            if (this.cars[i] == null) {
                temp += "This sport is empty\n";
            } else {
                temp += this.cars[i].toString() + "\n";
            }
           
        }

        return temp;
    }

}
