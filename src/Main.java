

public class Main {

    public static void main(String[] args) {
        String s = "MyString";
        int[] nums = new int[]{5, 8, 3, 45, 1} ;
        System.out.println(printNumsAboveAndBelow(nums, 4));
        System.out.println(rotateString(s, 2));
    }

    /* #1 Print the number of integers in an array that are above the given input
    and the number that are below, e.g. for the array [1, 5, 2, 1, 10] with input 6,
    print “above: 1, below: 4”.*/

    /**
     *
     * @param nums Integer Array containing the numbers to tes against
     * @param value Integer to use as value to test above and below
     * @return String which states the number of numbers above and below given value
     */
    public static String printNumsAboveAndBelow(int[] nums, int value){
        int above = 0;
        int below = 0;
        for (int num : nums) {
            if (num > value) {
                above++;
            } else if (num < value) {
                below++;
            }
        }
        return "above: " + above + ", below: " + below;
    }//end printNumsAboveAndBelow

    /* #2 Rotate the characters in a string by a given input
    and have the overflow appear at the beginning, e.g. “MyString”
    rotated by 2 is “ngMyStri”.*/

    /**
     *
     * @param stringToRotate String that is being rotated
     * @param numToRotate Integer number of characters to rotate to the right by
     * @return String that is the string rotated by the rotate amount
     */
    public static String rotateString(String stringToRotate, int numToRotate){
        int displacement = stringToRotate.length() - numToRotate;
        return stringToRotate.substring(displacement) + stringToRotate.substring(0, displacement);
    }

} //end Main Class