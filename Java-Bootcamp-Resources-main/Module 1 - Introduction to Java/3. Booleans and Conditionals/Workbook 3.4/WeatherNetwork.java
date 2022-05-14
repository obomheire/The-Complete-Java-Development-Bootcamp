public class WeatherNetwork {
    public static void main(String[] args) {

        int temp = 8;  

        String forecast = "";

        //IF - ELSE IF - ELSE STATEMENTS HERE!

        //if temp between -15 and -1: "The forecast is FREEZING! Stay home!"

        //if temp between 0 and 10: "The forecast is Chilly. Wear a coat!";

        //else: It's warm. go outside!

        if (temp >= -15 && temp <= -1) {
            forecast = "FREEZING";
            System.out.println("The forecast is " + forecast + " Stay home!");
        } else if (temp >= 0 && temp <= 10) {
            forecast = "Chilly";
            System.out.println("The forecast is " + forecast + " Wear a coat!");
        } else {
            System.out.println("It's warm. go outside!");
        }

    }
}
