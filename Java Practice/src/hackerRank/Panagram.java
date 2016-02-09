package hackerRank;
import java.util.HashMap;
import java.util.Map;


public class Panagram {


	public static void main(String[] args) {

		String s = "We promptly judged antique ivory buckles for the prize" ;

		parseString(s) ;
		if( isPanagram(s))
			System.out.println("panagram");
		else
			System.out.println("not panagram");
	}

	private static Map<Character, Integer> parseString(String s) {

		int i = 0 ;
		Map<Character, Integer> letterCountMap = new HashMap<Character, Integer>( 26) ;
		letterCountMap = buildMap( letterCountMap) ;
		String str = s.toLowerCase() ;

		while( i < str.length()){	
			Character currentChar = str.charAt(i) ;
			if( Character.isLetter(currentChar)){
				letterCountMap.put(currentChar, 1) ;
			}
			i++ ;
		}
		
		return letterCountMap ;
	}

	private static boolean isPanagram(String s) {
		if( parseString(s).containsValue(0))
			return false;
		else
			return true ;
	}

	
	
	private static Map<Character, Integer> buildMap(
			Map<Character, Integer> letterCountMap) {
		
		letterCountMap.put('a', 0) ;
		letterCountMap.put('b', 0) ;
		letterCountMap.put('c', 0) ;
		letterCountMap.put('d', 0) ;
		letterCountMap.put('e', 0) ;
		letterCountMap.put('f', 0) ;
		letterCountMap.put('g', 0) ;
		letterCountMap.put('h', 0) ;
		letterCountMap.put('i', 0) ;
		letterCountMap.put('j', 0) ;
		letterCountMap.put('k', 0) ;
		letterCountMap.put('l', 0) ;
		letterCountMap.put('m', 0) ;
		letterCountMap.put('n', 0) ;
		letterCountMap.put('o', 0) ;
		letterCountMap.put('p', 0) ;
		letterCountMap.put('q', 0) ;
		letterCountMap.put('r', 0) ;
		letterCountMap.put('s', 0) ;
		letterCountMap.put('t', 0) ;
		letterCountMap.put('u', 0) ;
		letterCountMap.put('v', 0) ;
		letterCountMap.put('w', 0) ;
		letterCountMap.put('x', 0) ;
		letterCountMap.put('z', 0) ;
		return letterCountMap ;
	}
}
