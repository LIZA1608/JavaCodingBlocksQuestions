import java.util.*;
public class Main {
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t>0){
         int n=sc.nextInt();
         int k=sc.nextInt();
         int a[]=new int [n];
         for(int i=0;i<n;i++){
             a[i]=sc.nextInt();
         }
      
      int ai=0,b,c=0;
      int []ans=new int [n-k+1];
    while(ai<=n-k){
            int m=k;
            b=ai;
            while(m>0){
                if(a[b]<0){
                    ans[c]=a[b];
                    c++;
                    break;
                }
                b++;
                m--;
                if(m==0){
                    ans[c]=0;
                    c++;
                }
            }
            ai++;
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
         t--;
     }
    }
}
