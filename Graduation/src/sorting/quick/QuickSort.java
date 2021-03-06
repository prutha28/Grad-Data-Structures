package sorting.quick;

public class QuickSort {

	static int[] A = { 2, 6, 5, 9, 8, 7, 4 } ;

	public static void main(String[] args) {

		//		int[] arr = { 23,3, 7, 99 , 111, 10000, 6 } ;
		print( A ) ;
		qsort( 0 , A.length - 1) ;
		print( A ) ;
	}

	private static int[] qsort( int p, int r ) {

		// BASE CASES : Tricky!
		if( p == r){
			int[] result = new int[1] ;
			result[0] = A[p] ;
			return result ;
		}

		else if( p < r){
			int q = partition( p, r ) ;	// index of pivot
			int left[] = qsort( p, q-1) ;	
			int right[] = qsort( q+1, r) ;
			return concat( left, A[q], right) ;
		}else{
			return null ;
		}
	}

	private static int[] concat(int[] left, int pivot, int[] right) {

		int result[] ;

		if( left == null && right != null){
			result = new int[ 1 + right.length ] ;
		}else if( left != null && right == null){
			result = new int[ 1 + left.length ] ;
		}
		else{
			result = new int[ left.length + 1 + right.length ] ;
		}

		int i = 0  ; // Iterates over the left side
		int j = 0  ; // Iterates over the right side
		int k = 0  ; // Iterates over the result

		while( k < result.length){

			while( left!= null && i < left.length){
				result[ k ] = left[ i ] ;
				k++ ;
				i++ ;
			}
			result[k] = pivot ;
			k++ ;

			while( right != null && j < right.length){
				result[ k ] = right[ j ] ;
				j++ ;
				k++ ;
			}
		}

		return result ;
	}

	/**
	 * This method partitions the array from index p to r into two parts
	 * such that the left side consists of all elements <= x and 
	 * right side consist of all elements > x
	 * where x is the pivot element. 
	 * @param a
	 * @param p
	 * @param r
	 * @return
	 */
	private static int partition( int p, int r) {

		int x = A[r] ;
		int i = p -1 ;
		int j = i +1 ;
		int temp ;

		while( A[j] < x){
			i = i + 1 ;
			// Swap A[i] & A[j]
			temp = A[i] ;
			A[i] = A[j] ;
			A[j] = temp ;
			j++ ;
		}
		// Finally swap A[i+1] with x i.e. A[r]
		temp = A[i+1] ;
		A[i+1] = A[r] ;
		A[r] = temp ;
		return (i+1); // index of the pivot
	}

	private static void print( int[] arr ) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

}
