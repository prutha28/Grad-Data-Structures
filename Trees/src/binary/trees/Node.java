package binary.trees;

public class Node {

	int data ;
	Node left ;
	Node right ;
	
	public Node(){
		this(-1) ;
	}
	
	public Node( int data){
		this.data = data ;
		this.left = null ;
		this.right = null ;
	}
}
