public class bstpractice {
    public Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }
        Node current = root;
        Node parent = null;
        while (current != null) {
            parent = current;
            if (value < current.value) {
                current = current.left;
            } else if (value > current.value) {
                current = current.right;
            } else {
                return;
            }
        }
        Node newnode = new Node(value);
        if (value < parent.value) {
            parent.left = newnode;
        } else {
            parent.right = newnode;
        }
    }

    // right most position in a tree is max
    public int max() {
        Node maxele = root;
        while (maxele.right != null) {
            maxele = maxele.right;
        }
        return maxele.value;
    }

    // left most is the min value
    public int min() {
        Node maxele = root;
        while (maxele.left != null) {
            maxele = maxele.left;
        }
        return maxele.value;
    }

    public int getHeight(Node n) {
        if (n == null) {
            return 0;
        }
        int leftHeight = getHeight(n.left);
        int rightHeight = getHeight(n.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public void balance_tree(Node n) {
        if (n == null) {
            return;
        }
        int left_height = getHeight(n.left);
        int right_height = getHeight(n.right);
        if (left_height - right_height > 1) {
            System.out.println("Not balance tree");
        } else {
            System.out.println("balance tree");
        }
    }

    public boolean isBalanced(Node n1) {
        if (n1 == null) {
            return true;
        } else {
            int lheight = getHeight(n1.left);
            int rheight = getHeight(n1.right);
            if (Math.abs(lheight - rheight) > 1) {
                return false;
            }
        }
        return isBalanced(n1.left) && isBalanced(n1.right);
    }

    public Node deleteNode(int key, Node root) {
        if (root == null) {
            return root;
        } else if (key > root.value) {
            if (key < root.value) {
                root.left = deleteNode(root.left, key);
            } else if (key > root.value) {
                root.right = deleteNode(root.right, key);
            } else {
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }
                Node tmp = min(root.right);
                root.value = tmp.value;
                root.right = deleteNode(tmp.value, root.right);
            }
        }
    }
}
