package set;

import java.util.NoSuchElementException;

public interface ISet {

	/**
	 * This method inserts the element into the set 
	 * @param element
	 * @return true if the element was inserted successfully
	 * false if the element could not be inserted due to some reason ( say duplication)
	 */
	public boolean insert( int element ) ;
	

	/**
	 * This method does the same as above 
	 * The only difference is that the method throws an exception if the element could not
	 * be inserted due to some reason instead of return a true/false flag.  
	 * @param element
	 */
	public void add( int element ) throws ElementNotInsertedException ;
	
	/**
	 * This method deletes the specified element from the set.
	 * @param element
	 * @return the deleted element, or -1 if the element was not found.
	 */
	public int delete( int element) ;
	
	/**
	 * This method deletes the specified element from the set.
	 * @param element
	 * @throws NoSuchElementException if the element was not found.
	 */
	public void remove( int element) throws NoSuchElementException ;
	
	/**
	 * This method searches the element in the set. 
	 * @param element
	 * @return true if the element is found, false otherwise
	 */
	public boolean search( int element) ;
	
	/**
	 * This method searches the element in the set.  
	 * @param element
	 * @throws NoSuchElementException if the element was not found.
	 */
	public void find( int element) throws NoSuchElementException ;
	
	/**
	 * Returns the #elements in the stack.
	 * @return
	 */
	public int size() ;
}
