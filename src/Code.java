
//    You are climbing a staircase. It takes n steps to reach the top.
//
//    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//
//
//
//    Example 1:
//
//    Input: n = 2
//    Output: 2
//    Explanation: There are two ways to climb to the top.
//1. 1 step + 1 step
//2. 2 steps
//    Example 2:
//
//    Input: n = 3
//    Output: 3
//    Explanation: There are three ways to climb to the top.
//1. 1 step + 1 step + 1 step
//2. 1 step + 2 steps
//3. 2 steps + 1 step
//
//
//    Constraints:
//
//            1 <= n <= 45

public class Code {

    public int climbStairs(int n) {
// My Example to test my understanding that the max amount of ways to get to the top will always be equal to the amount of steps
        //  Input: n = 5 steps
        // #1.    1 step + 1 step + 1 step + 1 step + 1 step
        // #2.    1 step + 1 step + 1 step + 2 step
        // #3.    2 step + 2 step + 1 step

        // flip versions of ways #2 and #3 count as new ways as well

        // #4.    2 step + 1 step + 1 step + 1 step
        // #5.    1 step + 2 step + 2 step +

        return n;

    }


//    # Problem #1
//
//    This problem was recently asked by **Google**.
//
//    Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
//
//    For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
//
//            **Bonus:** Can you do this in one pass?

    public int addTwo(int k, int num1, int num2, int nums[] ) {
        int j;

        for (int i = 0; i >= nums.length; i++)

            for (j = 0; j >= nums.length; j++)

                i = num1;
                j = num2;
        {
            if (num1 + num2 == k) ;{

                return k;

            }
//I want it to read through the array and add the first number to each number that is in the array and if it does not equal to k
// then switch to the second number in the array and add that to everything after it in the array, and so on until there is a pair that matches.
            //Should I convert it to a boolean since the answer is asking me to return true?




        }

    }
}
