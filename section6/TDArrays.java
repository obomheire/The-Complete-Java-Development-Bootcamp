public class TDArrays {
    public static void main(String[] args) {
        /*
        int[][] grades = new int[3][4];
        
        grades[0][0] = 72;
        grades[0][1] = 74;
        grades[0][2] = 76;
        grades[0][3] = 78;
        
        grades[1][0] = 62;
        grades[1][1] = 64;
        grades[1][2] = 66;
        grades[1][3] = 68;
        
        grades[2][2] = 56;
        grades[2][3] = 58;
        grades[2][0] = 52;
        grades[2][1] = 54;
        */
        
        int[][] grades = {
            {72, 74, 76, 78},
            {62, 64, 66, 68},
            {56, 54, 56, 68}
        };

        System.out.println("\tHarry: " + grades[0][0] + ", " + grades[0][1] + ", " + grades[0][2] + ", " + grades[0][3]);
        System.out.println("\tRon: " + grades[1][0] + ", " + grades[1][1] + ", " + grades[1][2] + ", " + grades[1][3]);
        System.out.println("\tHermione: " + grades[2][0] + ", " + grades[2][1] + ", " + grades[2][2] + ", " + grades[2][3]);
        System.out.println("Array Length: " + grades.length);
    }
    
}
