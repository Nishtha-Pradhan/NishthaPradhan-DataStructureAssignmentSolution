/**
 * 
 */
package assignment.q2.models;

/**
 * @author nishthapradhan
 *
 */
public class Node {
	public int val;
	public Node left;
	public Node right;

	public Node(int val) {
		this.val = val;
		left = right = null;
	}
}
