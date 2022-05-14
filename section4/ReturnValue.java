public class ReturnValue {

    public static void main(String[] args) {
        double result = measureRectangle(2.3, 4.1);
        double result1 = measureRectangle(3.9, 4.3);
        double result2 = measureRectangle(5.2, 4.6);
        double result3 = measureRectangle(9.1, 5.9);
        double result4 = measureRectangle(5.7, 4.3);

        printString(2.9, 4.1, result);
        printString(3.9, 4.3, result1);
        printString(5.2, 4.6, result2);
        printString(9.1, 5.9, result3);
        printString(5.7, 4.3, result4);
    }

    public static double measureRectangle(double lenght, double width) {
        double area = lenght * width;
        return area;
    }

       public static void printString(double lenght, double width, double area) {
           System.out.println("Area of a rectangle lenght " + lenght + " width " + width + " is " + area);          
}
}
