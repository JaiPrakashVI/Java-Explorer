import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            while (true) { // just to run the while loop inside this for multiple times without running the whole program again
                int n = sc.nextInt();
                int rev = 0;
                while (true) {
                    while (n > 0) {
                        int rem = n % 10;
                        rev = rev * 10 + rem;
                        n /= 10;
                        // System.out.println(rev); #reverse pattern
                    }
                    System.out.println(rev); // complete reverse string
                    break;
                }
            }
        }
    }

