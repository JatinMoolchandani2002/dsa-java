import java.util.Arrays;

public class Leetcode14Largestcommonprefix {
    //The reason for sorting the array of strings at the beginning of the function is to take advantage of the properties of lexicographical order.
    //
    //When an array of strings is sorted, the strings are arranged in order such that the string with the smallest lexicographical value is at the beginning and the string with the largest lexicographical value is at the end.
    //
    //The longest common prefix of all the strings in the array must also be a prefix of the smallest and largest strings. This is because any prefix that is not common to the smallest and largest strings cannot be a common prefix of all the strings.
    //
    //By only comparing the first and last strings in the sorted array, the algorithm reduces the number of comparisons needed, which makes it more efficient. If the array was not sorted, the algorithm would need to compare every string with every other string, which would be much less efficient.
    //
    //So, sorting the array is a way to optimize the process of finding the longest common prefix. It’s a clever trick that makes the solution more efficient.

    public String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length - 1];
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
         Leetcode14Largestcommonprefix  leet= new Leetcode14Largestcommonprefix();
        String[] input = {"divyansh", "flour", "flame"};
        String lcp = leet.longestCommonPrefix(input);
        System.out.println("Longest Common Prefix: " + lcp);

    }
}

