package hackerrank.zap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestingNumbers {

	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		//	        final String fileName = System.getenv("OUTPUT_PATH");
		//	        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		String res;
		int _a;
		_a = Integer.parseInt(in.nextLine());

		int _b;
		_b = Integer.parseInt(in.nextLine());

		int _c;
		_c = Integer.parseInt(in.nextLine());

		int _d;
		_d = Integer.parseInt(in.nextLine());

		res = isitpossible(_a, _b, _c, _d);
		System.out.println(res);
		//	        bw.write(res);
		//	        bw.newLine();

		//	        bw.close();
	}



	static String isitpossible(int a, int b, int c, int d) {
		if(check(a,b,c,d)){
			return("Yes") ;
		}else{
			return("No") ;
		}
	}

	static boolean check(int a, int b, int c, int d) {
		if( c == d){
			return false ;
		}

		while( (c >a || d >b) && ( c>0 && d>0)){
			if( c >= d){
				c = c-d ;
			}else{
				d = d-c ;
			}
		}
		if( c == a && d == b){
			return true ;
		}else{
			return false ;
		}
	}


}
