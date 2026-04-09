package part_1;

//date 10-04-2026

import java.util.Arrays;

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


    /*
    ARRAY Quest 1

    * You are given an integer array nums of length n.
    Construct an array ans of length 2n such that:
    - ans[i] = nums[i] for 0 <= i < n
    - ans[i + n] = nums[i] for 0 <= i < n

    In other words, ans is the concatenation of two nums arrays.
    Return the array ans.

    Example 1:
    Input: nums = [1,2,1]
    Output: [1,2,1,1,2,1]
    Example 2:
    Input: nums = [1,3,2,1]
    Output: [1,3,2,1,1,3,2,1]
    */
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        // Copy nums into ans twice
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];       // first half
            ans[i + n] = nums[i];   // second half
        }

        return ans;
    }

    /*Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
    Return the array in the form [x1,y1,x2,y2,...,xn,yn].

    Example 1:
    Input: nums = [2,5,1,3,4,7], n = 3
    Output: [2,3,5,4,1,7]
    Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
    Example 2:
    Input: nums = [1,2,3,4,4,3,2,1], n = 4
    Output: [1,4,2,3,3,2,4,1]
    Example 3:

    Input: nums = [1,1,2,2], n = 2
    Output: [1,2,1,2]*/

    public static int[] shuffle(int[] nums , int n) {
        int [] result =new int [2*n];
        int j = n;
        for(int i=0;i<2*n;i++){
            if(i%2==0){
                result[i] = nums[j-n];
            }else{
                result[i]= nums[j];
                j++;
            }
        }
        return result;
//        or
//        int arr[] = new int[n*2];
//        for(int i = 0; i<n; i++){
//            arr[2*i] = nums[i];
//            arr[2*i+1]=nums[n+i];
//        }
//        return arr;
    }

    /*
Question
    Squares of a Sorted Array
hints:- Easy Array Two Pointers
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
Examples
    Input: nums = [-4, -1, 0, 3, 10]
    Output: [0, 1, 9, 16, 100]
    Input: nums = [-7, -3, 2, 3, 11]
    Output: [4, 9, 9, 49, 121]
    Constraints
        1 ≤ nums.length ≤ 10⁴
        -10⁴ ≤ nums[i] ≤ 10⁴
    nums is sorted in non-decreasing order
    Hint →
        Negative numbers become large after squaring. Use two pointers from both ends and fill a result array from right to left.
    Goal →
        O(n) time · O(n) space
    My approach / notes
    * */
    public static int[] sortedSquares(int[] nums) {
        int low =0;
        int high = nums.length-1;
        int[] result = new int[high+1];
        int pos = nums.length-1;
        while(low<=high){
            if(Math.abs(nums[low])<=Math.abs(nums[high])){
                result[pos] = nums[high]*nums[high];
                high--;
            }
            else{
                result[pos]=nums[low]*nums[low];
                low++;
            }
            pos--;
        }
        return result;
    }


    /*
    * Duplicate Zeros
Easy Array Two Pointers
Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right. Elements beyond the length of the original array are not written. Modify the array in place and do not return anything.
Examples
    Input: arr = [1, 0, 2, 3, 0, 4, 5, 0]
    Output: [1, 0, 0, 2, 3, 0, 0, 4]
    Input: arr = [1, 2, 3]
    Output: [1, 2, 3]
    Constraints
        1 ≤ arr.length ≤ 10⁴
        0 ≤ arr[i] ≤ 9
    Hint →
        Pass 1: count zeros to find where the last valid element lands. Pass 2: fill from right to left using two pointers.
    Goal →
        O(n) time · O(1) space
    My approach / notes */


//     public void duplicateZeros(int[] arr) {
//         int[] arr2 = new int[arr.length];
//         int j = 0;
//         for(int i = 0; i < arr.length && j < arr.length; i++){
//             if(arr[i] == 0){
//                 arr2[j] = 0;
//                 j++;
//                 if(j < arr.length){  // ✅ bounds check
//                     arr2[j] = 0;
//                     j++;
//                 }
//             }
//             else{
//                 arr2[j] = arr[i];
//                 j++;
//             }
//         }
//         for(int i = 0; i < arr.length; i++){
//             arr[i] = arr2[i];  // ✅ copy back to original
//         }
//     }
//
public static int[] duplicateZeros(int[] arr) {
    int n = arr.length;
    int zeros = 0;

    // Pass 1 — count zeros
    for(int i = 0; i < n; i++){
        if(arr[i] == 0) zeros++;
    }

    // Pass 2 — fill from right to left
    int i = n - 1;           // pointer for original array
    int j = n + zeros - 1;   // pointer for expanded array

    while(i >= 0){
        if(arr[i] == 0){
            if(j < n) arr[j] = 0;  // duplicate zero
            j--;
            if(j < n) arr[j] = 0;  // original zero
            j--;
        }
        else{
            if(j < n) arr[j] = arr[i];
            j--;
        }
        i--;
    }
    return arr;
}

/*
* Question 3
Merge Sorted Array
Easy
Array
Two Pointers
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single sorted array stored inside nums1. nums1 has length m + n where the last n elements are 0 and should be ignored.
Examples
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Constraints
nums1.length == m + n  ·  nums2.length == n
0 ≤ m, n ≤ 200  ·  1 ≤ m + n ≤ 200
-10⁹ ≤ nums1[i], nums2[j] ≤ 10⁹
Brute →
Use an extra array with three pointers i, j, k. Compare and fill, then copy back. O(m+n) space.
Optimal →
Fill from the right! Use pointers at end of nums1 and nums2, place the larger element at the back. O(1) space.
Goal →
O(m+n) time · O(1) space
My approach / notes
*/
public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1;         // last real element of nums1
    int j = n - 1;         // last element of nums2
    int k = m + n - 1;     // last position of nums1

    while(i >= 0 && j >= 0){
        if(nums1[i] >= nums2[j]){
            nums1[k] = nums1[i];
            i--;
        } else {
            nums1[k] = nums2[j];
            j--;
        }
        k--;
    }

    // if nums2 still has remaining elements
    while(j >= 0){
        nums1[k] = nums2[j];
        j--; k--;
    }
    return nums1;
    // no need to handle remaining nums1
    // they are already in place!
}

    // MAIN METHOD (for testing only)
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        int[] nums2 = {12, 345, 2, 6, 7896};
        int[] nums3= {3,2,2,3};
        int[] nums4= {2,5,1,3,4,7};
        int val=3;
        int[] nums5={-4,-3,0,3,10};
        int [] nums6  = {1,2,3,0,0,0};  int m = 3;
        int [] nums7 = {2,5,6};        int  n = 3;
        System.out.println(missingNumber(nums)); // Output: 2
        System.out.println(QuestionsOfTheDay1.findMaxConsecutiveOnes(nums1)); // Output: 3
        System.out.println(QuestionsOfTheDay1.findNumbers(nums2)); // Output: 2
        System.out.println(QuestionsOfTheDay1.removeElement(nums3,val)); // Output: 2
        System.out.println(Arrays.toString(getConcatenation(nums)));//[3, 0, 1, 3, 0, 1]
        System.out.println(Arrays.toString(shuffle(nums4,val)));//[2, 3, 5, 4, 1, 7]
        System.out.println(Arrays.toString(sortedSquares(nums5)));//[0, 9, 9, 16, 100]
        System.out.println(Arrays.toString( duplicateZeros(new int[]{1 , 0 , 2 , 3 , 0 , 4 , 5 , 0})));//[1, 0, 0, 2, 3, 0, 0, 4]
        System.out.println(Arrays.toString(merge(nums6,m,nums7,n)));

    }
}