import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int []a=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k;
        k=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            if(a[i]+a[j]==k){
                if(a[i]<a[j])
                System.out.println(a[i]+" and "+ a[j]);
                else{
                   System.out.println(a[j]+" and "+ a[i]); 
                }
            }
        }
        }
    }
}
