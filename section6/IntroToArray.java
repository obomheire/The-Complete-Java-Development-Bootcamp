import java.util.Arrays;
public class IntroToArray {
    
    public static void main(String[] args) {
        String[] menu = { "Espresso", "Iced Coffee", "Maccrato" };
        // int[] menu = { 45, 47, 49 };

        menu[2] = "Latte";
        // menu[2] = 80;

        System.out.println("menu:- " + Arrays.toString(menu));

        String[] newMenu = new String[5];
        // int[] newMenu = new int[5];

        for (int k = 0; k < menu.length; k++) {
            newMenu[k] = menu[k];
        }
        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Rose";

        // newMenu[3] = 85;
        // newMenu[4] = 30;
        System.out.println("newMenu:- " + Arrays.toString(newMenu));


    }
}
