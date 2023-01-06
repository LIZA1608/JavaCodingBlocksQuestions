

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
    static void findpath(Node root,ArrayList<Integer>temp,int sum,int a){
        if(root==null ){
           return;
        }
		  temp.add(root.data);
      	if(root.left==null && root.right==null && sum==a-root.data){
			  ArrayList<Integer>aa=temp;
			 for(int i=0;i<aa.size();i++){
                System.out.print(aa.get(i)+" ");
            }
            System.out.println();
            return;
		}
        findpath(root.left,temp,sum+root.data,a);
        findpath(root.right,temp,sum+root.data,a);
        temp.remove(temp.size()-1);
        return;
    }
    public static void main(String args[]) {
    Node root=input();
	int a=sc.nextInt();
    ArrayList<Integer>temp=new ArrayList<>();
    findpath(root,temp,0,a);	
 }
}
