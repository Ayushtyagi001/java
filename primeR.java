import java.util.*;

public class primeR {
    static boolean printpeime(int n, int i) {
        if (i <= 2) {
            return (n == 2) ? true : false;
        }
        if (n % i == 0) {
            return false;
        }
        return printpeime(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (printprime(n,i:2)) {
            System.out.println(n);
        }

    }
}
