package string.operations.using.stacks;

import fixed.size.stacks.of.strings.Stack;

public class StringReversal {

	Stack wordStack = new Stack();

	public static void main(String[] args) {

		String word = "Prutha" ;
		StringReversal sr = new StringReversal() ;
		sr.pushWordOnStack( word) ;
		System.out.println("Printing String in reverse order ...");
		sr.printReversed( word ) ;
	}

	private void pushWordOnStack(String word) {
		for (int i = 0; i < word.length(); i++) {
			wordStack.push(word.charAt(i)) ;
		}
	}

	private void printReversed(String word) {
		System.out.println("Displaying elements ...");
		while( wordStack.size()!=0){
			System.out.print( wordStack.pop() + "  ");
		}
	}

}
