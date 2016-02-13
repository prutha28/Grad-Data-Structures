package hackerrank.zap;

import java.util.Scanner;

public class HalloweenCake {

	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int _arr_size = 0;
        _arr_size = Integer.parseInt(in.nextLine());
        int[] _arr = new int[_arr_size];
        int _arr_item;
        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
            _arr_item = Integer.parseInt(in.nextLine());
            _arr[_arr_i] = _arr_item;
        }
        
        max_Chocolates(_arr);
        
    }

	private static void max_Chocolates(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(calculateNumOfPieces(arr[i])) ;
		}
	}

	private static long calculateNumOfPieces(int numberOfCuts) {
		long pieces = (long)(Math.ceil((double)numberOfCuts/2) * Math.floor((double)numberOfCuts/2)) ;  
		return pieces ;
	}
	
	
}
