package com.bridgelabz.bstuc1;

public class BinaryTree {

	public Node createNewNode(int data) {
		Node node = new Node(data);
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
	
	public static void main(String args[])
	{
		BinaryTree tree = new BinaryTree();
		Node root = null;
		root = tree.insert(root, 56);
		root = tree.insert(root, 30);
		root = tree.insert(root, 70);
		
		tree.showInOrder(root);
	}
}
