package core;

public class Node {
	public int key;
	public Object val;
	public Node left;
	public Node right;
	
	
	public Node(int key, Object val) {
		this.key = key;
		this.val = val;
		left = right = null;
	}
}
