import java.util.*;

public class Main {
    public static int MaxAtt(int[] arr){
		Stack<Integer>st1=new Stack<>();
		Stack<Integer>st2=new Stack<>();
		int n=arr.length;
		int []left=new int[n];
		int []right=new int[n];
		for(int i=0;i<n;i++){
			while(!st1.isEmpty() && arr[st1.peek()]>=arr[i]){
				st1.pop();
			}
			if(st1.isEmpty()){
				left[i]=-1;
			}
			else{
				left[i]=st1.peek();
			}
			st1.push(i);
		}
		for(int i=n-1;i>=0;i--){
			while(!st2.isEmpty() && arr[st2.peek()]>=arr[i]){
				st2.pop();
			} 
			if(st2.isEmpty()){
				right[i]=n;
			}
			else{
				right[i]=st2.peek();
			}
			st2.push(i);
		}
		int []width=new int[n];
		for(int i=0;i<n;i++){
			width[i]=right[i]-left[i]-1;
		}
		int ans=-1;
		for(int i=0;i<n;i++){
			ans=Math.max(ans,width[i]*arr[i]);
		}
		return ans;
	}
    public static int maximalAreaOfSubMatrixOfAll1(int[][] mat, int n, int m) {
		// Write your code here.
		int ans=Integer.MIN_VALUE;
		if(n==0){
			return 0;
		}
		int []temp=new int[m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(mat[i][j]==0){
					temp[j]=0;
				}
				else{
					temp[j]++;
				}
			}
			int tempMax=MaxAtt(temp);
			ans=Math.max(ans,tempMax);
		}
		return ans;
	}
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
          int ans=maximalAreaOfSubMatrixOfAll1(a,n,m);
System.out.print(ans);
        }
    }
