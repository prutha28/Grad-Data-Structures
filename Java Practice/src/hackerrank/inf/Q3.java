package hackerrank.inf;

public class Q3 {

	public static void main(String[] args) {
		//		int A[] = { 1, 2,3 ,4, 5, 6} ;
//		int A[] = { 1, 2,3 ,4, 5, 6, 7, 8, 9, 10} ;
		int A[] = { 1 } ;
		System.out.println(plusMult(A) );
	}


	static String plusMult(int[] A) {

		int n = A.length ;
		int Re_limit = 0 ;
		int Ro_limit = 0 ;

		if( n %2 == 0){
			// Length of the array is even
			Re_limit = n - 2 ; 
			Ro_limit = n - 1 ;
		}else{
			// Length of the array is odd
			Re_limit = n - 1 ; 
			Ro_limit = n - 2 ;
		}

		int i = 0 ; // Iterates over even indices
		int Re = A[0] ;

		while( i <= Re_limit-4 ){
			i = i + 2 ;
			Re = ( Re * A[i]) ;
			i = i + 2 ;
			Re = ((Re) + A[i]) ;
		}
		Re = Re % 2 ;
		int Ro = 0 ;
        if( n >1){
            int j = 1 ; // Iterates over odd indices
    		Ro = A[1] ;

            while( j+4 <= Ro_limit){
                j = j + 2 ;
                Ro = ( Ro * A[j]) ;
                j = j + 2 ;
                Ro = ((Ro) + A[j]) ;  
            }
        }
        Ro = Ro % 2 ;

		if( Re == Ro ){
			return "NEUTRAL" ;
		}
		else if( Re > Ro){
			return "EVEN" ;
		}else //if( Re < Ro){
			return "ODD" ;

	}
}
