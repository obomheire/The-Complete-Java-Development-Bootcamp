import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        /*
         * String[] staffLastYear = { "Tommy", "Joel", "Ellie" };
         * // String[] staffThisYear = staffLastYear;
         * String[] staffThisYear = new String[3];
         * 
         * for (int k = 0; k < staffLastYear.length; k++)
         * staffThisYear[k] = staffLastYear[k];
         * 
         * staffThisYear[1] = "Abby";
         * 
         * // System.out.println("Staff Last Year:- " + Arrays.toString(staffLastYear));
         * // System.out.println("Staff This Year:- " + Arrays.toString(staffThisYear));
         * 
         * // staffThisYear[1] = "Abby";
         * 
         * System.out.println("\nStaff Last Year:- " + Arrays.toString(staffLastYear));
         * System.out.println("Staff Thois Year:- " + Arrays.toString(staffThisYear));
         * 
         */

            String[] staffLastYear = { "Tommy", "Joel", "Ellie" };

        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);

            staffThisYear[1] = "Abby";

        System.out.println("\nStaff Last Year:- " + Arrays.toString(staffLastYear));
        System.out.println("Staff Thois Year:- " + Arrays.toString(staffThisYear));
    //     String[] array = { "ww", "rrrr" };
    //     demo(array);
    //     System.out.println(Arrays.toString(array));

    // }
    
    // public static void demo(String[] array) {
    //     array[0] = "hhh";
    }
}
