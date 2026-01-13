/// @author ${Yash sharma }
package Part_1_for_Weak;
import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 3};
        int[] arr2 = {5, 2, 8, 1, 3};
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = new int[5];  // creates an array of size 5
        int[] arr5 = new int[]{1, 2, 3, 4, 5};
//         1️⃣ Arrays.toString() → Converts array into a readable String form
        System.out.println(Arrays.toString(arr));
        // Output: [5, 2, 8, 1, 3]

        // 2️⃣ Arrays.sort() → Sorts the entire array in ascending order
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // Output: [1, 2, 3, 5, 8]

        // 3️⃣ Arrays.binarySearch() → Searches an element in sorted array, returns index
        System.out.println(Arrays.binarySearch(arr, 3));
        // Output: 2

        // 4️⃣ Arrays.equals() → Checks if two arrays are exactly same (size + elements + order)
        System.out.println(Arrays.equals(arr, arr2));
        // Output: false (because arr is sorted, arr2 is not)

        // 5️⃣ Arrays.fill() → Fills entire array with a single value
        int[] f = new int[5];
        Arrays.fill(f, 7);
        System.out.println(Arrays.toString(f));
        // Output: [7, 7, 7, 7, 7]

        // 6️⃣ Arrays.copyOf() → Copies first n elements into a new array
        int[] c1 = Arrays.copyOf(arr3, 3);
        System.out.println(Arrays.toString(c1));
        // Output: [1, 2, 3]

        // 7️⃣ Arrays.copyOfRange() → Copies elements from start (incl) to end (excl)
        int[] c2 = Arrays.copyOfRange(arr3, 1, 4);
        System.out.println(Arrays.toString(c2));
        // Output: [2, 3, 4]

        // 8️⃣ Arrays.deepEquals() → Compares multi-dimensional arrays
        int[][] d1 = {{1,2},{3,4}};
        int[][] d2 = {{1,2},{3,4}};
        System.out.println(Arrays.deepEquals(d1, d2));
        // Output: true

        // 9️⃣ Arrays.deepToString() → Converts multi-dimensional array into readable String
        System.out.println(Arrays.deepToString(d1));
        // Output: [[1, 2], [3, 4]]

        // 🔟 Arrays.parallelSort() → Uses multi-threading to sort faster for large arrays
        int[] p = {9, 4, 7, 1};
        Arrays.parallelSort(p);
        System.out.println(Arrays.toString(p));
        // Output: [1, 4, 7, 9]

        // 1️⃣1️⃣ Arrays.stream() → Converts array into a Stream for functional operations
        long count = Arrays.stream(arr3).count();
        System.out.println(count);
        // Output: 5

        // 1️⃣2️⃣ Arrays.spliterator() → Used for parallel iteration support
        System.out.println(Arrays.spliterator(arr3).getExactSizeIfKnown());
        // Output: 5

        // 1️⃣3️⃣ Arrays.mismatch() → Returns first index where arrays differ
        System.out.println(Arrays.mismatch(arr, arr2));
        // Output: 0 (they differ at index 0)

        // 1️⃣4️⃣ Arrays.compare() → Lexicographically compares two arrays
        System.out.println(Arrays.compare(arr, arr2));
        // Output: -1 or 1 depending on comparison

        // 1️⃣5️⃣ Arrays.compareUnsigned() → Compares unsigned values (same as compare for int)
        System.out.println(Arrays.compareUnsigned(arr, arr2));
        // Output: -1 or 1

        // 1️⃣6️⃣ Arrays.setAll() → Sets each index value using a lambda (formula-based values)
        int[] s = new int[5];
        Arrays.setAll(s, i -> i * 2);
        System.out.println(Arrays.toString(s));
        // Output: [0, 2, 4, 6, 8]

        // 1️⃣7️⃣ Arrays.parallelSetAll() → Same as setAll but uses multi-threading
        int[] ps = new int[5];
        Arrays.parallelSetAll(ps, i -> i + 10);
        System.out.println(Arrays.toString(ps));
        // Output: [10, 11, 12, 13, 14]

        // 1️⃣8️⃣ Arrays.hashCode() → Returns a hash for the array (used in hashing/Maps)
        System.out.println(Arrays.hashCode(arr3));
        // Output: (varies)

        // 1️⃣9️⃣ Arrays.deepHashCode() → Hashcode for multi-dimensional arrays
        int[][] deep = {{10, 20}, {30, 40}};
        System.out.println(Arrays.deepHashCode(deep));
        // Output: (varies)

        // 2️⃣0️⃣ Arrays.asList() → Converts array into a List (only for object arrays)
        Integer[]  boxed = {1, 2, 3, 4};
        System.out.println(Arrays.asList(boxed));
        // Output: [1, 2, 3, 4]


    }
    public static class Main {
        public static void main(String[] args) {
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
            // to see how IntelliJ IDEA suggests fixing it.
            System.out.printf("Hello and welcome!");

            for (int i = 1; i <= 5; i++) {
                //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
                // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
                System.out.println("i = " + i);
            }
        }
    }
}
