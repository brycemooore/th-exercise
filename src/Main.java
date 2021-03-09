

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

    // #3 If you could change 1 thing about your favorite framework/language/platform (pick one), what would it be?

    /*Ruby on Rails is a very powerful and easy to start web framework, but it is very strict in it's conventions.
    This is can be awesome as it helps assert industry conventions and makes learning things like MVC much easier in my opinion.
    The problem with Rails is it is not very lightweight and comes with a lot of hassle to install and use. Even when given options like
    the API only flag, it is still a large project with a hard workflow to look into. After using Express and seeing how moldable and lightweight
    it is, I wish Rails had some options for setting up a project like that. Rails is a fast framework and Ruby is a great language with
    awesome tool and easy to read syntax. If the Rails was a little more customizable, I think it would be used by many more people and keep
    up in this time of Node dominance.*/

} //end Main Class