package com.bridgelabz.bstuc2;

public class BinaryTree {

	int size = 0;
	public Node createNewNode(int data) {
		Node node = new Node(data);
		  size += 1;
		return node;
	}

	public Node insert(Node node, int data) {
		if(node == null) {
			node = createNewNode(data);
		}
		if(data < node.data) {
			node.left = insert(node.left,data);
		}
		else if(data > node.data){
			node.right = insert(node.right,data);
		}
		return node;
	}
	
	public void showInOrder(Node node) {
			if(node ==null) {
				return;
			}
			showInOrder(node.left);
			System.out.print(node.data+" ->");
			showInOrder(node.right);
	}
	

    public int size() {
        return size;
    }
	
	 public static void main(String[] args) {
	        BinaryTree tree = new BinaryTree();
	        Node root = null;
	        root = tree.insert(root, 56);
	        root = tree.insert(root, 30);
	        root = tree.insert(root, 70);
	        root = tree.insert(root, 22);
	        root = tree.insert(root, 40);
	        root = tree.insert(root, 60);
	        root = tree.insert(root, 95);
	        root = tree.insert(root, 11);
	        root = tree.insert(root, 65);
	        root = tree.insert(root, 3);
	        root = tree.insert(root, 16);
	        root = tree.insert(root, 63);
	        root = tree.insert(root, 67);

	        tree.showInOrder(root);
	        System.out.println();
	        System.out.println("Number of Nodes in binary tree :" + tree.size());


	    }
}
