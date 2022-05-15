import java.util.Objects;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
//        Input: s = "()[]{}"
//        Output: true
//        Input: s = "(]"
//        Output: false
        String[] sArray = s.split("");
        int count = 0;
        for (int i = 0, j = i + 1; i < sArray.length - 1; i++, j++) {
            if (sArray[i].equals("(") && sArray[j].equals(")")){
                count++;
            }
            else if (sArray[i].equals("[") && sArray[j].equals("]")){
                count++;
            }
            else if (sArray[i].equals("{") && sArray[j].equals("}")){
                count++;
            }
        }
        if (count == sArray.length/2){
            return true;
        }

        return false;
    }
}
