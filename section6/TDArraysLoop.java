public class TDArraysLoop {
    public static void main(String[] args) {
        int[][] grades = {
                { 72, 74, 76, 78 },
                { 62, 64, 66, 68 },
                { 56, 54, 56, 68 }
        };

        for (int k = 0; k < grades.length; k++) {

            switch (k) {
                case 0:
                    System.out.print("\tHarry: ");
                    break;
                case 1:
                    System.out.print("\tRon: ");
                    break;
                case 2:
                    System.out.print("\tHermione: ");
                    break;
            }
            for (int j = 0; j < grades[0].length; j++) {

                System.out.print(grades[k][j] + " ");
            }
            System.out.println("\n");
        }
        // System.out.println(grades[0].length);
       
    }
}
