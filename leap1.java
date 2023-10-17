import java.util.*;

class leap1

{
    public static void main(String k[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter value");
        n = sc.nextInt();
        if (n % 4 == 0) {
            if (n % 100 == 0) {
                if (n % 400 == 0) {
                    System.out.println("A leap year");
                } else {
                    System.out.println("Not a leap year");
                }
            } else {
                System.out.println("A leap year");
            }
        } else {
            System.out.println("Not a leap year");
        }
    }
}