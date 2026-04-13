package part_1;

import java.util.HashSet;

public class QuestionsOfTheDay2 {
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
    public static int removeElement(int[] nums , int val) {ū
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


    public static void main(String [] args){
        QuestionsOfTheDay2 question = new QuestionsOfTheDay2();
        int [] nums= {0,1,2,2,3,0,4,2};

        System.out.println(removeElement(nums,2));
        System.out.println(question.checkIfExist(nums));//ture
    }
}
