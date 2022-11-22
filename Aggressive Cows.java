import java.util.*;
public class Main {
  
  public static boolean isPossible(int a[],int n,int k,int mid){
    int Cowcount=1;
    int Lastpos=a[0];
    for(int i=0;i<n;i++){
     if(a[i]-Lastpos>=mid){
       Cowcount++;
       if(Cowcount==k){
         return true;
       }
       Lastpos=a[i];
     }
    }
    return false;
  }
  public static int Aggersive(int a[],int n,int k){
  int start=0;
  int maxi=-1;
  for(int i=0;i<n;i++){
    maxi=Math.max(maxi,a[i]);
  }
  int end=maxi;
  int mid=start+(end-start)/2;
  int ans=1;
  while(start<=end){
    if(isPossible(a,n,k,mid)){
      ans=mid;
      start=mid+1;
    }
    else{
      end=mid-1;
    }
    mid=start+(end-start)/2;
  }
  return ans;
  }
  
  
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int  n=sc.nextInt();
  int k=sc.nextInt();
  int []a=new int[n];
  for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
  }
  Arrays.sort(a);
  System.out.println(Aggersive(a,n,k));
}
}
