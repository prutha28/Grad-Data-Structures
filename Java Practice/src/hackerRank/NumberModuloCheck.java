package hackerRank;

public class NumberModuloCheck {

	static int a, b, c, d ;

	
	public static void main(String[] args) {

		a = 1 ;
		b = 19 ;
		c = 2 ; 
		d = 24 ;
		check() ;
	}

	private static void check() {
	
		if( b == 0 || a == 0){
			System.out.println("No");
			return ;
		}
		if((((c-a) % b) == 0) ||  
			(((d-b) % a) == 0)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	
	

}
