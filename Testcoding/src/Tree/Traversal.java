/**
 @author chauhan.manish
 * @Date   18-Jul-2016
 * @Package Name Tree
 * @Project Testcoding
 */
package Tree;

/**
 *@author chauhan.manish
 * @FileName Traversal.java
 * @Time 10:33:27 PM
 */
public class Traversal {

	public static void preOrder(TreeNode root){
		
		if(root != null){
			System.out.println(root.getData());
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}
	
	public static void inOrder(TreeNode root){
		if(root != null){
			inOrder(root.getLeft());
			System.out.println(root.getData());
			inOrder(root.getRight());
		}
	}
	
	public static void postOrder(TreeNode root){
		
		if(root != null){
			postOrder(root.getLeft());
			System.out.println(root.getData());
			postOrder(root.getRight());
		}
	}
}
