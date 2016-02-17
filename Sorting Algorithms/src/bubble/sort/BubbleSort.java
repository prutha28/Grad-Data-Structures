package bubble.sort;

public class BubbleSort {

	static int[] arr = { 23,3, 7, 99 , 111, 10000, 6 } ;

	public static void main(String[] args) {

		print() ;
		sort() ;
		print() ;
	}

	private static void sort() {

		for (int i = 0; i < arr.length -1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if( arr[i] > arr[j]){
					int temp = arr[i] ;
					arr[i] = arr[j] ;
					arr[j] = temp ;
				}
			}
			System.out.println("---------------------------------");
			System.out.println("i = " + i );
			print() ;
		}
	}

	private static void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}


}

