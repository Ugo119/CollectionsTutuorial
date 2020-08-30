package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        /*
        This is an ArrayList implementation.
         */
        //Positional Operations
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(0);
//        list1.add(8);
//        list1.add(0);
//        list1.add(3);
//        list1.add(7);
//        list1.add(0);
//        list1.add(6);
//        list1.add(7);
//        list1.add(4);
//        list1.add(0);
//        list1.add(5);
//        System.out.println("My number is: " + list1);
//        list1.set(3, 5);
//        list1.set(4, 0);
//        list1.set(5, 4);
//        System.out.println("My number is: " + list1);
//
//        //Bulk Operations
//        Collection<Integer> list2 = new ArrayList<>();
//        list2.add(7);
//        list2.add(4);
//        list1.removeAll(list2);
//        System.out.println("My number is: " + list1);
//        System.out.println("The number to be replaced: " + list1.set(3, 9));
//        System.out.println("My number is: " + list1);
//
//        //Search Operations
//        System.out.println("Confirm if list1 contains(7): " + list1.contains(7));
//        System.out.println("Confirm first index of 0: " + list1.indexOf(0));
//        System.out.println("Confirm last index of 0: " + list1.lastIndexOf(0));
//
//        //Range-View: subList (new list is backed by original)
//        List<Integer> list3 = list1.subList(1, 4);
//        System.out.println("List3" + list3);
//        list3.set(0,4);
//        System.out.println("List1" + list1);
//        System.out.println("List3" + list3);
//        list1.set(3, 7);
//        System.out.println("List1" + list1);
//        System.out.println("List3" + list3);
//        list3.add(3, 5);
//        System.out.println("List1" + list1);
//        System.out.println("List3" + list3);
//
//        for (int element : list1) {
//            System.out.println("The elements of list1 are: " + element);
//        }
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(4);
//        list1.add(1);
//        list1.add(3);
//        list1.add(6);
//        list1.add(7);
//        list1.add(2);
//        list1.add(9);
//        list1.add(8);
//        System.out.println("list1 before remove(): " + list1);
//        System.out.println("The boolean version of remove(): " + list1.remove(Integer.valueOf(7)));
//        System.out.println("The integer version of remove(): " + list1.remove(2));
//        System.out.println("list1 after remove(): " + list1);

        /*
        Iterator Example
         */
        List<Integer> myList = arrayListDemo();
        iteratorDemo(myList);
    }
    public static void iteratorDemo(List<Integer> list1) {
        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()) {
            //Return the next element of relevant type with next()
            int element = iterator.next();
            System.out.println("element: " + element);

        }

    }

    public static List<Integer> arrayListDemo() {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(0);
        list.add(5);
        list.add(7);
        return list;
    }
}
