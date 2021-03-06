package stacks.using.linked.lists;

public class StackTestClass {

	public static void main(String[] args) {

		IStack stack = new Stack() ;
		System.out.println("Initial Stack contents : ");
		stack.showContents() ;
		System.out.println("Start Pushing ...");
		stack.push(100) ;
		stack.push(11) ;
		stack.push(160) ;
		stack.push(90) ;
		stack.push(103) ;
		stack.push(83) ;
		stack.push(13) ;
		stack.push(19) ;
		stack.push(23) ;
		stack.push(17) ;
		stack.showContents() ;
		System.out.println("\nThe no of elements in the stack is " + stack.size());
		System.out.println("Pushing more...");
		stack.push(181) ;
		stack.push(11) ;
		stack.push(167) ;
		stack.showContents() ;
		System.out.println("\nThe no of elements in the stack is " + stack.size());
		System.out.println("The element at the top is " + stack.top());
		System.out.println("Popping " + stack.pop());
		System.out.println("Popping " + stack.pop());
		System.out.println("The no of elements in the stack is " + stack.size());
		System.out.println("The element at the top is now " + stack.top());
	}
}
