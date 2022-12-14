
import java.util.*;
class Pair{
	int height;
	boolean isbalanced;
}
public class Main {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		System.out.println(bt.isBalanced());
	}
	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}
		private Node root;
		private int size;
		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}
		public Node takeInput(Node parent, boolean ilc) {
			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;
			// left
			boolean hlc = scn.nextBoolean();
			if (hlc) {
				child.left = this.takeInput(child, true);
			}
			// right
			boolean hrc = scn.nextBoolean();
			if (hrc) {
				child.right = this.takeInput(child, false);
			}
			// return
			return child;
		}
		public boolean isBalanced() {
			return this.isBalanced(this.root).isbalanced;
		}
		private Pair isBalanced(Node node) {
			// write your code here
            if(node==null){
				Pair p=new Pair();
				p.height=0;
				p.isbalanced=true;
				return p;
			}
		Pair left=isBalanced(node.left);
		Pair right=isBalanced(node.right);
		boolean c1=left.isbalanced;
        boolean c2=right.isbalanced;
        boolean c3=Math.abs(left.height-right.height)<=1;
        Pair ans=new Pair();
        ans.height=Math.max(left.height,right.height)+1;
        if(c1==true && c2==true && c3==true){
            ans.isbalanced=true;
        }
        else{
            ans.isbalanced=false;
        }
        return ans;
		}
	}
}
