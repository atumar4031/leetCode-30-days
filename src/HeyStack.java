public class HeyStack {
    public static void main(String[] args) {
        String haystack = "ablele";
        String needle = "ak";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        return haystack.indexOf(needle);
    }
}
