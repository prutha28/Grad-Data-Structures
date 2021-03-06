package set;

import java.util.NoSuchElementException;

import arrays.unsorted.Array;

public class Set{

	// The in-built data structure for holding the data.
	// The API will be implemented in such a way that the array won't 
	//	allow duplicates.

	Array data ;
	/**
	 * This method inserts the element into the set 
	 * @param element
	 * @return true if the element was inserted successfully
	 * false if the element could not be inserted due to some reason ( say duplication)
	 */

	public Set(){
		data = new Array() ;
	}

	public Set( int[] data){
		this.data = new Array() ;
		for (int i = 0; i < data.length; i++) {
			this.data.insertAtIndex(data[i], i) ;
		}
	}


	public boolean insert( int element ) {
		if( this.search(element)){
			System.out.println(element + " is already present in the set.");
			return false ;
		}else{
			return data.add(element) ;
		}
	}

	/**
	 * This method does the same as above 
	 * The only difference is that the method throws an exception if the element could not
	 * be inserted due to some reason instead of return a true/false flag.  
	 * @param element
	 */
	public void add( int element ) throws ElementNotInsertedException {
		if( search(element)){
			throw new ElementNotInsertedException() ;
		}else{
			data.add(element) ;
		}			
	}

	/**
	 * This method deletes the specified element from the set.
	 * @param element
	 * @return the deleted element, or -1 if the element was not found.
	 */
	public int delete( int element) {
		if( search(element)){
			return data.delete(element) ;
		}else{
			System.out.println(element + " is not found in the array.");
			return -1 ;
		}
	}

	/**
	 * This method deletes the specified element from the set.
	 * @param element
	 * @throws NoSuchElementException if the element was not found.
	 */
	public void remove( int element) throws NoSuchElementException {
		if( search(element)){
			data.delete(element) ;
		}else{
			System.out.println(element + " is not found in the array.");
			throw new NoSuchElementException() ;
		}
	}

	/**
	 * This method searches the element in the set. 
	 * @param element
	 * @return true if the element is found, false otherwise
	 */
	public boolean search( int element){
		for (int i = 0; i < data.size(); i++) {
			if( element == data.elementAtIndex(i))
				return true ;
		}
		return false ;
	}

	/**
	 * This method searches the element in the set.  
	 * @param element
	 * @throws NoSuchElementException if the element was not found.
	 */
	public void find( int element) throws NoSuchElementException {
		int index = data.search(element) ;
		if( index == -1)
			throw new NoSuchElementException() ;
		else
			System.out.println(element + " was found at index " + index );
	}

	/**
	 * Returns the #elements in the stack.
	 * @return
	 */
	public int size() {
		return data.size() ;
	}


	public void showContents() {
		data.showContents() ;
	}
	/**
	 * 
	 * @return the elements contained in the set as an array.
	 */
	public int[] elements(){
		
		int result[] = new int[data.size()] ;
		
		for ( int i = 0; i < data.size(); i++) {
			result[i] = data.elementAtIndex(i) ;
		}
		
		return result ;
	}
}