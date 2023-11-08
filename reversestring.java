public class reversestring {
    static String revStr(int n, String s)

    {
        if (s.length() == 0)
            return " ";
        char currchar = s.charAt(0);
        String smallans = revStr(s.substring(1), n + 1);
        String ans = smallans + currchar;
        return ans;
    }

    public static void main(String[] args) {
        String s = "HELLO";
        System.out.println(s, 0);
    }

}
