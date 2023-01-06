import java.util.*;
public class Main {
	
    static Scanner sc=new Scanner(System.in);
    static class Node{
        int data;
        Node left;
		Node right;
        Node(int data){
            this.data=data;
        }
        
    }
	
     static Node input(){
        int n=sc.nextInt();
        Node nn=new Node(n);
        if(sc.nextBoolean()==true){
            nn.left=input();
        }
        if(sc.nextBoolean()==true){
            nn.right=input();
        }
        return nn;
    }
    static Node findlca(Node root,int a,int b){
		if(root==null){
			return null;
		}
		if(root.data==a || root.data==b){
			return root;
		}
		Node left=findlca(root.left,a,b);
		Node right=findlca(root.right,a,b);
		if(left!=null && right!=null){
			// lca=root.data
			return root;
		}
		else if(left!=null){
			return left;
		}
		return right;
	}
    public static void main(String args[]) {
     
    Node root=input();
	int a=sc.nextInt();
	int b=sc.nextInt();
	Node x=findlca(root,a,b);
	System.out.print(x.data);
	
    

    }
}
