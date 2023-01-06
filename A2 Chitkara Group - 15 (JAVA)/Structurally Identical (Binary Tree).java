


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
    static boolean identical(Node root1,Node root2){
       if(root1==null && root2==null){
		   return true;
	   }
	   else if(root1==null || root2==null){
		   return false;
	   }
	   
	
	   return identical(root1.left,root2.left) && identical(root1.right,root2.right);

	}
	
    public static void main(String args[]) {
     
    Node root1=input();
	Node root2=input();
	System.out.print(identical(root1,root2));
	
    }
}
