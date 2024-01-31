import java.util.Scanner;
public class ReverseString {
    public static void main (String[] args) {
        Scanner Take = new Scanner(System.in);
        StringBuilder name = new StringBuilder(Take.next());
        StringBuilder rName = new StringBuilder("");
        int limit = name.length();
        for (int i=0; i < name.length(); i++) {
            limit--;
            char a = name.charAt(limit);
            rName.append(a);
        }
        System.out.println(rName);
        Take.close();
    }
}