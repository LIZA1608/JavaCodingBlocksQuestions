import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.*;

class Main {
	static ArrayList<Integer>a=new ArrayList<>();
	static class BinaryTreeFromLvlOrder {

		 Scanner s = new Scanner(System.in);

		 class Node {
			int val;
			Node left;
			Node right;

			public Node(int val) {
				this.val = val;
			}
		}

		 Node root;

		public BinaryTreeFromLvlOrder() {
			// TODO Auto-generated constructor stub
			root = construct();// 2k
		}

		public Node construct() {
			// TODO Auto-generated method stub

			int val = s.nextInt();
			Node nn = new Node(val);
			Queue<Node> lvl = new LinkedList<>();
			lvl.add(nn);

			while (!lvl.isEmpty()) {
				Node front = lvl.remove();
				int a = s.nextInt();
				int b = s.nextInt();

				if (a != -1) {
					Node na = new Node(a);
					front.left = na;
					lvl.add(na);
				}

				if (b != -1) {
					Node nb = new Node(b);
					front.right = nb;
					lvl.add(nb);
				}
			}
			return nn;// 2k
		}
		

		//Write your function here
		boolean solve(Node node1,Node node2){
		 if (node1 == null && node2 == null)
            return true;
		 if (node1 != null && node2 != null && node1.val == node2.val)
            return (solve(node1.left, node2.right)&& solve(node1.right, node2.left));
        return false;
	}
    }
    
	public static void main(String[] args) {
		BinaryTreeFromLvlOrder bt = new BinaryTreeFromLvlOrder();
		boolean c=bt.solve(bt.root,bt.root);
        if(c==true){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
	}
}
