package binary.search.trees;

import binary.trees.Node;

public class BinarySearchTrees implements IBinarySearchTree {

	public Node insert(Node root, Node newNode) {
		
		if( newNode.data <= root.data){
			
		}
		search(root, newNode.data) ;
		
		return null;
	}

	public boolean search(Node root, int data) {

		if( root == null)
			return false ;

		if( root.data == data )
			return true ;

		else if( data < root.data)
			return search(root.left, data) ;

		else 
			return search(root.right, data) ;

	}

	public int delete(Node root, int data) {
		return 0;
	}
	
	
	public int size( Node root){
		
		if( root == null)
			return 0 ;
		
		return ( 1 + size( root.left) + size(root.right) );
	}
}
