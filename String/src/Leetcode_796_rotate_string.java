public class Leetcode_796_rotate_string {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String d = s+s;//This line concatenates the first string s with itself,
                        // creating a new string named d.
                        // This is done to account for the possible rotations of the first string.
                        //ez... if s = Jatin then d = JatinJatin
        return d.contains(goal);/*if the second string goal is a substring of the combined string.
                                If it is, then it means that goal is a rotation of s.
                                ez. s = tinja is a rotates string hence the substring of d
                                If not, it means that goal is not a rotation of s, and it returns false.*/
    }}
