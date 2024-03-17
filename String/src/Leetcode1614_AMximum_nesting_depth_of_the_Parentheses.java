public class Leetcode1614_AMximum_nesting_depth_of_the_Parentheses {
/*The maximum depth in the given context refers to the greatest level of nesting (or how deeply the parentheses are nested) within a valid parentheses string.
 Specifically, it represents the depth of parentheses when analyzing the input string using the provided algorithm.
In this case, the algorithm processes the input string from left to right.
It calculates the maximum depth by keeping track of the number of unmatched opening parentheses and adjusting the count as closing parentheses are encountered.

For example, if the input string is "(1+(2*3)+((8)/4))+1",
the maximum depth occurs when nesting the expression 8/4 within the parentheses: ((8)/4).
 The maximum depth in this case is 3.
 */



    public static int maxDepth(String s) {
        int openCount = 0;
        int pairCount = 0;
        int count =0;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == '(') {
                openCount++;
            } else if (s.charAt(i) == ')' && openCount > 0) {
                if(openCount>count){
                    count=openCount;
                }
                openCount--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s= "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }

}
