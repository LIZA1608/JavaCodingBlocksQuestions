import java.util.*;
public class Main {
    public static int compare(String s1,String s2){
String s1s2=s1+s2;
String s2s1=s2+s1;
long  a=Long.parseLong(s1s2);
long  b=Long.parseLong(s2s1);
if(a-b>0){
    return 1;
}
return -1;
    }
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int t =sc.nextInt();
       while(t>0){
       int n=sc.nextInt();
       String arr[]=new String[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt()+"";
       }
       for(int i=0;i<n;i++){
           for(int j=0;j<n-1;j++){
               int ans=compare(arr[j],arr[j+1]);
               if(ans<0){
String temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
               }
              
           }
       }
       for(String val:arr){
           System.out.print(val);
       }   
       System.out.println();
         t--;
       }

}
}


