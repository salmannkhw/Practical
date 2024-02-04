import java.util.*;

public class BitManipulation {
    public static void main (String [] args) {
        Scanner Take = new Scanner(System.in);
        System.out.print("Enter a number you wish to manipulate the bit of: ");
        int N = Take.nextInt();
        System.out.print("Enter the poition of the bit you wish to manipulate: "); 
        int pos = Take.nextInt();
        int bitMask = 1 << pos;
        System.out.print("Select the operation you want to perform:\n1. Get Bit\n2. Set Bit\n3. Clear Bit\n4. Update Bit\nResponse: ");
        int option = Take.nextInt();
        switch (option) {
            case 1: {           // Get Bit - Find the Bit's value of a number at specific position
                if ((bitMask & N) == 0)
                    {
                    System.out.println("The bit is Zero.");
                }
                else {
                    System.out.println("The bit is one.");
                }
            break;
        
            }
            case 2: {           //  Set Bit - Change the bit to high state regardless the bit is one or zero
                System.out.println(bitMask | N);
            break;
            }

            case 3: {           //  Clear Bit - Change the bit to low state regardless the bit is one or zero
                int notBitMask = ~ bitMask;
                System.out.println(notBitMask & N);
            break;
            }

            case 4: {           //  Update Bit - Change the bit from one to zero and zero to one 
                if ((bitMask & N) == 0)         // Perform set bit
                {
                    System.out.println(bitMask | N);
                }
                else {                              // Perform clear bit
                    int notBitMask = ~ bitMask;
                    System.out.println(notBitMask & N);
                }
                
            break;
            }

            default:
            {
                System.out.println("Invalid option");
            }
            System.out.println();       // For answer to look clearer
        }
        Take.close();

    }
}
        /*
         * 01 = 0001
         * 02 = 0010
         * 03 = 0011
         * 04 = 0100
         * 05 = 0101
         * 06 = 0110
         * 07 = 0111
         * 08 = 1000
         * 09 = 1100
         * 10 = 1010
         */