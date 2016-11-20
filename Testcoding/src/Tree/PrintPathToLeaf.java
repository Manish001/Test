/**
 @author chauhan.manish
 * @Date   05-Aug-2016
 * @Package Name Tree
 * @Project Testcoding
 */
package Tree;

/**
 *@author chauhan.manish
 * @FileName PrintPathToLeaf.java
 * @Time 7:42:48 AM
 */
public class PrintPathToLeaf {

	
	public static void printPath(TreeNode node){
		if(node.getLeft() == null && node.getRight() == null)
			System.out.println(node.getData());
		else if(node.getLeft() != null)
			    printPath(node.getLeft());
		else if (node.getRight() != null)
				printPath(node.getRight());
		} 
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
