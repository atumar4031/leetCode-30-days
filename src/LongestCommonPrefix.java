public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] words = {"flower","flow","flight"};
        String output = longestCommonPrefix(words);
        System.out.println(output);
    }

    public static String longestCommonPrefix(String[] strs) {
        String target = strs[0];
        int leng = strs[0].length();

        while (target.length() >= 1) {
            int count = 1;
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].startsWith(target)) {
                    count++;
                }
            }
            if (count == strs.length){
                return target;
            }
            target = target.substring(0, --leng);
        }
        return "";
    }
}
