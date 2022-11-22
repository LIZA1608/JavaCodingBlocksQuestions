import java.util.*;
public class Main {
  public static boolean isPossible(int a[],int n,int k,int mid){
    int paintercount=1;
    int boardcount=0;
    for(int i=0;i<n;i++){
      if(boardcount+a[i]<=mid){
        boardcount+=a[i];
      }
      else{
        paintercount++;
        if(paintercount>k || a[i]>mid){
          return false;
        }
      boardcount=a[i];
    }
    }
    return true;
  }
  public static int Painter(int a[],int n,int k){
    int total=0;
    for(int i=0;i<n;i++){
      total+=a[i];
    }
    int start=0;
    int end=total;
    int mid=start+(end-start)/2;
    int ans=-1;
    while(start<=end){
      for(int i=0;i<n;i++){
        if(isPossible(a,n,k,mid)){
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
  int  k,n;
  k=sc.nextInt();
  n=sc.nextInt();
  int []a=new int[n];
  for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
  }
  System.out.print(Painter(a,n,k));
}
}

