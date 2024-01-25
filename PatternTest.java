public class PatternTest {
    public static void main (String[] args) {
        int x;      // I needed an extra Variable in some of the problems
        // Solid Rectangle
        for (int i=1; i<=4; i++) {
            for(int j=1; j<=20; j++){
            System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("==============");

        // Hollow rectangle
        for (int i=1; i<=4; i++) {
            for (int j=1; j<=5; j++){
                if (i==1 || i==4 || j==1 || j==5)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("==============");

        // Half pyramid
        for(int i =1; i<=4; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        } 
        System.out.println("==============");

        // Inverted half pyramid
        x = 1;
        for(int i = 4; i>0; i--) 
        {
            for (int j=1; j < i; j++){
                System.out.print(" ");
            }   
            for (int j=1; j<=x; j++) {
                System.out.print("*");
            }
            System.out.println();
            x++;
        }
        System.out.println("==============");

        // number pyramid
        for(int i = 1; i<=5; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("==============");

        // number pyramid inverted
        for(int i = 5; i>0; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
         System.out.println("==============");
         
        // Number Pyramid continous
        x = 1;
        for (int i=1; i<=5; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
        System.out.println("==============");
        // Binary pyramid
        x = 1;
        for(int i = 1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(x%2);
                x++;
            }
            System.out.println();
        }

    }
}