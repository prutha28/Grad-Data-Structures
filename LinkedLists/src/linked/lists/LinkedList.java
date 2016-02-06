package linked.lists;

public class LinkedList {

	Node head ; 
	int count ;

	public LinkedList(){
		count = 0 ;
		head = null ;
	}

	public LinkedList( Node head ){
		this.head = head ;
		this.count = 1 ;
	}

	public Node push( int data){
		Node newNode = new Node( data ) ;

		if( head == null){
			head = newNode ;
			return head ;
		}

		newNode.next = head ;
		head = newNode ;
		return head ;
	}

	public Node insertAtN( int data, int pos){

		Node newNode = new Node( data) ;
		Node current = head ;
		Node prev = current ;
		int index = 0 ;

		//		if( pos > this.count){
		//			throw new ArrayIndexOutOfBoundsException() ;
		//		}
		if( head == null){
			// First insertion
			head = newNode ;
			return head ;
		}

		while( current != null && index < pos){
			prev = current ;
			current = current.next ;
			index++ ;
		}

		if( index == pos){
			newNode.next = prev.next ;
			prev.next = newNode ;
			count++ ;
		}
		if( current == null){
			prev.next = newNode ;
		}

		return head ;
	}


	public void appendToTail( int data){

		Node newNode = new Node( data) ;
		if( head == null){
			head = newNode ;
		}

		Node current = head ;
		while( current.next != null){
			current = current.next ;
		}	
		current.next = newNode ;
	}


	public Node deleteFromHead(){
		if( head == null)
			return null ;
		
		Node deleted = head ;
		head = head.next ;
		return deleted ;
	}

	public void deleteFromTail(){
		Node current = head ;
		Node prev = head ;
		
		if( current == null ){
			return ;
		}
		while( current != null ){
			prev = current ; 
			current = current.next ;
		}
	}

	public void deleteFromPos( int position ){
		int count = 1 ;
		if( head == null )
			return ;
		
		Node current = head ;
		Node prev = current ;
		while( position > count && current != null){
			prev = current ;
			current = current.next ;
			count++ ;
		}
		
		if( position == count ){
			prev = current.next ;
		}
		
	}
	public void print(){
		Node current = head ;
		while( current != null){
			System.out.print( current.data + " ");
			current = current.next ;
		}
		System.out.println();
	}

	public void recursivePrint( Node current ){
		if( current == null ){
			return ;
		}
		System.out.print(current.data + "  ");
		recursivePrint(current.next) ;
	}


	public void reversePrint( Node current){

		if( current == null)
			return ;
		reversePrint(current.next) ;
		System.out.print(current.data + "  ");

	}

	public int count(){
		int count = 0 ;
		if( head == null )
			return 0 ;
		else{
			Node current = head ;
			while( current != null){
				current = current.next ;
				count++ ;
			}
		}
		return count ;
	}
}
