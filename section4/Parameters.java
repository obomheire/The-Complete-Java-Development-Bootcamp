public class Parameters {

    public static void main(String[] args) {
        measureRectangle(5.0, 4.0);
    }
    
    public static void measureRectangle(double lenght, double width) {
        double area = lenght * width;
        System.out.println("Area: " + area);
    }
    
}
