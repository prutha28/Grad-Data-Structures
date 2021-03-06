// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");


public class LeastCommonInArray {

	public static int solution(int[] A, int[] B) {
		// write your code in Java SE 8

		int m = A.length ;
		int n = B.length ;

		// Create a HashMap to store elements of A and a corresponding boolean flag
		// indicating whether it is presen or not.

		Map<Integer, Boolean> elementMap = new HashMap<Integer, Boolean>() ;

		int i = 0 ;

		while( i < m){
			elementMap.put(A[i], Boolean.TRUE) ;
			i++ ;
		}

		// Now traverse the second array and check if the element is present in hashMap.

		int currentMin = Integer.MAX_VALUE;

		int j = 0 ;
		while( j < n){
			if(elementMap != null && elementMap.get(B[j]) != null ){
				if( B[j] < currentMin){
					currentMin = B[j] ;
				}
			}
			j++ ;
		}

		if( currentMin == Integer.MAX_VALUE){
			// No common element was found.
			return -1 ;
		}else{
			return currentMin ;
		}
	}

	
	public static void main( String[] args){
		
		int A[] = { 1,3,2,1} ;
		int B[] = { 4, 2, 5,3,2} ;
		System.out.println(solution(A, B));
	}

}
