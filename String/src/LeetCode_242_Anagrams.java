import java.util.Arrays;

public class LeetCode_242_Anagrams {
    public boolean isAnagram(String s, String t) {
        /*An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once*/
        /** Sorting the s and t lexographically(in dictionary form) will help to sort the whole string uniformely and then compare each other**/
        /*To sort the string lexographically , we first have to change it to character array*/
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(s1,t1);// to check the sorted arrays are equal or not
    }
}
