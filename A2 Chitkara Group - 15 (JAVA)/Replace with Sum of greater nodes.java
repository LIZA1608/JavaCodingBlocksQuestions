

import java.util.*;
public class Main {
     static class Node{
    Node left;
    Node right;
    int data;
    Node(int k){
        data=k;
        left=null;
        right=null;
    }
}
    static int sum =0;
   static  void sum(Node root){
        if(root==null){
            return;
        }
        sum(root.left);
        sum+=root.data;
        sum(root.right);
    }
    static void modify(Node root){
        if(root==null){
            return;
        }
        modify(root.left);
        int temp=root.data;
        root.data=sum;
        sum-=temp;
        modify(root.right);
    }
    static Node helper(int nums[],int start,int end){
      if(start>end){
            return null;
        }   
        int mid=start+(end-start)/2;
        Node leftans=helper(nums,start,mid-1);
        Node root=new Node(nums[mid]);
        Node rightans=helper(nums,mid+1,end);
        root.left=leftans;
        root.right=rightans;
        return root;
    }
    static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           int x=sc.nextInt();
           arr[i]=x;
       }
      Node root=helper(arr,0,arr.length-1);
      sum(root);
      modify(root);
      preorder(root);     
    }
}
