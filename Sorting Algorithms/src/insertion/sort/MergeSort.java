package insertion.sort;

public class MergeSort {

//	static String[] arr = { "mary", "john", "jane" , "ana" , "peter", "heena", "cristina" , "nathan", "meredith", "Derek" }; 
	
	static int[] arr = { 45, 87, 2, 1, 34, -1, 9, 2, 65 } ;
	
	public static void main(String[] args) {
		
		System.out.println("Contents before sorting");
		print() ;
		
		System.out.println("Contents after sorting");
		mergesort( arr, 0, arr.length -1 ) ;
		print() ;
	}

	
	private static int[] mergesort( int[] arr, int begin, int end ) {

		int[] left ; 
		int[] right ;
		int[] result = null ;
		
		// BASE case
		if( begin > end)
			return null ;
		
		int mid = ( end - begin) /2 + begin /2 ;
		
		left = mergesort(arr, begin, mid) ;
		right = mergesort(arr, mid + 1 , end) ;
//		result = merge( left, right ) ;
		return result ;
	}


	private static int[] merge(int[] left, int[] right) {
		
		int result[] = null ;
		int i = 0 ; 
		int j = 0 ;
		int k = 0 ;
		
		while( i < left.length) {
			
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
