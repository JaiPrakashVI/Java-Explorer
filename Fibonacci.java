import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0,b = 1;
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++){
            temp=b;
            b=a+b;
            a=temp;
        }
        if ( n==0 ){
            System.out.println(0);
        }else if (n==1){
            System.out.println(1);
        }else {
            System.out.println(b);
        }
    }
}

