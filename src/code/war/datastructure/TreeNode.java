package code.war.datastructure;

public final class TreeNode {
	int value;
	TreeNode leftNode;
	TreeNode rightNode;

	TreeNode(int value, TreeNode leftNode, TreeNode rightNode) {
		this.value = value;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}

	public int getValue() {
		return value;
	}

	public TreeNode getLeftNode() {
		return leftNode;
	}

	public TreeNode getRightNode() {
		return rightNode;
	}
}
