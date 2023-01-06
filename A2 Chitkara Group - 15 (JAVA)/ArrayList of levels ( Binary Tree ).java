import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt1 = m.new BinaryTree();
		System.out.println(bt1.levelArrayList());
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

		public ArrayList<ArrayList<Integer>> levelArrayList() {

			// write your code here
				Queue<Node>q=new LinkedList<>();
				ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
				q.add(root);
				while(!q.isEmpty()){
					int size=q.size();
					ArrayList<Integer>temp=new ArrayList<>();
					for(int i=0;i<size;i++){
						Node front=q.peek();
						q.remove();
						temp.add(front.data);
						if(front.left!=null){
							q.add(front.left);

						}
						if(front.right!=null){
							q.add(front.right);
						}
					}
					ans.add(temp);

				}
				return ans;
		}

	}

}
