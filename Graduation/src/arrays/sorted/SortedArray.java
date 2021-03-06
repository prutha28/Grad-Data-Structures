package arrays.sorted;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;


public class SortedArray
{
	String[] data ;
	int count ;
	private static int SIZE = 10 ;

	public SortedArray(){
		data = new String[ SIZE ] ;
		//		for (int i = 0; i < SIZE; i++) {
		//			data[ i ] = "\0" ;
		//		}
		count = 0 ;
	}

	// TODO
	public int sortedInsert( String element ){
		int mid = count /2 ;
		int begin = 0 ;
		int end = count -1 ;
		int i ;

		while( begin < end ){
			if( element.equals(data[mid])){
				i = mid ;
				while( i < end ){
					data[ i +1] = data[ i ] ;
					i++ ;
				}
				return mid ;
			}else if( element.compareTo(data[mid]) < -1){
				end = mid ;
			}else{
				begin = mid +1 ;
			}
		}

		return mid ;
	}

	/**
	 * This method inserts the new element at the correct position 
	 * in the sorted array and returns the index of the newly inserted element.
	 * @param element
	 * @return
	 * @throws FullArrayException 
	 */
	public int add( String key) throws FullArrayException {

		if( isFull()){
			throw new FullArrayException("Array is full, cannot add more.");
		}

		if( count == 0 ){
			data[0] = key ;
			count++ ;
			return 0 ;
		}

		int i = count -1 ;
		while( i >= 0 && key.compareTo(data[i]) < 0 ){
			data[ i + 1 ] = data[ i ] ;
			i-- ;
		}
		data[ i +1 ] = key ;
		count++ ;
		return (i+1);
	}

	private boolean isFull() {
		return ( count >= SIZE );
	}

	private boolean isEmpty() {
		return ( count == 0  );
	}
	public String elementAtIndex(int index) {
		if( index < 0 || index >= count){
			throw new ArrayIndexOutOfBoundsException(index) ;
		}
		return data[ index];
	}
	/**
	 * This method traverses the array till the last held element( given by count)
	 * and returns the index, where the element was found, -1 otherwise. 
	 * @param element
	 * @return
	 * @throws EmptyArrayException 
	 */
	public int search( String element) throws EmptyArrayException {

		if( isEmpty()){
			throw new EmptyArrayException("Array is empty, nothing to search.") ;
		}
		for (int i = 0; i < count; i++) {
			if( element.equals(data[i]))
				return i;
		}
		return -1 ;
	}

	public List<Integer> searchAll(String element) throws EmptyArrayException {

		if( isEmpty()){
			throw new EmptyArrayException("Array is empty, nothing to search.") ;
		}
		List<Integer> indices = new ArrayList<Integer>() ;
		for (int i = 0; i < count; i++) {
			if( element.equals( data[i] ))
				indices.add( i ) ;
		}
		return indices ;
	}

	public String delete( String element) throws EmptyArrayException {
		int index = search(element) ;
		if( index == -1 )
			throw new NoSuchElementException("The element " + element + " was not found.") ;
		else
			return deleteElementAtIndex(index) ;
	}

	/**
	 * This method deletes whatever element is present at the given index.
	 * @param index
	 * @return the element being deleted
	 */
	public String deleteElementAtIndex(int index) {

		if( index < 0 || index >= count){
			throw new ArrayIndexOutOfBoundsException("Invalid Index : " + index ) ;
		}
		String deleted = elementAtIndex(index) ;
		while( index <= count-2 ){
			data[ index ] = data[ index + 1 ] ;
			data[ index + 1 ] = null ;			// Critical Step.
			index++ ;
		}
		count-- ;
		return deleted ;
	}

	
	/**
	 * This method deletes all the occurrences of the element in the array 
	 * @param element
	 * @return list of all the elements being deleted.
	 * @throws EmptyArrayException 
	 * This method works by first finding the index at which the element is present( if it is)
	 * and then calling the delete method on that index.
	 * Subsequently, the array is iterated as long as the element is present ( i.e. the search( element)
	 * does not return -1)
	 */
	public List<String> deleteAllOccurences(String element) throws EmptyArrayException {
		List<String> deleted = new ArrayList<String>() ;

		int index = search(element);
		while( index != -1){
			deleted.add(deleteElementAtIndex( index )) ;
			index = search(element);
		}
		return deleted ;
	}

	public String deleteFromBegin() throws EmptyArrayException {
		if( count == 0 ){
			throw new EmptyArrayException("Array is empty, nothing to delete!") ; 
		}
		return deleteElementAtIndex(0) ;
	}

	public String deleteFromEnd() {
		return deleteElementAtIndex(count-1) ;
	}

	public int binarySearch(int element, int beginIndex, int endIndex) {
		return 0;
	}

	public void showContents(){
		if( count == 0 ){
			System.out.println("Empty Array");
			return ;
		}

		for (int i = 0; i < count; i++) {
			System.out.print( data[ i ] + " " );
		}
		System.out.println();
	}
}