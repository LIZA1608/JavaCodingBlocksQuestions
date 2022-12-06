

import java.util.*;

public class Main {
    public static int[] nextGrt(int[] arr,int n){
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];

        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                int x = st.pop();
                nge[x] = arr[i];
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            int x = st.pop();
            nge[x] = -1;
        }

        return nge;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int nge[] = nextGrt(arr,n);
        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + "," + nge[i]);
        }
        }
    }
}
