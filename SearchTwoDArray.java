import java.util.Scanner;

public class SearchTwoDArray {
    public static void main (String[] args) {
        
        Scanner Take = new Scanner(System.in);
        System.out.print("Enter your matrix dimensions.\nRows: ");
        int rows = Take.nextInt();
        System.out.print("Columns: ");
        int cols = Take.nextInt();
        int TwoD [][] = new int [rows][cols];
        System.out.println("Start entering values in rows");
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
            TwoD [i][j] = Take.nextInt();
            }
        }

        System.out.print("Enter the value you wish to find the index of: ");
        int look = Take.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (TwoD [i][j] == look) {
                    System.out.println("The index of " + look + " is " + i + ", " + j);
                    // Can use the following to print location mathematically instead zero base index value:
                    // System.out.println("The location of " + look + " is " + (i + 1) + " row and " + (j + 1) + " column");
                }
            }
        }


        Take.close();

        /* 
            I have created this optional code which you can use to print the whole matrix
            for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(TwoD[i][j] + " ");
            }
            System.out.println();
        }
        */
    }
}
