

import java.util.*;
public class Main {
public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    int k = sc.nextInt();
    int n = sc.nextInt();
    int arr[][] = new int[k][n];
     PriorityQueue<Integer>q=new PriorityQueue<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<k;i++){
            for(int j=0;j<n;j++){
              q.add(sc.nextInt());
            }
        }
         for(int i=0;i<k*n;i++){
            list.add(q.poll());
        }
         for(int i=0;i<list.size();i++){
 	System.out.print(list.get(i)+" ");
 }
}
}
