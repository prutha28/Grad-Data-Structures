package insertion.sort;

public class MergeSort {

	//	static String[] arr = { "mary", "john", "jane" , "ana" , "peter", "heena", "cristina" , "nathan", "meredith", "Derek" }; 

	//	static int[] arr = { 45, 87, 2, 1, 34, -1, 9, 2, 65 } ;
	static int[] arr = { 6, 9, 2, 1, 5, 8 } ;

	public static void main(String[] args) {

		System.out.println("Contents before sorting");
		print() ;

		System.out.println("Contents after sorting");
		arr = mergesort( arr, 0, arr.length -1 ) ;
		print() ;
	}


	private static int[] mergesort( int[] arr, int begin, int end ) {

		int[] left ; 
		int[] right ;
		int[] result = null ;

		// BASE case
		if( begin > end) 
			return null ;

		// BASE Case
		else if( begin == end){
			result = new int[1] ;
			result[0] = arr[begin] ;
			return result ;	// here is he issue TODO
		}
		else if( begin < end){

			int mid = ( end - begin ) /2 ;
			left = mergesort(arr, begin, mid) ;
			right = mergesort(arr, mid + 1 , end) ;
			result = merge( left, right ) ;
		}

		return result ;
	}


	private static int[] merge(int[] left, int[] right) {

		int result[] = new int[left.length + right.length] ;
		int i = 0 ; 
		int j = 0 ;
		int k = 0 ;

		while( i < left.length && j< right.length) {
			if( left[ i ] <= right[ j ]){
				result[ k ] = left[ i ] ;
				i++ ;
			}else{
				result[k] = right[j] ;
				j++ ;
			}
			k++ ;
		}

		while( i < left.length ) {
			result[ k ] = left[ i ] ;
			i++ ;
			k++ ;
		}

		while( j< right.length) {
			result[ k ] = right[ j ] ;
			j++ ;
			k++ ;
		}
		return result ;

	}


	private static void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

}
