import java.util.*;

public class powerR {
    static int findPower(int base, int exp) {
        if (exp == 1) {
            return base;
        } else {
            return base * findPower(base, exp - 1);
        }
    }

    public static void main(String[] args) {
        int res = findPower(2, 2);

        System.out.println("power is" + res);
    }

}
