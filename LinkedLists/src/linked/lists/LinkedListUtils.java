package linked.lists;

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
	
	
}
