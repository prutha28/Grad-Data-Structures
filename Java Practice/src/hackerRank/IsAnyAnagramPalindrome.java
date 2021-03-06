package hackerRank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/**
 * Given a string, determine if any anagram of the string is a palindrome.
 * @author prutha
 *
 */
public class IsAnyAnagramPalindrome {

	public static void main( String args[]){
		
		String s = "dmaam" ;

		if( isPalindrome(s)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
	
	public static boolean isPalindrome( String s){
		
		// 1. Keep a count of occurences of character is s
		// 2. For s to be a palindrome, the no of characters with odd count should either be 1("aagbbgaa")
		// or 0.( "aaaa")
		Map<Character, Integer> charCountsMap = new HashMap<Character, Integer>() ;
		
		for( char c : s.toCharArray()){
			if( charCountsMap.get(c) == null){
				charCountsMap.put(c, 1 ) ;
			}else{
				int count = charCountsMap.get(c) ;
				charCountsMap.put(c, count +1 ) ;
			}
		}
		
		// Now check how many of the character counts(values in the map) are odd/even.
		
		int odds = 0 ;
		Iterator<Integer> itr = charCountsMap.values().iterator() ;
		while( itr.hasNext()){
			int count = itr.next() ;
			
			if( count %2 != 0 )
				odds++ ;
		}
		return (odds == 0 || odds ==1) ;
	}
}

