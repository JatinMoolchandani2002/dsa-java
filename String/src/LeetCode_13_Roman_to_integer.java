public class LeetCode_13_Roman_to_integer {
/*
* Basically we are trying to convert a roman number to an integer
* To convert a roman number to integer , we have to start from the end and transverse the whole string LVIII(start from 'I' in the end),
* While Transversing we will ad the corresponding number with the sum integer
* However, When an Integer such as Iv,XIV,XIX is met , we have to specially handle it
* TO handle it correctly we have defined 3 integer variables.
* No see on line 16 to 22(from start of if statement)
*
* */
    public int romanToInt(String s) {
        int prev = 0;
        int sum = 0;
        for (int i = s.length()-1; i >=0; i--) {
            int curr = romans(s.charAt(i));
            if (curr < prev) {   //whenever a number such as VIII is met we will simply add the number to the final sum variables,
                sum -= curr;    //When a number is XIV , the second charater is less then the previous character which is V, so if char(curr)<char(prev) we will simply subtract it from the sum
            } else {
                sum += curr;
            }
            prev = curr;
        }
        return sum;
    }

    public static int romans(char r) {
        switch (r) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0; }// Handle invalid characters
    }

}
