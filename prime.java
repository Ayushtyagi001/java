import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int count = 0;
        for (int i = 2; i <= n / 2; i++) {
          if (n % i == 0) {
            count++;
          }
        }
        if (count < 1) {
    System.out.println("number is  prime");
}
        else{
            System.out.println("number is  not prime");
        }
        sc.close();
    }
}

