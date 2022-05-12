public class isPalindrome {
    public static void main(String[] args) {
        int x = 222;
        if (intPalindrome(x))
        System.out.println("solved");
        else System.out.println("not solved");
    }
    public static boolean intPalindrome(int x) {
        String xString = Integer.toString(x);
        if(xString.length() == 1) return  true;
        String reverse = new StringBuilder(xString).reverse().toString();
        if (xString.equals(reverse)) return true;

        return false;
    }
}
