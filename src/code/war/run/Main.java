package code.war.run;

import code.war.datastructure.BinarySearchTree;
import code.war.datastructure.TreeNode;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(
				"\n\t\t\t\t\t\t ***************** Welcome To Code Wars Challenges Project ***************** \n\n");

		BinarySearchTree bst = new BinarySearchTree(10);

		bst.insert(5);
//		bst.insert(20);
//		bst.insert(3);
//		bst.insert(21);
//		bst.insert(4);
//		bst.insert(2);
		
		System.out.println(bst.min().getValue());

		TreeNode myNode = bst.find(3);

		if (myNode != null) {
			System.out.println("Parent Node ===>" + myNode.getValue());
			if (myNode.getLeftNode() != null) {
				System.out.println("Left Node ===>" + myNode.getLeftNode().getValue());
			}
			if (myNode.getRightNode() != null) {
				System.out.println("Right Node ===>" + myNode.getRightNode().getValue());
			}
		} else {
			System.out.println("Not Found!");
		}

	}

}
