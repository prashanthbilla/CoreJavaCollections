package com.javapractice;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is my Java Practice");
        Main main= new Main();
        main.doArrayListOperations();
        main.doOperationsOnHashMap();
        main.doOperationsOnHashSet();
        main.doOperationsOnLinkedList();

    }

    void doArrayListOperations() {
        System.out.println("==========================********=========================");
        System.out.println("ArrayList OPERATIONS");
        System.out.println("==========================********=========================");
        ArrayList<String> al_String = new ArrayList<>();
        al_String.add("Red");
        al_String.add("Blue");
        al_String.add("Yellow");
        al_String.add("Orange");

        //print the values
        System.out.println(al_String);

        //Iterate and print the values
        Iterator<String> it = al_String.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        //insert element in the Index 0
        al_String.add(0, "Prashant Color");
        al_String.add(3, "No Color");
        System.out.println(al_String);

        //Retrieve the element from specified index
        System.out.println(al_String.get(4));

        //Remove the element from specified index
        System.out.println(al_String.remove(3));

        //search the element
        System.out.println(al_String.contains("Red"));

        //sort the elements
        Collections.sort(al_String);
        System.out.println(al_String);

        //copy the ArrayList into another ArrayList
        ArrayList<String> al_String1 = new ArrayList<>();
        al_String1.add("Red");
        al_String1.add("200");
        al_String1.add("Raju");
        System.out.println(al_String);
        System.out.println(al_String1);
        Collections.copy(al_String, al_String1);
        System.out.println("After copy....");
        System.out.println(al_String);
        System.out.println(al_String1);

        // shuffle the elements
        Collections.shuffle(al_String);
        System.out.println(al_String);

        //Reverse the elements
        Collections.reverse(al_String);
        System.out.println(al_String);

        //extract a position
        System.out.println(al_String.subList(1, 3)); // retrieve only indexes 1 and 2

        //compare elements in two ArrayLists
        ArrayList al = new ArrayList();
        for (String s : al_String) {
            al.add(al_String1.contains(s) ? "Yes" : "No");
        }
        System.out.println(al);

        //swap elements
        System.out.println(al_String);
        Collections.swap(al_String, 0, 2);
        System.out.println(al_String);

        //join two ArrayLists
        System.out.println(al);
        System.out.println(al_String);
        System.out.println(al_String1);
        al.addAll(al_String);
        al.addAll(al_String1);
        System.out.println(al);

        //Clone
        ArrayList<String> cloneArray = (ArrayList<String>) al_String.clone();
        System.out.println(cloneArray);
        System.out.println(al_String == cloneArray);
        System.out.println(al_String.equals(cloneArray));

        //Empty
        al_String.removeAll(al_String);
        System.out.println(al_String);

        //isEmpty
        System.out.println(al_String.isEmpty());
        al_String.addAll(cloneArray);
        System.out.println(al_String.isEmpty());
        al.add(" ");

        //Trim method
        al_String.trimToSize();
        System.out.println(al_String); // Removing spaces elements

        // Increase the size of Array
        al_String.ensureCapacity(20);
        al_String.add("Don't worry");
        al_String.add("Why this is happening");
        System.out.println(al_String);

        // Replace the 2nd element
        al_String.set(1, "Replace");
        System.out.println(al_String);

        //print all the elements in ArrayList by using position of elements
        for (String s : al_String) {
            System.out.print(s + "  ");
        }
        System.out.println();
    }

    void doOperationsOnHashMap() {

        System.out.println("==========================********=========================");
        System.out.println("HashMap OPERATIONS");
        System.out.println("==========================********=========================");

        //Normal printing of HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Samsung");
        hashMap.put(2, "OnePlus");
        hashMap.put(3, "Iphone");
        hashMap.put(4, "Honor");
        hashMap.put(5, "Nokia");
        hashMap.put(6, "Mi");
        hashMap.put(6, "RealMe");
        System.out.println(hashMap);

        //associate the specified value with the specified key in a HashMap
        for (Map.Entry x : hashMap.entrySet()) {
            System.out.print(x.getKey() + " " + x.getValue() + "\n");
        }

        //Count the number of key-value (size)
        System.out.println(hashMap.size());

        //copy all of the mappings from the specified map to another map
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(8, "MOTO");
        hashMap1.put(9, "Oppo");
        hashMap1.putAll(hashMap);
        System.out.println(hashMap1);

        //remove all of the mappings from a map
        hashMap1.clear();
        System.out.println(hashMap1);

        //isEmpty
        System.out.println(hashMap1.isEmpty());

        //get a shallow copy of a HashMap instance(clone)
        hashMap1 = (HashMap<Integer, String>) hashMap.clone();
        System.out.println(hashMap1);

        // map contains a mapping for the specified key
        System.out.println(hashMap1.containsKey(5) ? "Yes" : "No");
        System.out.println(hashMap1.get(5));
        System.out.println(hashMap1.containsKey(10) ? "Yes" : "No");
        System.out.println(hashMap1.get(10));

        //map contains a mapping for the specified value
        System.out.println(hashMap1.containsValue("OnePlus") ? "Yes" : "No");
        System.out.println(hashMap1.containsValue("Prashant") ? "Yes" : "No");

        //get the value of a specified key in a map
        System.out.println(hashMap1.get(6));

        // get a set view of the keys contained in this map
        System.out.println(hashMap1.keySet());

        //get a collection view of the values contained in this map
        System.out.println(hashMap1.values());

    }

    void doOperationsOnHashSet() {

        System.out.println("==========================********=========================");
        System.out.println("HasSet OPERATIONS");
        System.out.println("==========================********=========================");

        //append the specified element to the end of a hash set
        HashSet<String> hashset = new HashSet<>();

        hashset.add("India");
        hashset.add("USA");
        hashset.add("UK");
        hashset.add("Australia");
        hashset.add("Australia");// duplicate values not allowed here
        System.out.println(hashset);

        //iterate through all elements in a hash list
        Iterator<String> it = hashset.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        //get the number of elements in a hash set
        System.out.println(hashset.size());

        //clone a hash set to another hash set
        Set<String> cloneHashSet = new HashSet<>();
        cloneHashSet = (Set<String>) hashset.clone();


        //convert HashSet to Array
        String[] stringArray = new String[hashset.size()];
        hashset.toArray(stringArray);
        for (String d : stringArray) {
            System.out.println(d);
        }
        System.out.println();

        // convert HashSet to TreeSet

        //compare two sets and retain elements which are same on both sets
        HashSet<String> hashSet_2 = new HashSet<>();
        hashSet_2.add("UK");
        hashSet_2.add("NewZealand");
        hashSet_2.add("India");
        hashset.retainAll(hashSet_2);
        System.out.println(hashset);

        //remove all of the elements from a hash set
        hashset.removeAll(hashset);

        //isEmpty
        System.out.println(hashset.isEmpty());
    }

    void doOperationsOnLinkedList() {

        LinkedList<String> ls_String = new LinkedList<>();

        System.out.println("==========================********=========================");
        System.out.println("LinkedList OPERATIONS");
        System.out.println("==========================********=========================");
        ls_String.add("Red");
        ls_String.add("Hyderabad");
        ls_String.add("Yellow");
        ls_String.add("Purple");
        ls_String.add("Thiruvananthapuram");

        //normal printing
        System.out.println(ls_String);

        //Iterator
        Iterator it = ls_String.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + "  ");
        }
        System.out.println();

        //specified index Iterator
        Iterator it1 = ls_String.listIterator(2);
        while (it1.hasNext()) {
            System.out.print(it1.next() + "  ");
        }
        System.out.println();

        //Iterator in reverse order
        Iterator it2 = ls_String.descendingIterator();
        while (it2.hasNext()) {
            System.out.print(it2.next() + "  ");
        }
        System.out.println();

        //changing the element in specified index
        ls_String.set(2, "Bottle");
        System.out.println(ls_String);

        //adding elements to first and last
        ls_String.addFirst("First");
        ls_String.addLast("Last");
        System.out.println(ls_String);

        //adding in front of all the elements
        ls_String.offer("Offer"); // last printing
        System.out.println(ls_String);
        ls_String.offerFirst("Offer-first"); // first printing
        System.out.println(ls_String);

        //adding at the end of LinkedList
        ls_String.offer("Offer--last"); // last printing
        System.out.println(ls_String);

        //insert sublist into the list
        LinkedList<String> new_ls_String = new LinkedList<>();
        new_ls_String.add("new linked-1");
        new_ls_String.add("new Linked -2");
        ls_String.addAll(2, new_ls_String);
        System.out.println(ls_String);
        ls_String.remove("new linked-1");
        ls_String.remove("new Linked -2");
        ls_String.remove("Offer-first");
        ls_String.remove("Offer--last");

        //display the elements and their positions in a linked list
        System.out.println(ls_String);
        for (int j = 0; j < ls_String.size(); j++) {
            System.out.println("Index : " + j + " ||  Value = " + ls_String.get(j));
        }

        //Remove first and last element in the list
        ls_String.removeFirst();
        ls_String.removeLast();
        System.out.print(ls_String);
        System.out.println();

        //swap
        Collections.swap(ls_String, 2, 5);
        System.out.println(ls_String);

        //shuffle
        Collections.shuffle(ls_String);
        System.out.println(ls_String);

        //join two linked list
        LinkedList<String> newList = new LinkedList<>();
        newList.add("new");
        newList.add("old");
        LinkedList combineList = new LinkedList();
        combineList.addAll(ls_String);
        combineList.addAll(newList);
        System.out.println(combineList);

        //remove and return the first element
        System.out.println(ls_String.pop());
        System.out.println(ls_String);

        //retrieve but does not remove, the first element of a linked list.
        System.out.println(ls_String.peekFirst());
        System.out.println(ls_String);
        System.out.println(ls_String.peek());//same output peek and peekFirst
        System.out.println(ls_String);

        //same then peekLast

        //check if a particular element exists in a linked list
        System.out.println(ls_String.contains("Red") ? "YES" : "NO");
        System.out.println(ls_String.contains("1000") ? "YES" : "NO");

        // convert LinkedList to ArrayLIst
        List<String> list = new ArrayList<>(ls_String);
        System.out.println(list);

        //compare two LinkedLists
        LinkedList<String> compare = new LinkedList<>();
        newList.add("Purple");
        newList.add("Bottle");
        System.out.println(newList);
        for (String string : ls_String) {
            compare.add(newList.contains(string) ? "Yes" : "No");
        }
        System.out.println(compare);

        //Empty or not
        System.out.println(ls_String.isEmpty());

        //remove all
        ls_String.removeAll(ls_String);

        //isEmpty
        System.out.println(ls_String.isEmpty());

        // replace an element
        System.out.println(newList);
        newList.set(3, "replace");
        System.out.println(newList);
    }
}
