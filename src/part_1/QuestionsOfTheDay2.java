package part_1;

import java.util.Arrays;
import java.util.HashSet;

public  class QuestionsOfTheDay2 {
    // ============================================
// Question 1— Remove Element
// Difficulty : Easy
// Topics     : Array, Two Pointers
// ============================================

// PROBLEM
// -------
// Given an integer array nums and an integer val,
// remove all occurrences of val in nums in-place.
// The order of elements may be changed.
// Return k — count of elements not equal to val.
//
// The first k elements of nums must contain
// elements not equal to val. Rest does not matter.

// EXAMPLES
// --------
// Input : nums = [3,2,2,3], val = 3
// Output: k = 2, nums = [2,2,_,_]
//
// Input : nums = [0,1,2,2,3,0,4,2], val = 2
// Output: k = 5, nums = [0,1,3,0,4,_,_,_]

// CONSTRAINTS
// -----------
// 0 <= nums.length <= 100
// 0 <= nums[i]    <= 50
// 0 <= val        <= 100

// HINT
// ----
// Use a slow pointer k starting at 0.
// Loop through every element —
// if nums[i] != val, place it at nums[k] and k++.
// No swapping needed. Just overwrite from the front.
// k naturally becomes the count of valid elements.

// GOAL
// ----
// Time  : O(n)
// Space : O(1)

    // YOUR CODE BELOW
// ---------------
    public static int removeElement(int[] nums , int val) {
        int k = 0;  // slow pointer — next position to place valid element

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];  // place valid element at front
                k++;
            }
        }
        return k;
    }

    // ============================================
// Question 2 — Check If N and Its Double Exist
// Difficulty : Easy
// Topics     : Array, HashSet, Two Pointers
// ============================================

// PROBLEM
// -------
// Given an array arr of integers, check if there
// exist two indices i and j such that:
//   - i != j
//   - 0 <= i, j < arr.length
//   - arr[i] == 2 * arr[j]
// Return true if such indices exist, false otherwise.

// EXAMPLES
// --------
// Input : arr = [10,2,5,3]
// Output: true
// Reason: arr[0]=10 == 2 * arr[2]=5
//
// Input : arr = [3,1,7,11]
// Output: false
// Reason: no such pair exists

// CONSTRAINTS
// -----------
// 2   <= arr.length <= 500
// -103 <= arr[i]   <= 103

// EDGE CASE TO THINK ABOUT
// ------------------------
// arr = [0, 0] → 2*0 = 0 exists at different index → true
// arr = [0, 1] → 2*0 = 0 but no other 0 exists    → false

// HINT
// ----
// Brute force : nested loop, check every pair i,j where i!=j
// Optimal     : use a HashSet, for each num check if
//               num*2 or num/2 (only if even) already seen
//               add num to set after checking



// YOUR CODE BELOW
//    brut force
//public boolean checkIfExist(int[] arr) {
//    for(int i = 0; i < arr.length; i++){
//        for(int j = 0; j < arr.length; j++){
//            if(i != j && arr[i] * 2 == arr[j]) return true;
//        }
//    }
//    return false;
//}
// YOUR CODE'S COMPLEXITY
// ----------------------
// Time  : O(n²)
// Space : O(1)
public  boolean checkIfExist(int[] arr) {
    HashSet<Integer> seen = new HashSet<>();
    for(int num : arr){
        if(seen.contains(num * 2)) return true;   // double seen before?
        if(num % 2 == 0 && seen.contains(num / 2)) return true; // half seen before?
        seen.add(num);
    }
    return false;
}
// OPTIMAL COMPLEXITY
// ------------------
// Time  : O(n)
// Space : O(n)



    // ============================================
// Question 6 — Valid Mountain Array
// Difficulty : Easy
// Topics     : Array, Two Pointers
// ============================================

// PROBLEM
// -------
// Given an array of integers arr, return true
// if and only if it is a valid mountain array.
//
// A mountain array must satisfy:
//   - arr.length >= 3
//   - Strictly increases to a peak element arr[i]
//   - Strictly decreases after the peak
//   - Peak cannot be first or last element
//   - 0 < i < arr.length - 1

// EXAMPLES
// --------
// Input : arr = [2,1]
// Output: false
// Reason: length < 3, no peak possible
//
// Input : arr = [3,5,5]
// Output: false
// Reason: not strictly increasing (5,5)
//
// Input : arr = [0,3,2,1]
// Output: true
// Reason: strictly up to 3, strictly down after

// CONSTRAINTS
// -----------
// 1  <= arr.length <= 10^4
// 0  <= arr[i]    <= 10^4

// EDGE CASES TO THINK ABOUT
// -------------------------
// arr = [1,2,3]     → only goes up, no descent  → false
// arr = [3,2,1]     → only goes down, no ascent → false
// arr = [1,3,2,3,1] → two peaks                 → false
// arr = [0,1,2,1,0] → valid mountain            → true

// HINT
// ----
// Brute  : find peak index, verify left side strictly
//          increasing and right side strictly decreasing
//          peak must not be index 0 or last index
//
// Optimal: two pointers left and right
//          walk left up from start
//          walk right up from end
//          if left==right and neither is at boundary → true

// YOUR COMPLEXITY
// ---------------
// Brute
// Time  : O(n)
// Space : O(1)

// OPTIMAL COMPLEXITY
// ------------------
// Time  : O(n)
// Space : O(1)

    // YOUR CODE BELOW
// ---------------
    public boolean validMountainArray(int[] arr) {
        /*
        * int n = arr.length;

        // length check
        if(n < 3) return false;

        // find peak
        int peak = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > arr[peak]) peak = i;
        }

        // peak cannot be first or last
        if(peak == 0 || peak == n - 1) return false;

        // check strictly increasing left side
        for(int i = 0; i < peak; i++){
            if(arr[i] >= arr[i + 1]) return false;
        }

        // check strictly decreasing right side
        for(int i = peak; i < n - 1; i++){
            if(arr[i] <= arr[i + 1]) return false;
        }

        return true;*/
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while(left < n - 1 && arr[left] < arr[left + 1]){
            left++;
        }
        while(right > 0 && arr[right] < arr[right - 1]){
            right--;
        }
        return left == right && left != 0 && right != n - 1;
    }


// ============================================
// Question 7 — Replace Elements with Greatest
//              Element on Right Side
// Difficulty : Easy
// Topics     : Array
// ============================================

// PROBLEM
// -------
// Given an array arr, replace every element with
// the greatest element to its right.
// Replace the last element with -1.
// Return the modified array.

// EXAMPLES
// --------
// Input : arr = [17,18,5,4,6,1]
// Output: [18,6,6,6,1,-1]
//
// Input : arr = [400]
// Output: [-1]

// CONSTRAINTS
// -----------
// 1 <= arr.length <= 10^4
// 1 <= arr[i]    <= 10^5

// HINT
// ----
// Brute  : for each index scan all elements to
//          its right to find max → O(n²)
//
// Optimal: traverse right to left, keep a running
//          maxRight variable, replace as you go → O(n)

// YOUR COMPLEXITY
// ---------------
// Time  : O(n²)
// Space : O(1)

// OPTIMAL COMPLEXITY
// ------------------
// Time  : O(n)
// Space : O(1)

// YOUR CODE BELOW
// ---------------

public static int[] replaceElements(int[] arr) {
    int n = arr.length;
    int maxRight = -1;

    for(int i = n - 1; i >= 0; i--){
        int newMax = Math.max(maxRight, arr[i]);
        arr[i] = maxRight;
        maxRight = newMax;
    }
    return arr;
}

// ============================================
// Question 7 — Sort Array By Parity
// Difficulty : Easy
// Topics     : Array, Two Pointers
// ============================================

// PROBLEM
// -------
// Given an integer array nums, move all even
// integers to the beginning of the array followed
// by all odd integers.
// Return any array that satisfies this condition.

// EXAMPLES
// --------
// Input : nums = [3,1,2,4]
// Output: [2,4,3,1]
// Note  : [4,2,3,1], [2,4,1,3] also accepted
//
// Input : nums = [0]
// Output: [0]

// CONSTRAINTS
// -----------
// 1 <= nums.length <= 5000
// 0 <= nums[i]    <= 5000

// EDGE CASES TO THINK ABOUT
// -------------------------
// nums = [0]        → 0 is even         → [0]
// nums = [1,3,5]    → all odd           → [1,3,5]
// nums = [2,4,6]    → all even          → [2,4,6]
// nums = [1,2]      → one odd, one even → [2,1]

// HINT
// ----
// Use a slow pointer j starting at 0
// Loop through every element with pointer i
// If nums[i] is even → swap nums[i] with nums[j]
// and increment j
// j always points to next position for even numbers

// YOUR COMPLEXITY
// ---------------
// Time  : O(n)
// Space : O(1)

// OPTIMAL COMPLEXITY
// ------------------
// Time  : O(n)
// Space : O(1)

// YOUR CODE BELOW
// ---------------

    public int[] sortArrayByParity(int[] nums) {
        // if(arr.length<1||arr==null)return nums;
        int j =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]%2==0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            }
        }
        return nums;


        public static void main(String [] args){
        QuestionsOfTheDay2 question = new QuestionsOfTheDay2();
        int [] arr = {0,3,2,1};
        int[] nums = new int[]{0 , 1 , 2 , 2 , 3 , 0 , 4 , 2};

        System.out.println(question.removeElement(nums,2));
        System.out.println(question.checkIfExist(nums));//ture
        System.out.println(question.validMountainArray(arr));
        System.out.println(Arrays.toString(question.replaceElements(arr)));
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }

}
