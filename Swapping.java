import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println("before swapping -p=" + p + ",q=" + q);
        p = p + q;
        q = p - q;
        p = p - q;
        System.out.println("After swapping - p=" + p + ",q=" + q);
    }
}