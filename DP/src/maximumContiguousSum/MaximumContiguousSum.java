package maximumContiguousSum;

public class MaximumContiguousSum {

	int arr[]  = { -1, 6, 5, -9, 8 , 2, -4 } ;
	int start  ;
	int end  ; 

	public static void main( String[] args){

		System.out.println(new MaximumContiguousSum().maxSum()) ;
	}

	public MaximumContiguousSum(){
		start = 0 ;
		end = 0 ;
	}

	//	public int maxSum( int i ){
	//		
	//		
	//		while( i < arr.length) {
	//			if( maxSum(i-1) + arr[i] >= arr[ i ]){
	//				end = i ;
	//				return (maxSum(i-1) + arr[i++]) ;
	//			}else{
	//				start = i ;
	//				end = i ;
	//				return arr[i++] ;
	//			}
	//		}
	//		
	//	}


	public int maxSum(){
		int i = 0 ;
		int sum = arr[0] ;
		while( i < arr.length-1) {
			if(sum + arr[i+1] >= arr[ i+1 ]){
				end = i ;
				sum =sum + arr[i+1] ;
			}else{
				start = i ;
				end = i ;
				sum = arr[ i + 1] ;
			}
			i++ ;
		}
		return sum ;
	}



}
