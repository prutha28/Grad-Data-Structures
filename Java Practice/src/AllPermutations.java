//import java.util.HashSet;
//import java.util.Set;
//
//
//public class AllPermutations {
//
//	public static void main(String[] args) {
//
//		
//	}
//
//	
//	public static Set<String> generatePerms( String s){
//		
//		int n = s.length() ;
//		Set<String> result = new HashSet<String>() ;
//		
//		if( n <= 0 ){
//			return null ;
//		}
//		
//		if(  n == 1){
//			result.add(s) ;
//			return result ;
//		}
//		
//		if( n == 2){
//			result.add(s.substring(0, 1).concat(s.substring(1))) ;
//			result.add(s.substring(1).concat(s.substring(0,1))) ;
//			return result ;
//		}
//		
//		if( n >= 3 ){
//			int mid = n /2 ;
////			result.add(s.substring(0, mid).concat(s.substring(mid, mid+1)).concat(s.substring(mid+1))) ;
////			result.add(s.substring(0, mid).concat(s.substring(mid, mid+1)).concat()) ;
//			return result ;
//		}
//		
//	}
//}
