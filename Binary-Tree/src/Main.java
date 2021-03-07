import core.Controller;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller init = new Controller();
		init.Initiate_BinaryTree();
		System.out.println(init.tree.getRoot().val.toString());
		
		boolean checker = init.tree.hasPathSum(init.tree.getRoot(), 8);
		System.out.println("TEST = \t\t" + checker);
	}

}
