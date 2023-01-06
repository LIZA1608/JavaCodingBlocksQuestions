import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);
	static int sum=0;
	
	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		System.out.println(bt.sumOfNodes());
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

		public int sumOfNodes() {
			sumOfNodes(this.root) ;
			return sum;
		}
		
		private void sumOfNodes(Node node) {
			
			// write your code here
			if(node==null){
				return;
			}
			sumOfNodes(node.left);
			sum+=node.data;
			sumOfNodes(node.right);
			
		}
	}
}
