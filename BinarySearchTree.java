class Node {
	Node left, right;
	public int data;
	public int value;

	public Node(int data) {
		this.data = data;
		this.left = this.right = null;
	}
}

public class BinarySearchTree {
	private static Node root;
	private int data;
	public BinarySearchTree leftChild, rightChild;

	public BinarySearchTree(int value) {
		this.data = value;
		root = null;
		this.leftChild = null;
		this.rightChild = null;
	}

	void insert(int data) {
		root = insertRecursive(root, data);

	}

	Node insertRecursive(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}
		if (data < root.data) {
			root.left = insertRecursive(root.left, data);
		} else if (data > root.data) {
			root.right = insertRecursive(root.right, data);
		}
		return root;
	}

	void preorder(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preorder(root.left);
			preorder(root.right);
		}
	}

	static void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.println(root.data + " ");
			inorder(root.right);
		}
	}

	static void postorder(Node root) {
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.data + " ");
		}
	}

	public boolean search(int data, BinarySearchTree current) {
		if (current == null) {
			return false;
		}
		if (current.data == data) {
			return true;
		} else {
			if (data < current.data) {
				return search(data, current.leftChild);
			} else {
				return search(data, current.rightChild);
			}
		}
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree(10);
		bst.insert(5);
		bst.insert(3);
		bst.insert(8);
		bst.insert(2);
		bst.insert(4);
		bst.insert(7);
		bst.insert(9);
		// bst.preorder(root);
		// System.out.println();
		inorder(root);
		System.out.println();
		// postorder(root);

		// preorder-5,3,2,4,8,7,9
	}

}
