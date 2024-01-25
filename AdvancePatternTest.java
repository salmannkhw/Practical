public class AdvancePatternTest{
    public static void main (String[] args) {

        // Pattern (Bow tie)
        System.out.println("Bow tie pattern");
        for (int i=1; i<=4; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            for(int s=4-i; s>=1; s--){
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i=1; i<=4; i++) {
            for(int j = 4; j>=i; j--) {
                System.out.print("*");
            }
            for(int s=1; s<i; s++){
                System.out.print("  ");
            }
            for(int j = 4; j>=i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println("\n------------------------------\n");
        // Rhombus
        System.out.println("Rhombus");
        for (int i = 1; i<=5; i++) {
            for (int j = 5; j>i; j--){
                System.out.print(" ");
            }
            for (int j = 1; j<=5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n------------------------------\n");
        // Number Pyramid
        System.out.println("Number Pyramid");
        for (int i = 1; i<=5; i++) {
            for (int j = 5; j > i; j--){
                System.out.print(" ");
            }
            for(int j = i; j>0; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("\n------------------------------\n");
        // Palindrome
        System.out.println("Palindrome");
        for (int i = 1; i<=5; i++) {
            for (int j = 4; j>=i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k<i; k++) {
                System.out.print(i-k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }


    }
}