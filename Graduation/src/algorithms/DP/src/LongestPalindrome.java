import java.util.HashSet;
import java.util.Set;


public class LongestPalindrome {

	public static void main(String[] args) {

		String s = "I am madam" ;
		findLongestPalindrome(s) ;
	}

	private static void findLongestPalindrome( String s) {
		
		StringBuilder sb ;
		Set<String> palindromes = new HashSet<String>() ;
		
		int i ;
		int j ;

		for (int k = 0; k < s.length(); k++) {
			i = k ;
			j = k ;
			
			while(i >=0 && j < s.length() && s.charAt(i) == s.charAt(j)){
				sb = new StringBuilder() ;
				sb.append(s.substring(i, j+1)) ;
				System.out.println(sb.toString());
				palindromes.add(sb.toString()) ;
				i-- ;
				j++ ;
			}
		}
		System.out.println(palindromes.toString());
	}
}
