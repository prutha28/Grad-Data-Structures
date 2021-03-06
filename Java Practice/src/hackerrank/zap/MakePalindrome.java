package hackerrank.zap;

public class MakePalindrome {

	public static void main(String[] args) {
		String s = "aabbc" ;
		int count = new MakePalindrome().countOperations(s) ;
		System.out.println("The min no of operations is " + count);
	}

	private int countOperations(String s) {
		
		int start = 0 ;
		int end = s.length() -1 ;
		int count = 0 ;
		
		while( start < end){
			count = count + Math.abs(s.charAt(start) - s.charAt(end) ) ;
			start++ ;
			end-- ;
		}
		
		return count ;
	}

}
