import java.util.Scanner;

public class CharCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);    // trim removes the extra spaces here & charAt returns the char in the particular index of the string
        if (ch >= 'a' && ch<= 'z'){
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }


    }
}
