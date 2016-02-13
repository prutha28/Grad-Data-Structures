package hackerrank.zap;

import java.util.Scanner;

public class MakingPalin {

	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int _letter_size = 0;
        _letter_size = Integer.parseInt(in.nextLine());
        String[] _letter = new String[_letter_size];
        String _letter_item;
        for(int _letter_i = 0; _letter_i < _letter_size; _letter_i++) {
            try {
                _letter_item = in.nextLine();
            } catch (Exception e) {
                _letter_item = null;
            }
            _letter[_letter_i] = _letter_item;
        }
        
        mystery(_letter);
        
    }
	
	static void mystery(String[] letter) {
        int start ;
        int end ;
        int count ;
        for( int k = 0 ; k < letter.length; k++){
        	start = 0 ;
        	end = letter[k].length() - 1 ;
            count = 0 ;
            while( start <= end ){
                count = count + Math.abs(letter[k].charAt(end) - letter[k].charAt(start)) ;
                start++ ;
                end-- ;
            }
            System.out.println(count) ;
        }
    }
	
	

}
