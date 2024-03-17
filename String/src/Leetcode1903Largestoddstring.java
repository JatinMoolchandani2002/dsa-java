public class Leetcode1903Largestoddstring {

    public String largestOddNumber(String num) {

        //if a the unit digit of a number is odd then the whole number is odd
        // which means if we iterate form the end of the string
        // and if the odd number is found,then the number infront of them will be odd



        // Handle empty string and non-numeric characters
        if (num.isEmpty() || !num.matches("[0-9]")) {
            return ""; // Return empty string for invalid input
        }

        // Iterate in reverse order for efficiency
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i); // Get the current character
            int intValue = Character.getNumericValue(ch); // Convert to integer

            if (intValue % 2 == 1) { // Check if the character is odd
                // Found an odd character, check if it's the first digit
                if (i == 0) {
                    return String.valueOf(ch); // Only one odd digit, return it
                } else {
                    // Extract the substring from the beginning to the current index
                    return num.substring(0, i + 1);
                }
            }
        }

        // No odd number found
        return ""; // Return empty string if no odd numbers exist
    }

    public static void main(String[] args) {

    }
}
