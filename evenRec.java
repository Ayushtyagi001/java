import java.util.*;

public class evenRec {
    static void printnumber(int n) {
        if (n < 0) {
            return;
        }
        System.out.println(n);
        printnumber(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();
        printnumber(n);

    }

}
