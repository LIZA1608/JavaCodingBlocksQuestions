

import java.util.*;
public class Main {
    public static int findklargest(int arr[],int k,int n){
        PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<n;i++){
            if(arr[i]>pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        int ans=pq.peek();
        return ans;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
              arr[i]=sc.nextInt();
        }
        int ans=findklargest(arr,k,n);
        System.out.print(ans);
    }
