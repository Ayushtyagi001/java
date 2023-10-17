import java.util.Scanner;

public class weekday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter week day");
        String ch = sc.nextLine();
        switch (ch) {
            case "monday": {
                System.out.println("it is a weekday");
                break;
            }
            case "tuesday": {
                System.out.println("it is a weekday");
                break;
            }
            case "wednesday": {
                System.out.println("it is a weekday");
                break;
            }
            case "thursday": {
                System.out.println("it is a weekday");
                break;
            }
            case "friday": {
                System.out.println("it is a weekday");
                break;
            }
            case "saturday": {
                System.out.println("it is a weekend");
                break;
            }
            case "sunday": {
                System.out.println("it is a weekend");
                break;
            }
        }
        sc.close();
    }
}
