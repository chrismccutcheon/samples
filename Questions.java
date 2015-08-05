import java.util.Stack; // For question 2
import java.util.Queue; // For question 3
import java.util.LinkedList; // For question 3 
public class Questions {
	public static void main(String[] args){
		
	}
	// the pairs question
	public void pairNodes(BinaryTree node){
		if(node.left != null && node.right != null){
			pairNodes(node.left);
			pairNodes(node.right);
		}
		else{
			System.out.println("No pairs possible");
		}
	}
	public Object findLeaves(BinaryTree node){
		if(node.left != null){
			findLeaves(node.left);
		}
		if(node.right != null){
			findLeaves(node.right);
		}
		return node.value;
	}
	
	
	// Inorder question

	public void inorder(BinaryTree treenode, Stack <Object> TreeStack){
		if(treenode == null){
			return;
		}
		if(treenode.left == null){
			inorder(treenode, TreeStack);
			TreeStack.push(treenode.value);
		}
		TreeStack.push(treenode.value);
		if(treenode.right == null){
			inorder(treenode, TreeStack);
			TreeStack.push(treenode.value);
		}
	}
	
	// Find nodes a certain dist from a selected node
	public void distNodes(BinaryTree root, Object source, int dist){
		Queue <BinaryTree> levels = new LinkedList<BinaryTree>();
		levels.add(root);
		int depthnode = 0;
		int depthcount = 0;
		BinaryTree cur = root;
		while(!levels.isEmpty()){
			depthcount++;
			cur = levels.remove();
			if (cur.value == source) {
				depthnode = depthcount;
				finddistNodes(root, source, dist, depthnode);
				break;
			}
			if(cur.left != null){
				levels.add(cur.left);
			}
			if(cur.right != null){
				levels.add(cur.right);
			}
		}
	}
	public void finddistNodes(BinaryTree root, Object source, int dist, int depthnode){
		Queue <BinaryTree> levels = new LinkedList<BinaryTree>();
		if (dist > depthnode){
			
		}
		else if (dist < depthnode)
		{
			
		}
		else{
			
		}
		levels.add(root);
		int depthcount = 0;
		BinaryTree cur = root;
		while(!levels.isEmpty()){
			depthcount++;
			cur = levels.remove();
			if(cur.left == null){
				levels.add(cur.left);
			}
			if(cur.right == null){
				levels.add(cur.right);
			}
		}
	}
	
	// Problem 4 finding the path of a tree without using recursion
	public void findpathnorecursion(BinaryTree treenode, Stack <Object> TreeStack, Object pathNode){
		linkedList reverseTree = new linkedList();
		Stack <BinaryTree> BFS = new Stack<BinaryTree>();
		if(treenode == null){
			return;
		}
		BFS.push(treenode);
		reverseTree.insertfirst(treenode.value);
		linkedList chosen = reverseTree.first;
		while(!BFS.isEmpty()){
			BinaryTree node = BFS.pop();
			// need to change the chosen node for the backwards tree
			if(node.left != null){
				BFS.push(node.left);
				reverseTree.insertchosenplace(node.value, chosen);
				if(node.value == pathNode){
					break;
				}
			}
			if(node.right != null){
				BFS.push(node.right);
				reverseTree.insertchosenplace(node.value, chosen);
				if(node.value == pathNode){
					break;
				}
			}
		}
	}
	
	// problem 5 given bst tree find two nodes that add together to make a number in O(n)
	void sumnodes (BinaryTree root, int sum){
		if(root == null){
			return;
		}
		BinaryTree low;
		BinaryTree high;
		if(root)
	}
}
