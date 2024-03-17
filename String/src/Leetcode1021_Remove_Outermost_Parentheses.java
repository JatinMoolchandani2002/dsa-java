import java.util.Stack;



//The removeOuterParentheses method takes an input string s representing a sequence of parentheses.
//It uses a stack (bracket) to keep track of open and close parentheses.
//An empty StringBuilder (sb) is initialized to build the resulting string.
//The method iterates through each character in the input string:
//If it’s an openin g parenthesis '(', it checks if there’s an outer layer (i.e., the stack size is greater than 0). If so, it appends it to the sb.
//If it’s a closing parenthesis ')', it pops an element from the stack (matching the opening parenthesis). If the stack size is still greater than 0, it appends the closing parenthesis to the sb.
//The resulting string contains only the outermost layer of parentheses.
//In the main method, an example input string s is provided, and the removeOuterParentheses method is called to demonstrate its functionality.


public class Leetcode1021_Remove_Outermost_Parentheses {
    public static String removeOuterParentheses_using_stack(String s) {
        Stack<Character> bracket = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        for (int i=0; i<s.length();i++){
            if(s.charAt(i)=='('){
                if(bracket.size()>0){
                    sb.append(s.charAt(i));
                }
                bracket.push(s.charAt(i));
            }else{
                if(bracket.size()>1){
                    sb.append(s.charAt(i));
                }
                bracket.pop();
            }
        }
        return sb.toString();
    }


        public static void main(String[] args) {
        String s = "(()()()(()()))";
        String result = removeOuterParentheses_using_stack(s); // Call the static method
        System.out.println(result);
        }
    }
