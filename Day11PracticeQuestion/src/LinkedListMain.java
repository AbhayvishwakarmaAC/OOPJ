
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList<Integer> intList= new LinkedList<>();
		
		intList.addFirst(1);
		intList.add(2);
		intList.add(3);
		intList.push(4);
		intList.push(6);
		intList.addLast(5);
		
//		intList.pop();    // remove and return removed value  // in LIFO manner 
		intList.peek() ;   // return top value without Removing
		System.out.println("At top value: "+intList.peek());
		
		Iterator<Integer> itr= intList.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());	

	}

}


/*
Feature	                            ArrayList	                                        LinkedList
Data Structure	                   Dynamic Array	                                    Doubly Linked List
Memory Allocation            	Contiguous blocks	                              Scattered (Non-contiguous)
Random Access (get(index))  	Fast: O(1) — Direct index access	    Slow: O(n) — Traverses nodes
Insertion / Deletion	        Slow: O(n) — May require                    Fast: O(1) — Updates node pointers
                                shifting elements	
Memory Overhead	            Low — Stores data and array capacity	           High — Stores data + two pointers per node
Interfaces Implemented                	List	                                    List, Deque, Queue

*/
