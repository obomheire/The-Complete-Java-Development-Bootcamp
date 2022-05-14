public class BreakAndContinue {

    public static void main(String[] args) {
        for (int k = 1; k <= 10; k++) {
            if (k % 2 != 0) {
                continue;
            }
            /*
             * if (k % 2 != 0) {
             * break;
             * }
             */

            System.out.println(k);
        }
    }
    
}
