// Find Greatest Common Divisor

import java.util.Scanner;
public class Gcd {
    public static void main (String[] args) {
        Scanner Take = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int Small, a = Take.nextInt(), b = Take.nextInt();

        if (a>b) Small = b;
        else Small = a;

        for (int i=Small; i>0; i--) {
            if (a%i ==0 && b%i == 0) {
            System.out.println("The Greatest common divisor is " + i);
            break;
            }
        }
    }
}