import java.util.Objects;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {

        String[] sArray = s.split("");
        Stack<String> stack = new Stack<>();
        if(sArray.length % 2 != 0) return false;
        if(sArray[sArray.length - 1].equals("(")
                || sArray[sArray.length - 1].equals("[")
                || sArray[sArray.length - 1].equals("{"))
            return false;


        for (int i = 0; i < sArray.length; i++) {

            if (
                    stack.size() == 0
                    || sArray[i].equals("(")
                    || sArray[i].equals("[")
                    || sArray[i].equals("{")){
                        stack.push(sArray[i]);
                }
            else if(sArray[i].equals(")") && !stack.peek().equals("(")
                    || sArray[i].equals("]") && !stack.peek().equals("[")
                    || sArray[i].equals("}") && !stack.peek().equals("{")
            ){
                return false;
            }
            else{
                stack.pop();
            }
        }
        if(stack.size() == 0) return true;

        return false;
    }
}
