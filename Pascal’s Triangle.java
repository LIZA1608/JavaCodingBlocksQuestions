import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
    for(int i=1;i<=n;i++){
        int z=1;
        for(int j=1;j<=i;j++){
            if(j==1){
            System.out.print(j+" ");
        }
        else{
            z=z*(i-j+1)/(j-1);
            System.out.print(z+" ");
        }
    }
       System.out.println();
    }
}
}
