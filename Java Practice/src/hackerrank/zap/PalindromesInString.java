package hackerrank.zap;
import java.util.HashSet;
import java.util.Set;


public class PalindromesInString {

	static String s = "aabaa" ;
	static Set<String> palindromes = new HashSet<String>() ;

	public static void main( String[] args){

//		for (int i = 0; i < s.length(); i++) {
//			for (int j = i; j < s.length() ; j++) {
//				if( isPalindrome(s, i, j)){
////					printString( s, i, j) ; /// repetitions
////					System.out.println();
//				}
//			}
//		}
		System.out.println(palindrome(s));
		System.out.println(palindromes);
	}	

	public static int palindrome( String s){
		parseString(s) ;
		return palindromes.size() ;
	}
	
	private static void parseString(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length() ; j++) {
				 isPalindrome(s, i, j) ;
			}
		}		
	}

	public static boolean isPalindrome( String s, int start, int end){
		boolean isPalindrome = true ;
		int i = start ;
		int j = end ;
		while( start <= end){
			if( s.charAt(start) != s.charAt(end)){
				isPalindrome = false ;
				return isPalindrome ;
			}
			start++ ;
			end-- ;
		}
		if( isPalindrome ){
			palindromes.add(s.substring(i, j+1)) ;	
		}
		return isPalindrome ;
	}
	

	private static void printString(String s, int i, int j) {
		int k = i ;
		char[] chars = s.toCharArray() ;
		while( k <= j){
			System.out.print(chars[k]);
			k++ ;
		}
	}
	
}
