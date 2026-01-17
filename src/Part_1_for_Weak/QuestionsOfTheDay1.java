package Part_1_for_Weak;

/**
 * =========================================================
 * Part_1_for_Weak
 * =========================================================
 *
 * This class contains solutions to LeetCode problems
 * intended for revision and strengthening weak topics.
 *
 * Author  : Yash Sharma
 * Purpose : Practice
 *
 * Each question is documented using JavaDoc and
 * implemented as a separate static method.
 *
 * If you start DSA for the first time you can read about arrays from the given
 *    link and some practice questions too:
 *    link "<a href="https://leetcode.com/explore/learn/card/fun-with-arrays/">Fun With Arrays</a>"
 */
public class QuestionsOfTheDay1 {

    // ==================================================
    // LeetCode - (https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/)
    // Question 2: Given a binary array nums, return the maximum number of consecutive 1's in the array.
    /*
     * Approach:
     * - Traverse the array while maintaining a running streak of consecutive 1's.
     * - Reset the streak to 0 whenever a 0 is encountered.
     * - Keep track of the maximum streak seen so far.
     *
     * Time Complexity: O(n)   (single pass through the array)
     * Space Complexity: O(1)  (only a few variables used)
     */
    public static int findMaxConsecutiveOnes(int[] nums1) {
        int count = 0;
        int streak = 0;
        int n = nums1.length;
        for (int i = 0; i < n; i++) {
            if (nums1[i] == 1) {
                streak++;
                count = Math.max(streak, count);
            } else {
                streak = 0;
            }
        }
        return count;
    }

    // ==================================================
    // LeetCode - (https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/)
    // Question 3: Given an array nums of integers, return how many of them contain an even number of digits.
    /*
     * Approach:
     * - For each number in the array, count the number of digits by repeatedly dividing by 10.
     * - If the digit count is even, increment the result counter.
     *
     * Time Complexity: O(n * k)
     *   where n = number of elements, k = average number of digits per element
     * Space Complexity: O(1)
     */
    public static int findNumbers(int[] nums2) {
        int count = 0;
        for (var num : nums2) {
            int digits = 0;
            while (num != 0) {
                num /= 10;
                digits++;
            }
            if (digits % 2 == 0) count++;
        }
        return count;
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
     * Time Complexity: O(n)
     * Space Complexity: O(1)
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

//    question 3 leetcode 27:-
     /*
     Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
      Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
        Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
        Return k.
      */

    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    // MAIN METHOD (for testing only)
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        int[] nums2 = {12, 345, 2, 6, 7896};
        int[] nums3= {3,2,2,3};
        int val=3;
        System.out.println(missingNumber(nums)); // Output: 2
        System.out.println(QuestionsOfTheDay1.findMaxConsecutiveOnes(nums1)); // Output: 3
        System.out.println(QuestionsOfTheDay1.findNumbers(nums2)); // Output: 2
        System.out.println(QuestionsOfTheDay1.removeElement(nums3,val)); // Output: 2
    }
}