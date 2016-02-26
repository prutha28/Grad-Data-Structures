package hackerRank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class GemsProblem {

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

	public static void parseRocks( String rock){

		String uniqueStr = getUniqueChars(rock) ;
		int count ;
		for( int i = 0 ; i < uniqueStr.length(); i++){
			if( elementMap.get(uniqueStr.charAt(i)) == null )
				elementMap.put(uniqueStr.charAt(i), 1)    ;
			else{
				count = elementMap.get(uniqueStr.charAt(i)) ;
				elementMap.put(uniqueStr.charAt(i), 1 +count)    ;
			}
		}
	}

	public static int countNumberOfGemElements(int T){
		int count = 0 ;

		for( Character key : elementMap.keySet()){
			if( elementMap.get(key) == T){
				count++ ;
			}
		}
		return count ;
	}

	public static String getUniqueChars(String rock){
		Set<Character> s = new HashSet<Character>() ;
		StringBuilder sb = new StringBuilder() ;

		for( int i = 0 ; i < rock.length(); i++){
			if(s.add(rock.charAt(i))){
				sb.append(rock.charAt(i)) ;        
			}
		}
		return sb.toString() ;
	}
}
