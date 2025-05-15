/*
 * You will find that your tests aren't passing as expected!  Fix the bug in the sumIsEven method so that
 * it is working the way it should, so that your JUnit tests all pass!
 */

public class SumNumbers {

    /*   Define a function called sumIsEven() which takes two integer inputs
     *   and returns 1 for “true” if the sum of the two values is an even number.
     *   If the sum is an odd number, then return 0 for “false.”
     */
    public int sumIsEven(int a, int b) {
        if((a+b) % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
