package ListFramwork;
import java.sql.SQLOutput;
import java.util.*;
import java.util.Arrays;

public class ListWork {
    public static void main(String [] args){

/*
    list :- An ordered collection that can contain duplicate element (like ArrayList, linkedList ).
    key feature :-
                  ordered preservation
                  index based access
                  Allow duplicate
*/
//        List<Integer> arrayList = new ArrayList<>();
//        System.out.println(arrayList.size());
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(4);
//        arrayList.add(5);
//
//        System.out.println(arrayList.size());
//        //to replace the array element in list we use the set method and get method to get the index's element
//        arrayList.set(4,50);
//        System.out.println(arrayList.get(4));
//        System.out.println(arrayList);
//
//
//        // to add in between the element we use the add ,method with index and to delete an element we use remove and to empty the list we use the clear
//        arrayList.add(2,500);
//        System.out.println("Add the element at index 2 = 500 and push other "+arrayList);
//
//        // remove with the help of index
//        arrayList.remove(arrayList.remove(1));
//        System.out.println("remove the index 1 =2 with index :- "+arrayList);
//        //remove with the help of obj best for Strings
//        arrayList.remove(Integer.valueOf(500)) ;
//        System.out.println("after remove with the help of obj:-"+arrayList);
//        //arrayList.clear();
//        System.out.println("clear the arrayList :- "+ arrayList);

        List<Integer> arraylist1 =new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> arraylist2 =new ArrayList<>(Arrays.asList(4,5,8,7,4,56,3));
        // addAll add all the elements of both arrayList  even create duplicate
        arraylist1.addAll(arraylist2);
        System.out.println(arraylist1);
        //removeAll remove all the element of list2 from list1 even if the duplicate is from list1
        arraylist1.removeAll(arraylist2);
        System.out.println(arraylist1);
        // retainAll retain the elements that exist in both list1 and list2
        arraylist1.retainAll(arraylist2);
        System.out.println(arraylist1);
        System.out.println(arraylist1.equals(arraylist2));

        //let sort the array
        //arraylist2.sort(Comparator.naturalOrder());
        arraylist2.sort(null);
        System.out.println(arraylist2);
        Collections.sort(arraylist2, Collections.reverseOrder());
        System.out.println(arraylist2);

        //swap method
        // so in java the List doesn't have swap method of there-own,  but we can use the Collections Swap method
        Collections.swap(arraylist2,0,arraylist2.size()-1);


        //now let's  see the arrayList to array
        Object[] arr1 = arraylist2.toArray();
        System.out.println(Arrays.toString(arr1));

        Integer[] arr2 = arraylist2.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr2));







////      now let's learn about how many types we can create arrayList and list
//        // 1. Regular Mutable ArrayList
//        ArrayList<Integer> list1 = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>(20);
//        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//        ArrayList<Integer> list4 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
//        list3.add(6);        // ✅
//        list3.remove(1);     // ✅
//        list3.set(0, 99);    // ✅
//        list3.clear();       // ✅
//
//        // 2. Fixed Size — Arrays.asList()
//        List<Integer> list5 = Arrays.asList(1, 2, 3, 4, 5);
//        list5.set(0, 99);    // ✅ can update values
//        // list5.add(6);     // ❌ UnsupportedOperationException
//        // list5.remove(0);  // ❌ UnsupportedOperationException
//
//        // 3. Completely Immutable — List.of()
//        List<Integer> list6 = List.of(1, 2, 3, 4, 5);
//        list6.get(0);        // ✅ only reading allowed
//        // list6.set(0, 99); // ❌ UnsupportedOperationException
//        // list6.add(6);     // ❌ UnsupportedOperationException
//        // list6.remove(0);  // ❌ UnsupportedOperationException
//
//        // 4. Unmodifiable — Collections.unmodifiableList()
//        ArrayList<Integer> original = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//        List<Integer> list7 = Collections.unmodifiableList(original);
//        list7.get(0);        // ✅ reading allowed
//        // list7.add(6);     // ❌ UnsupportedOperationException
//        // list7.set(0, 99); // ❌ UnsupportedOperationException
//        original.add(6);
//        System.out.println(list7); // [1, 2, 3, 4, 5, 6] reflects original change!
//
//        // 5. Synchronized — Collections.synchronizedList()
//        List<Integer> list8 = Collections.synchronizedList(new ArrayList<>());
//        list8.add(1);        // ✅ thread safe
//        list8.add(2);        // ✅ thread safe
//
//        // 6. Singleton — Collections.singletonList()
//        List<Integer> list9 = Collections.singletonList(42);
//        list9.get(0);        // ✅ [42]
//        // list9.add(1);     // ❌ UnsupportedOperationException
//        // list9.set(0, 99); // ❌ UnsupportedOperationException
//
//        // 7. Empty Immutable — Collections.emptyList()
//        List<Integer> list10 = Collections.emptyList();
//        list10.size();       // ✅ 0
//        // list10.add(1);    // ❌ UnsupportedOperationException
//
//        // 8. nCopies — Collections.nCopies()
//        List<Integer> list11 = Collections.nCopies(5, 99);
//        System.out.println(list11);  // [99, 99, 99, 99, 99]
//        // list11.add(1);    // ❌ UnsupportedOperationException
//        List<Integer> list12 = new ArrayList<>(Collections.nCopies(5, 0));
//        list12.set(2, 99);   // ✅ [0, 0, 99, 0, 0]
//
//        // 9. From Stream
//        List<Integer> list13 = Stream.of(1, 2, 3, 4, 5)
//                .collect(Collectors.toList());         // mutable ✅
//        List<Integer> list14 = Stream.of(1, 2, 3, 4, 5)
//                .collect(Collectors.toUnmodifiableList()); // immutable ❌

    }
}


