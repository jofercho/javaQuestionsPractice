package string;

import java.util.Stack;

public class ValidParentheses {

    //[()()]
    //
    public boolean validParentheses(String str){

        char[] charArray = str.toCharArray();
        Stack<Character> parentheses = new Stack<>();
        for(int i = 0; i < charArray.length; i++){
            char c = charArray[i];
            if(c == '(' || c == '[' || c == '{'){
                parentheses.push(c);
            }
            if(c == ')' && !parentheses.isEmpty() && !(parentheses.pop() == '(')){
                return false;
            }
            if(c == ']' && !parentheses.isEmpty() && !(parentheses.pop() == '[')){
                return false;
            }
            if(c == '}' && !parentheses.isEmpty() && !(parentheses.pop() == '{')){
                return false;
            }
        }
        return parentheses.isEmpty();
    }
}
