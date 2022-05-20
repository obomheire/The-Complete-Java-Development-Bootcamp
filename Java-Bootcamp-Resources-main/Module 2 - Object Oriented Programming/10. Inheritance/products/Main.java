import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import models.Pants;
import models.Product;
import models.Shirt;

public class Main {

    static final String FILE_NAME = "products.txt";

    /**
     * Function Name: getData
     * 
     * @return Product[]
     * @throws FileNotFoundException
     * 
     *  Inside the function:
     *  1. Loads the data from products.txt
     */

    public static void main(String[] args) {
        try {
            Product[] products = getData();
            Arrays.sort(products);
            for (int i = 0; i < products.length; i++) {
                System.out.println(products[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static Product[] getData() throws FileNotFoundException {
           FileInputStream fis =  new FileInputStream(FILE_NAME);
           Scanner scan = new Scanner(fis);
           Product[] products = new Product[18];

           for (int i = 0; scan.hasNextLine(); i++) {
               switch(scan.next()) {
                   case "PANTS": products[i] = new Pants(scan.nextInt(), scan.nextDouble(), scan.next(), scan.next()); break;
                   case "SHIRT": products[i] = new Shirt(Shirt.Size.valueOf(scan.next()), scan.nextDouble(), scan.next(), scan.next()); break;
               }
           }
           scan.close();
           return products;
        }

}

/**
 * 
 * public static void main(String[] args) {
 * 
 * Product[] products = new Product[] {
 * new Pants(32, 24.99, "Blue", "JAVA KLEIN"),
 * new Shirt(Shirt.Size.MEDIUM, 22.99, "Black", "CHANEL"),
 * new Pants(34, 104.99, "Red", "JANGLER"),
 * new Shirt(Shirt.Size.SMALL, 13.99, "Orange", "GEORGE"),
 * new Pants(30, 119.99, "Grey", "FENDI"),
 * new Shirt(Shirt.Size.LARGE, 34.99, "Blue", "ECKO"),
 * new Pants(30, 129.99, "Red", "VERSACE"),
 * new Shirt(Shirt.Size.SMALL, 22.99, "Beige", "ZARA"),
 * new Pants(29, 99.99, "Dark", "JANGLER"),
 * new Shirt(Shirt.Size.SMALL, 19.99, "Red", "NIKE"),
 * new Pants(26, 24.99, "Indigo", "BELSTAFF"),
 * new Shirt(Shirt.Size.LARGE, 29.99, "Blue", "ADIDAS"),
 * new Pants(34, 104.99, "Red", "JANGLER"),
 * };
 * Arrays.sort(products);
 * printArray(products);
 * 
 * }
 * 
 * public static void printArray(Product[] array) {
 * for (int i = 0; i < array.length; i++) {
 * System.out.println(array[i]);
 * }
 * }
 */

/**
 * 
 * public static void main(String[] args) {
 * 
 * Product[] products = new Product[] {
 * new Pants(32, 24.99, "Blue", "JAVA KLEIN"),
 * new Pants(34, 104.99, "Red", "JANGLER"),
 * new Pants(30, 119.99, "Grey", "FENDI"),
 * new Pants(30, 129.99, "Red", "VERSACE"),
 * new Pants(29, 99.99, "Dark", "JANGLER"),
 * new Pants(26, 24.99, "Indigo", "BELSTAFF"),
 * new Pants(34, 104.99, "Red", "JANGLER"),
 * };
 * Arrays.sort(products);// Because we have a compare methord defined, the sort
 * methord will call it behind the seen
 * printArray(products);
 * 
 * }
 * 
 * public static void printArray(Product[] array) {
 * for (int i = 0; i < array.length; i++) {
 * System.out.println(array[i]);
 * }
 * }
 * 
 */
