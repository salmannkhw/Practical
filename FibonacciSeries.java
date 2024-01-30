import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner Take = new Scanner(System.in);

        //  Print Fibonacci series of upto nth term

        System.out.println("Enter a number");
        int a = 0, b = 1, c, n = Take.nextInt();

        for (int i = 1; i <= n; i++ ) {

            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}

/* I have seen some tutorials regarding this series and found they usually print first two digits manually and start loop with 3rd digit
 * I find this to be unnecessary and here is an improved version of it.
 */