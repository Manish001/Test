/**
 @author chauhan.manish
 * @Date   18-Jul-2016
 * @Package Name Tree
 * @Project Testcoding
 */
package Tree;

/**
 *@author chauhan.manish
 * @FileName TreeNode.java
 * @Time 10:21:03 PM
 */
public class TreeNode {

	private int data;
	private TreeNode left;
	private TreeNode right;
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}
	/**
	 * @return the left
	 */
	public TreeNode getLeft() {
		return left;
	}
	/**
	 * @param left the left to set
	 */
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	/**
	 * @return the right
	 */
	public TreeNode getRight() {
		return right;
	}
	/**
	 * @param right the right to set
	 */
	public void setRight(TreeNode right) {
		this.right = right;
	}
	/**
	 * @param data
	 * @param left
	 * @param right
	 */
	public TreeNode(int data, TreeNode left, TreeNode right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public TreeNode(int data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null;
	}
	/**
	 * 
	 */
	public TreeNode() {
		super();
	}
	
}
