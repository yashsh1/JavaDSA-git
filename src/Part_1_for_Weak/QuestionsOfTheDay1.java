package Part_1_for_Weak;

/**
 * =========================================================
 * Part_1_for_Weak
 * =========================================================
 *
 * This class contains solutions to LeetCode problems
 * intended for revision and strengthening weak topics.
 *
 * Author  : Yash sharma
 * Purpose : Practice
 *
 * Each question is documented using JavaDoc and
 * implemented as a separate static method.
 *
 * if you start DSA for the first time you can read the about the array form the given
 *    link and some practice question too
 *    link "<a href="https://leetcode.com/explore/learn/card/fun-with-arrays/">Fun With Arrays</a>"
 */

public class QuestionsOfTheDay1 {


    // ==================================================
    // LeetCode - (https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/)
    // Question 2: Given a binary array nums, return the maximum number of consecutive 1's in the array.
    /*
    Approach:
     * - Calculate the sum of all elements in the array.
     * - Calculate the expected sum of numbers from 0 to n.
     * - The difference between expected sum and actual sum
     *   gives the missing number.
     *
     * Time Complexity:                  Space Complexity:
     * O(n²)                             O(1)
     */

    // ==================================================
    public static int findMaxConsecutiveOnes(int[] nums1) {
        //
        int count=0;
        int streak =0;
        int n=nums1.length;
        for(int i =0;i<n;i++){
            if(nums1[i]==1){
                streak++;
                count = Math.max(streak,count);
            }
            else{
                streak=0;
            }

        }
        return count;
    }
    }


    // ==================================================
    // Question 1: LeetCode 268 - Missing Number
    // ==================================================
    /*
     * Given an array nums containing n distinct numbers
     * taken from the range [0, n], return the missing number.
     *
     * Approach:
     * - Calculate the sum of all elements in the array.
     * - Calculate the expected sum of numbers from 0 to n.
     * - The difference between expected sum and actual sum
     *   gives the missing number.
     *
     * Time Complexity:                  Space Complexity:
     * O(n)                              O(1)
     */
    public static int missingNumber(int[] nums) {
        int sum = 0;
        int sum2 = 0;

        for (int num : nums) {
            sum += num;
        }

        for (int i = 0; i <= nums.length; i++) {
            sum2 += i;
        }

        return sum2 - sum;
    }
    // MAIN METHOD (for testing only)
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int[] nums1 = {1,1,0,1,1,1};
        int[] nums2 = {12,345,2,6,7896};
        System.out.println(missingNumber(nums)); // Output: 2
        System.out.println(QuestionsOfTheDay1.findMaxConsecutiveOnes(nums1)); // Output:3
    };
};
