package hackerRank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class GemsProblem {

	// Algo used :
	// 1. For each string, remove duplicate characters.
	// 2. Parse each string and add character counts to the counts map.
	// do these for all the strings.
	// 3. Finally, get the values from the map & check which values are equal to the no of strings.
	
	
	// This Map stores the element against the no of rocks in which it occurs.
	// So for rocks - abcbb, bbbad, aadb
	// Map will look like [( a, 3), ( b, 3), (c,1), (d,2)]
	// U should return all the keys, whose values are >= # of rocks

	static Map<Character, Integer> elementMap = new HashMap<Character,Integer>();;

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in) ;
		int T = sc.nextInt() ;
		sc.nextLine() ;
		int i = 0 ;
		String rocks[] = new String[T] ;
		while( i < T){
			rocks[i] = sc.nextLine() ;
			parseRocks(rocks[i]) ;
			i++ ;
		}

		System.out.println(countNumberOfGemElements( T)) ;
	}

	/**
	 * This method parses each of the rocks and adds the character count to the map.
	 * @param rock
	 */
	public static void parseRocks( String rock){
		String rockDuplicateElementsRemoved = getUniqueChars(rock) ;
		int count ;
		for( int element = 0 ; element < rockDuplicateElementsRemoved.length(); element++){
			if( elementMap.get(rockDuplicateElementsRemoved.charAt(element)) == null )
				elementMap.put(rockDuplicateElementsRemoved.charAt(element), 1)    ;
			else{
				count = elementMap.get(rockDuplicateElementsRemoved.charAt(element)) ;
				elementMap.put(rockDuplicateElementsRemoved.charAt(element), 1 +count)    ;
			}
		}
	}

	public static int countNumberOfGemElements(int T){
		int count = 0 ;

//		int totalElementCOunts = elementMap.values() ;
		for( Character key : elementMap.keySet()){
			if( elementMap.get(key) == T){
				count++ ;
			}
		}
		return count ;
	}

	/**
	 * This method removes all the duplicate characters in a string.
	 * @param rock
	 * @return
	 */
	public static String getUniqueChars(String rock){
		Set<Character> s = new HashSet<Character>() ;
		StringBuilder sb = new StringBuilder() ;

		for( int i = 0 ; i < rock.length(); i++){
			if(s.add(rock.charAt(i))){			// TRICK!!!
				sb.append(rock.charAt(i)) ;        
			}
		}
		return sb.toString() ;
	}
}
