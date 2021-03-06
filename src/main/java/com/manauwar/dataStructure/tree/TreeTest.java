package com.manauwar.dataStructure.tree;

public class TreeTest {

	public static void main(String[] args) {

		Node root = new Node(12);
		BST tree = new BST(root);
		
			tree.insert(5);
			tree.insert(3);
			tree.insert(7);
			tree.insert(2);
			tree.insert(9);
			tree.insert(6);
			tree.insert(4);
			tree.insert(8);
			tree.insert(10);
	
		
		for(int i=13; i<=20;i++)
		{
			tree.insert(i);
		}
		
		tree.display(root);
		
		Height heignt = new Height();
		Integer heigntNode = heignt.getHeightOfNode(root, 1, 10);
		System.out.println("\nHeignt of node 10 is : "+heigntNode);
		
		Integer heigntTree = heignt.getHeightOfTree(root);
		System.out.println("\nHeignt of tree is : "+heigntTree);
		
		tree.levelOrderTraverdalUsingQueue(root);
		
		
		
		
	}

}
