package hackerRank;

import java.util.Scanner;

public class AlternateLettersInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in) ;
		int T = sc.nextInt() ;
		sc.nextLine() ;
		int i = 0 ;
		String s[] = new String[T] ;
		while( i < T){
			s[i] = sc.nextLine() ;
			System.out.println(correct(s[i])) ;
			i++ ;
		}
	}

	public static int correct( String s){    

		int count = 0 ;
		for( int i = 0 ; i < s.length()-1; i++){
			if( s.charAt(i) == s.charAt(i+1))
				count++ ;
		}
		return count ;
	}

}
