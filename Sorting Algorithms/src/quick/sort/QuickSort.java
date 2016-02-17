package quick.sort;

public class QuickSort {

	public static void main(String[] args) {

		int[] arr = { 23,3, 7, 99 , 111, 10000, 6 } ;
		print( arr ) ;
		qsort( arr, 0 , arr.length - 1) ;
		print( arr ) ;
	}

	private static int[] qsort( int[] A, int p, int r ) {
		
		if( p > r)
			return null ;
		
		int q = partition( A, p, r ) ;	// index of pivot
		int left[] = qsort( A, p, q-1) ;	
		int right[] = qsort(A, q+1, r) ;
		return concat( left, A[q], right) ;
	}

	private static int[] concat(int[] left, int pivot, int[] right) {
		int result[] = new int[ left.length + 1 + right.length ] ;

		int i = 0  ; // Iterates over the left side
		int j = 0  ; // Iterates over the right side
		int k = 0  ; // Iterates over the result
		
		while( k < result.length){
			
			while( i < left.length){
				result[ k ] = left[ i ] ;
				k++ ;
				i++ ;
			}
			result[k] = pivot ;
			k++ ;
			
			while( j < left.length){
				result[ k ] = left[ j ] ;
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
	private static int partition(int[] A, int p, int r) {
		
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
		// Finally swap A[i+1] with x
		temp = A[i+1] ;
		A[i+1] = x ;
		x = temp ;
		return (i+1); // index of the pivot
	}

	private static void print( int[] arr ) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

}
