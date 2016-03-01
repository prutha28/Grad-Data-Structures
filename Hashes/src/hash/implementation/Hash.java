package hash.implementation;

import java.util.Collection;
import java.util.Set;

/**
 * 
 * @author prutha
 *
 * @param <Key>
 * @param <Person>
 * 
 * 
 * Consider a HashMap implementation that has some custom class "Key" as the key.
 * and Person as the value being stored.
 * 
 * For a class to act as a key in a hashtable/hashmap/hashset, it must override the equals method
 * => it must override the hash code method.
 */

public class Hash implements IHash {


	int capacity ;
	// We maintain the data in an underlying array of Items. i.e. each element in the array ( called bucket) 
	//	is a pointer to an item.
	Item[] buckets ; 

	public Hash(){
		this(16) ;// default capacity is 16.
	}

	public Hash( int initialCapacity){
		this.capacity = initialCapacity ;
		this.buckets = new Item[ capacity ] ;
	}

	/**
	 * Given the key, fetch the value associated with that key.
	 * Steps:
	 * 
	 * 1. Calculate the hashcode for the given key.
	 * 2. Calculate the corresponding index value & go to that index of the bucket.
	 * 3. For each item in the linked list at that index, compare hash codes & keys for equality
	 * 	  using the equals method. Return the value corresponding to the match in hashcode && key. 
	 */
	
	public Person get( String key) {
		
		// Trick! to make sure the index is within the bounds of teh underlying array.
		int hashCode = hash(key) ;
		int index = hashCode % capacity ;
		
		if( buckets[index] == null)
			return null ;
		else{
			Item currentItem = buckets[index] ;
			while( currentItem != null){
				if( currentItem.hashCode == hashCode && currentItem.key.equals(key)){
					return currentItem.person ;
				}
				currentItem = currentItem.next ;
			}
		}
		return null;
	}

	public void put(String key, Person value) {
		
		int hashCode = hash(key) ;
		int index = hashCode % capacity ;
		
		if( buckets[index ] == null){
			buckets[index] = new Item(key, value, hashCode) ;
		}else{
			Item currentItem = buckets[index] ;
			while( currentItem.next != null){
				currentItem = currentItem.next ;
			}
			currentItem.next = new Item(key, value, hashCode) ;
		}
		
	}

	public Person remove(String key) {
		int index = hash(key) % capacity ;
		
		if( buckets[index] == null){
			return null ;
		}else{
//			Item currentItem = 
		}
		return null;
	}

	public boolean isEmpty() {
		return (size() == 0 ) ? true : false ;
	}

	public boolean containsKey( String key) {

		Set<String> keys = this.keySet() ;

		for( String k : keys ){
			if( k == key){
				return true ;
			}
		}
		return false;
	}

	public boolean containsValue( Person value) {

		Collection<Person> values = this.values() ;

		for( Person person : values){
			if( person.equals(value)){
				return true ;
			}
		}

		return false;
	}

	public int size() {
		return 0;
	}

	public Set<String> keySet() {
		return null;
	}

	public Collection<Person> values() {
		return null;
	}

	/**
	 * This method takes the key string and processes it to return an
	 * index into the array.
	 * @param key
	 * @return
	 */

	// Here we simply sum up the ascii values of the elements
	// of the array and divide that sum by no of buckets.
	// The remainder will be the hash value.
	private int hash( String key ){

		int hashCode = 0 ;

		for( char c : key.toCharArray()){
			hashCode += c ;
		}

		return hashCode ;
	}

	public Collection<Person> entries() {
		return null;
	}
	
	
	public void print(){
		
		for (int index = 0; index < buckets.length; index++) {
			
			Item currentItem = buckets[index] ;
			while( currentItem != null){
				System.out.println("bucket no:" + index);
				System.out.println(currentItem.hashCode);
				System.out.println(currentItem.person);
				System.out.println();
				currentItem = currentItem.next ;
			}
		}
	}
	
	public void clear(){
		
	}
}
