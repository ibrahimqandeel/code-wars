package code.war.datastructure;

public class BinarySearchTree {

	public BinarySearchTree(int rootNodeValue) {
		this.rootNode = new TreeNode(rootNodeValue, null, null);
	}

	private TreeNode rootNode;

	public void insert(int value) {
		rootNode = insert(this.rootNode, value);
	}

	private TreeNode insert(TreeNode node, int value) {
		if (node == null) {
			node = new TreeNode(value, null, null);
		} else if (node.value >= value) {
			node.leftNode = insert(node.leftNode, value);
		} else if (node.value < value) {
			node.rightNode = insert(node.rightNode, value);
		}

		return node;
	}

	public TreeNode find(int value) {
		return find(rootNode, value);
	}

	private TreeNode find(TreeNode node, int value) {
		if (node == null || node.value == value) {
			return node;
		} else if (node.value > value) {
			return find(node.leftNode, value);
		} else if (node.value <= value) {
			return find(node.rightNode, value);
		}
		return null;
	}

	public TreeNode getRootNode() {
		return rootNode;
	}
}
