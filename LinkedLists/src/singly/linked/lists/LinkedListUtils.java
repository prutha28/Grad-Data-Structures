package singly.linked.lists;

import java.util.HashMap;

public class LinkedListUtils {

	LinkedList ll ;

	public LinkedListUtils( LinkedList ll){
		this.ll = ll ;
	}

	// Iterative
	public int countOccurences( int element ){
		Node current = ll.head ;
		int count = 0 ;

		if( current == null)
			return 0;

		while( current != null){
			if( current.data == element)  
				count++;
			current = current.next ;
		}
		return count ;
	}

	// Recursive
	public int countOccurences( Node current, int element ){

		if( current == null)
			return 0 ;

		if( current.data == element)
			return (1 + countOccurences(current.next, element)) ;
		else
			return countOccurences(current.next, element) ;
	}	

	/**
	 * @return the element at the nth position from the beginning, -1 if the element is not found. 
	 */
	public int getNth( int index ){
		Node current = ll.head ;
		if( current == null )
			return -1 ;

		int count = 0 ;

		while( current != null ){
			if( count == index)
				return current.data ;
			current = current.next ;
			count++ ;
		}
		return -1 ;
	}

	public int getNthfromEnd( int index){
		return getNth(ll.count() - index + 1) ;
	}


	public void deleteList(){
		Node current = ll.head ;
		Node temp = ll.head.next ;

		while( current.next != null){
			temp = current.next ;
			current.data = -1 ;
			current = temp ;
		}
	}

	/**
	 * Given a linked list that is already sorted, insert a new node into it
	 * such that the resulting list is still sorted.
	 * 
	 * @param resultHead the head of the resulting linked list.
	 * @param data to be inserted
	 * @return the head pointer of the resulting linked list.
	 */
	public Node sortedInsert( Node resultHead, int data ){

		Node newNode = new Node(data) ;

		// Empty List or Inserting node at the head		 Tricky !!!
		if( resultHead == null || newNode.data < resultHead.data ){
			newNode.next = resultHead ;
			resultHead = newNode ;
			return resultHead ;
		}
		// Non Empty List
		Node current = resultHead ;
		Node prev = current ;

		while( current != null && current.data < newNode.data){
			prev = current ;
			current = current.next ;
		}

		// end of the list is reached
		if( current == null){
			prev.next = newNode ;
		}
		else if( current.data >= newNode.data){
			newNode.next= current ;
			prev.next = newNode ;
		}

		return resultHead ;
	}

	/**
	 * Given the reference to a linked list ( unsorted), rearrange the nodes 
	 * so that they are sorted.
	 * @param head
	 */
	public Node insertSort( Node head){

		Node resultHead = null ;
		Node current = head ;

		if( head == null)
			return null ;

		while( current != null ){
			resultHead = sortedInsert(resultHead, current.data) ;
			current = current.next ;
		}

		return resultHead ;
	}

	public Node split( Node head ){
		Node head1 = head ;
		Node head2 = null ;

		Node fast = head1, slow = head1;

		while( fast != null ){

			fast = fast.next ;

			if( fast != null){
				fast = fast.next ;
				slow = slow.next ;
			}
		}

		head2 = slow.next ;
		slow.next = null ;
		return head2 ;
	}


	// Remove duplicates from sorted linked list : O(nlogn) for sorting Time & O(1) Space.
	public Node removeDuplicates( Node head ){

		Node prev = this.insertSort(head) ;
		Node current = prev.next ;

		// Empty List
		if( current == null)
			return null ;

		while( prev != null){

			current = prev.next ;

			if( current != null && prev.data == current.data){
				prev.next = current.next ;
				current.next = null ;
			}

			prev = prev.next ;
		}
		return head ;
	}


	// Remove duplicates from unsorted linked list : O(n) for sorting Time & O(n) Space.

	public Node removeDuplicatesUnsorted( Node head ){

		Node current = head ;
		Node prev = current ;
		HashMap<Integer, Boolean> elementPresentMap = new HashMap<Integer, Boolean>() ;

		while( current != null){
			prev = current ;
			int key = current.data ;

			if( elementPresentMap != null){
				if( elementPresentMap.get(key) == Boolean.TRUE){
					// Element is already present
//					elementPresentMap.put(key, false) ;
					prev.next = current.next ;
					current.next = null ;
				}
				else{
					// Element is not present
					elementPresentMap.put(key, true) ;
				}
			}
			current = current.next ;
		}

		return head;

	}
}
