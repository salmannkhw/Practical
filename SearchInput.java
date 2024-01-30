import java.util.Scanner;
public class SearchInput {
    public static void main (String[] args) {
        Scanner Take = new Scanner(System.in);
        System.out.println("enter the limit you wish to set");
        int limit = Take.nextInt();
        int ar[] = new int[limit];
        System.out.println("Enter the values");
        for (int i=0; i<limit; i++) {
        ar [i] = Take.nextInt();
        }
        
        System.out.println("Enter the value you want to search");
        int look = Take.nextInt();
        for (int i=0; i<limit; i++) {
            if (ar[i] == look) {
                System.out.println("The index of your entry is " + i);
                break;
            }
        }

        Take.close();
    }
}

// Code to input values in array of given length and look for index of given value