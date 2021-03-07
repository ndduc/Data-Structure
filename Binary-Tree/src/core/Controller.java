package core;

public class Controller {
	public BinaryTree tree;
	public void Initiate_BinaryTree() {
		tree = new BinaryTree();
		
		tree.root = new Node(1,1);
		
		/*
		 * 			1
		 * 
		 * 		/		\
		 * 	   2		 1
		 *    / \		/ \
		 *   5   1     0   1
		 * */
		
		tree.root.left = new Node(2, 2);
		tree.root.right = new Node(1, 1);
		
		tree.root.left.left = new Node(5, 5);
		tree.root.left.right = new Node(1,1);
		
		tree.root.right.left = new Node(0,0);
		tree.root.right.right = new Node(1,1);
	}
	
	
}
