/**
 @author chauhan.manish
 * @Date   18-Jul-2016
 * @Package Name Tree
 * @Project Testcoding
 */
package Tree;

/**
 *@author chauhan.manish
 * @FileName MakeTree.java
 * @Time 10:24:25 PM
 */
public class MakeTree {

	/**
	 * @param args
	 */
	
	TreeNode root;
	public MakeTree(){
	}

	public static void main(String[] args) {

		MakeTree mk = new MakeTree();
		int arr[] = {10,5,15,4,6,14,16};
		
		for ( int i = 0; i < arr.length; i++)
			//mk.root = mk.nodeInsert1(mk.root,arr[i]);
			mk.root = mk.recursiveInsert(mk.root,arr[i]);
		System.out.println("---------------------------------------------");
		Traversal.preOrder(mk.root);
		System.out.println("---------------------------------------------");
		Traversal.inOrder(mk.root);
		System.out.println("---------------------------------------------");
		Traversal.postOrder(mk.root);
		System.out.println("---------------------------------------------");
		PrintPathToLeaf.printPath(mk.root);
	}

	public  void addNode(int a){
		if(root == null){
			root = new TreeNode(a);
			return ;
		}
		
		else{
			TreeNode node = root ;

			while(node != null){
				if(node.getData() >= a)
					if(node.getLeft() != null) 
						node=node.getLeft();
					else{
						node.setLeft(new TreeNode(a));
						break;
					}

				else
					if(node.getRight() != null)
						node =  node.getRight();
					else{
						node.setRight(new TreeNode(a));
						break;
					}
			}
		}
	}
	
	
	public TreeNode nodeInsert(TreeNode root,int a){
		TreeNode node = root , node1 = root;
		if(node == null){
			node = new TreeNode(a);
			return node;
		}
		while(node != null){
			if(node.getData() >= a)
				if(node.getLeft() != null) 
					node=node.getLeft();
				else{
					node.setLeft(new TreeNode(a));
					break;
				}

			else
				if(node.getRight() != null)
					node =  node.getRight();
				else{
					node.setRight(new TreeNode(a));
					break;
				}
		}
		return node1;
	}
	
	public TreeNode nodeInsert1(TreeNode root,int a){
		
		TreeNode node = root , node1 = root, node2 = null;
		int flag=0;
		if(node == null){
			node = new TreeNode(a);
			return node;
		}
		
		while(node != null){
			node2 =  node;
			if(node.getData() >= a){
					node=node.getLeft();
			flag = 1;
			}
			else{
					node =  node.getRight();
					flag = 2;
			}
		}
		if(flag ==1)
		node2.setLeft(new TreeNode(a));
		else if ( flag == 2)
		node2.setRight(new TreeNode(a));
		return node1;
	}
	
	public TreeNode recursiveInsert(TreeNode root, int a){
		if(root == null){
		      root = new TreeNode(a);
		    }
		    else{
		      TreeNode node = root ;

		      while(node != null){
		        if(node.getData() >= a)
		          if(node.getLeft() != null) 
		            node=node.getLeft();
		          else{
		            node.setLeft(new TreeNode(a));
		            break;
		          }

		        else
		          if(node.getRight() != null)
		            node =  node.getRight();
		          else{
		            node.setRight(new TreeNode(a));
		            break;
		          }
		      }
           }
		return root;
	}
	
}
