package hackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//https://www.hackerrank.com/challenges/make-it-anagram

public class MakeItAnagram {

	static Map<Character, Integer> s1Map ;
	static Map<Character, Integer> s2Map ;

	public static void main(String[] args) {
		String s1 = "abcd" ;
		String s2 = "abcdefg" ;

		s1Map = formMapFor(s1) ;
		s2Map = formMapFor(s2) ;
		int numDeletions = findNumberOfDeletions(s1Map, s2Map) ;
		System.out.println(numDeletions);

	}

	private static int findNumberOfDeletions(Map<Character, Integer> s1Map,
			Map<Character, Integer> s2Map) {

		int count = 0 ;
		Set<Character> s1keys = s1Map.keySet() ;
		Set<Character> s2keys = s2Map.keySet() ;

		for (Character key : s1keys) {
			if(s2keys.contains(key)){
				if( s2Map.get(key) != s1Map.get(key))
					count++ ;// Increase no of deletions for every difference detected. 
			}
		}

		return count ;
	}

	private static Map<Character, Integer> formMapFor(String s) {

		Map<Character, Integer> map = new HashMap<Character, Integer>() ;
		int i = 0 ;
		while( i < s.length()){
			Integer countValue = map.get(s.charAt(i)) ;
			if( countValue == null ) {
				countValue = new Integer(0) ;
			}
			map.put(s.charAt(i), countValue+1 ) ;
			i++ ;
		}
		return map ;
	}



}
