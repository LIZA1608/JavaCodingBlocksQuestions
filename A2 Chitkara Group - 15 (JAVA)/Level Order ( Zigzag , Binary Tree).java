import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		bt.levelOrderZZ();
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

		public void levelOrderZZ() {
			// write your code here
			
        Queue<Node> q
            = new LinkedList<>();
			q.add(root);
			int flag=0;
			while(!q.isEmpty()){
				int size=q.size();
				ArrayList<Integer>a=new ArrayList<>();
                
					for(int i=0;i<size;i++){
					Node front=q.peek();
					a.add(front.data);
					q.remove();
					if(front.left!=null){
						q.add(front.left);
					}
					if(front.right!=null){
						q.add(front.right);
					}
					}
					if(flag==0){
						for(int i=0;i<a.size();i++){
							System.out.print(a.get(i)+" ");
						}
					}
					else{
						for(int i=a.size()-1;i>=0;i--){
							System.out.print(a.get(i)+" ");
						}
					}
					if(flag==0){
						flag=1;
					}
					else{
						flag=0;
					}
				}
			}
}
}
