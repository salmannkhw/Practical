import java.util.Scanner;
public class Recursion {

    public static void SumN (int Num, int Total) {
        if (Num == 0) {
            System.out.println(Total);
            return;
        }
        Total = Total + Num;
        Num--;
        SumN(Num, Total);
    }

    public static void main (String [] args) {
        //  Print the sum of N natural numbers using Recursion.
        Scanner Take = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = Take.nextInt();
        SumN (N, 0);

        Take.close();
    }
}