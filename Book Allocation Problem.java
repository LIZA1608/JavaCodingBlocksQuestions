import java.util.*;
 public class Main
 {
     static boolean isPossible(int a[],int n,int m,int mid){
         int studentcount=1;
         int pagecount=0;
         for(int i=0;i<n;i++){
             if(pagecount+a[i]<=mid){
                 pagecount+=a[i];
             }
             else{
                 studentcount++;
                 if(studentcount>m || a[i]>mid){
                     return false;
                 }
                 pagecount=a[i];
             }
         }
         return true;
     }
     
     static int Allocate(int a[],int n,int m){
         int total=0;
         for(int i=0;i<n;i++){
             total+=a[i];
         }
         int start=0;
         int end=total;
         int mid=start+(end-total)/2;
         int ans=-1;
         while(start<=end){
             for(int i=0;i<n;i++){
                 if(isPossible(a,n,m,mid)){
                     ans=mid;
                     end=mid-1;
                 }
                 else{
                     start=mid+1;
                 }
                 mid=start+(end-start)/2;
             }
         }
         return ans;
     }
     public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
             int t;
             t=sc.nextInt();
             for(int p=1;p<=t;p++){
                 int n,m;
                 n=sc.nextInt();
                 m=sc.nextInt();
                 int []a=new int [n];
                 for(int i=0;i<n;i++){
                     a[i]=sc.nextInt();
                 }
                 System.out.println(Allocate(a,n,m));
             }
         
     }
 }
