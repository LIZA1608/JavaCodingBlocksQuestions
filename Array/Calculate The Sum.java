import java.util.*;
public class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int mod=1000000007;
int n;
n=sc.nextInt();
int y;
int sum=0;
for(int i=0;i<n;i++){
y=sc.nextInt();
sum+=y;
sum%=mod;
}
int ts=sum;
int q;
q=sc.nextInt();
for(int i=0;i<q;i++){
int x;
x=sc.nextInt();
sum+=ts;
ts=sum;
sum%=mod;
}
System.out.println(sum%mod);
}
}
