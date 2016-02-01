package arrays.unsorted;


/** 

	This stores an array of elements of the specified type T.

**/

public interface IArray<T>{

	/**
	 * This method inserts the element at the end of the array.
	 * 
	 * @param element
	 * @return true if the element was inserted successfully
	 * false if the element was not inserted ( due to array index out of bounds)
	 */
	public boolean insert(int element) ;
	public boolean insertAtStart( int element) ;
	public boolean insertAtEnd( int element) ;

	/**
	 * This method inserts the specified element at the specified index 
	 * @param element
	 * @param index
	 * @return
	 */
	public boolean insertAtIndex( int element, int index ) ;
	
	/**
	 * This returns the element at the specified index.
	 * @param index
	 * @return
	 */
	public int elementAtIndex( int index ) ;
	
	/**
	 * LINEAR SEARCH
	 * This method searches the specified element in the array & returns the index 
	 * where the element was first found, returns -1 otherwise.
	 * @param element
	 * @return
	 */
	public int search( int element ) ;
	
	/**
	 * Deletes the first occurrence of the specified element
	 * @param element
	 * @return
	 */
	public int delete( int element) ;
	
	public int deleteElementAtIndex( int index ) ;
	/**
	 * This method deletes all the occurrences of the specified element.
	 * @param element
	 * @return the array of indices of elements that were removed.
	 */
	public int[] deleteAll( int element ) ;

	public int deleteFromBegin() ;
	public int deleteFromEnd() ;
	
	public int binarySearch( int element, int beginIndex, int endIndex) ;
	
	
}