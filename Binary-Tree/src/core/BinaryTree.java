package core;


public class BinaryTree {
	Node root;//root node
	
	//constructor for root node
	BinaryTree(int key, Object val) {
		//initiate root node
		root = new Node(key, val);
	}
	
	BinaryTree() {
		root = null;
	}
	
	public Node getRoot() {
		return root;
	}
	
	
	public boolean hasPathSum(Node node, int sum) {
		if(node == null) {
			return sum == 0;
		} else {
			return hasPathSum(node.left, sum - node.key)
			|| hasPathSum(node.right, sum - node.key);
		}
	}

	
}
