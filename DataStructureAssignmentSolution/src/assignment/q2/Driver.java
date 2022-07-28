/**
 * Convert BST into a skewed tree.
 */

package assignment.q2;

import assignment.q2.models.Node;

/**
 * @author nishthapradhan
 *
 */


public class Driver {
	Node node;
	Node prev = null;
	Node newHead = null;

	void processBST(Node root) {
		if (root == null)
			return;
		// Loop till left leaf
		processBST(root.left);
		Node rightNode = root.right;
		Node leftNode = root.left;
		// Update new head to hold new root
		if (newHead == null) {
			newHead = root;
			root.left = null;
			prev = root;
		} 
		else {
			// Update the right of predecessor and also the predecessor to accommodate next node
			prev.right = root;
			root.left = null;
			prev = root;
		}
		processBST(rightNode);
	}

	void traverse(Node root) {
		// Traverse till leaf
		if (root == null)
			return;
		System.out.print(root.val + " ");
		traverse(root.right);
	}

	public static void main(String[] args) {
		// Given values to test
		Driver tree = new Driver();
		System.out.println("The input for BST is: [50, 30, 60, 10, 55]");
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);
		// Method to transform BST to skewed tree
		tree.processBST(tree.node);
		// Method to print the skewed tree
		System.out.println("\nThe converted skewed tree is: ");
		tree.traverse(tree.newHead);
	}
}
