
// RECURSIVE
public class LongestCommonSubsequence_Recursion {

	public static void main(String[] args) {

//		String s1 = "aadbcbcd" ;
//		String s2 = "adbcbc" ;

		String s1 = "" ;
		String s2 = "" ;
		
		System.out.println("The length of the longest common subsequence " + LCS_Count(s1, s2));
		System.out.println("and the sequence is " + LCS(s1, s2));
	}

	private static int LCS_Count(String s1, String s2) {

		int m = s1.length() ;
		int n = s2.length() ;

		if( m == 0 || n == 0)
			return 0 ;
		else{
			if( s1.charAt(m-1) == s2.charAt(n-1)){
				return ( 1 + LCS_Count(s1.substring(0, --m), s2.substring(0, --n))) ;
			}else{
				return MAX_COUNT( LCS_Count(s1.substring(0, --m), s2.substring(0, n)),  
						LCS_Count(s1.substring(0, m), s2.substring(0, --n)) );
			}

		}
	}

	private static int MAX_COUNT(int a, int b) {
		return ( a >= b ? a: b);
	}

	private static String LCS(String s1, String s2) {

		int m = s1.length() ;
		int n = s2.length() ;

		if( m == 0 || n == 0)
			return "" ;
		else{
			if( s1.charAt(m-1) == s2.charAt(n-1)){
				return ( s1.charAt(m-1) + LCS(s1.substring(0, --m), s2.substring(0, --n))) ;
			}else{
				return MAX( LCS(s1.substring(0, --m), s2.substring(0, n)),  
						LCS(s1.substring(0, m), s2.substring(0, --n)));
			}

		}
	}


	private static String MAX(String a, String b) {
		return ( a.length() >= b.length() ? a: b); 
	}

}
