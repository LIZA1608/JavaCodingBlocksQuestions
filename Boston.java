import java.util.*;
public class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
   int n, sum=0, ts=0;  
    n=sc.nextInt();
    int temp=n;
    while(temp>0)
    {
        ts=ts+(temp%10);
        temp/=10;
    }
    while (n%2 == 0)
    {
        sum+=2;
        n = n/2;
    }
    for (int i = 3; i <=Math. sqrt(n); i = i+2)
    {
        while (n%i == 0)
        {
           int temp1=i;
            while(temp1>0)
    {
        sum=sum+(temp1%10);
        temp1/=10;
    }
            n = n/i;
       }
    }
    if (n > 2)
    {  while(n>0)
    {
        sum=sum+(n%10);
        n/=10;
    }}
    if(ts==sum)
        System.out.println("1");
    else
        System.out.println("0");
}
}
