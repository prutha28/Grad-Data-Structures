package hackerRank;

import java.util.Scanner;

public class SherlockArrayProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in) ;
		int T = sc.nextInt() ;

		for( int i = 1; i <= T; i++){
			int size = sc.nextInt() ;
			int arr[] = new int[size] ;
			for( int j = 0; j < size; j++){
				arr[j] = sc.nextInt() ;
			}
			if(test(arr)){
				System.out.println("YES") ;
			}else{
				System.out.println("NO") ;
			}
		}
	}


	private static boolean test( int[] arr){
		boolean flag = false ;
		// Special Case check for the very first element.
		flag = ( sum( arr, 1, arr.length-1) == 0 );
		if( flag) return true ;
		
		// Special Case check for the very last element.
		flag = ( sum( arr, 0, arr.length-2) == 0 );
		if( flag) return true ;
		
		for( int index = 1 ; index <= arr.length-2; index++){
			flag = (sum(arr, 0, index-1) == sum(arr,index+1, arr.length-1) ) ;
			if( flag == true){
				return true ;
			}
		}
		return false ;
	}

	/**
	 * This method just calculates the sum of all elements of the array from start to end( inclusive).
	 * @param arr
	 * @param start
	 * @param end
	 * @return
	 */
	private static int sum(int[] arr, int start, int end){
		int sum = 0 ;

		if( start == end){
			sum = 0 ;
		}
		for( int i = start; i <=end; i++){
			sum = sum + arr[i] ;
		}
		return sum ;
	}
}