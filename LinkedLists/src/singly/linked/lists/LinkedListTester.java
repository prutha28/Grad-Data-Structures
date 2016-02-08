package singly.linked.lists;

public class LinkedListTester {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList() ;
		
		System.out.println("----------------------------INSERTIONS----------------------------------");
		System.out.println("Pushing 100");
		ll.push(100) ;
		
		System.out.println("Pushing 10");
		ll.push(10) ;
		
		System.out.println("Inserting 99 at position 1");
		ll.insertAtN(99, 1) ;
		System.out.println("Inserting 50 at position 3");
		ll.insertAtN(50, 3) ;
		System.out.println("Inserting 70 at position 4");
		ll.insertAtN(70, 4) ;
	
		System.out.println("Printing the elements of linked list.");
		ll.recursivePrint(ll.head) ;
		System.out.println();
		System.out.println("Printing the elements of linked list in reverse order.");
		ll.reversePrint(ll.head) ;
		
		System.out.println();
		System.out.println("Appending 122 to the tail");
		ll.appendToTail(122) ;
		System.out.println("Appending 93 to the tail");
		ll.appendToTail(93) ;
		System.out.println("Pushing 87");
		ll.push(87) ;
		ll.recursivePrint(ll.head) ;
		
		System.out.println();
		System.out.println("----------------------------DELETIONS----------------------------------");
		System.out.println();
		System.out.println("After deleting the element " + ll.deleteFromHead() + " from the head" );
		ll.recursivePrint(ll.head) ;
		
//		System.out.println();
//		System.out.println("After deleting the element " + ll.deleteFromPos(3) + " from the position 3" );
//		ll.print() ;
		
		System.out.println();
		System.out.println("After deleting the element " + ll.deleteFromTail() + " from the tail" );
		ll.print() ;
		
		System.out.println("----------------------------SEARCHING----------------------------------");
		System.out.println("The element 100 was found at index " + ll.search(100));
		System.out.println("The element 78 was found at index " + ll.search(78));
		
		if( ll.isFound(30)){
			System.out.println("The number 30 is found.");
		}else{
			System.out.println("The number 30 is not found.");
		}
		
		ll.print() ;
		
		LinkedListUtils utils = new LinkedListUtils(ll) ;
		LinkedList result = new LinkedList() ;
		
		result.head = utils.insertSort(ll.head) ;
		result.print() ;
		
		result.head = utils.sortedInsert( result.head, 88) ;
		result.head = utils.sortedInsert( result.head, 40) ;
		result.head = utils.sortedInsert( result.head, 21) ;
		result.head = utils.sortedInsert( result.head, 5) ;
		result.head = utils.sortedInsert( result.head, 10) ;
		result.print() ;
		
		
	}
}