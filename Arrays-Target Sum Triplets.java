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
        Arrays.sort(a);
        int k;
        k=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int z=j+1;z<n;z++){
            if(a[i]+a[j]+a[z]==k){
                System.out.println(a[i]+", "+ a[j]+" and "+a[z]);
            }
        }
            }
        }
    }
}
