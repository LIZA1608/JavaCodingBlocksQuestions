import java.util.*;
public class Main {
    static int[] next_greater_element(int[] arr,int n){
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0;i<=(n-1);i++){
            int pos = i;
            while(st.empty()==false&&arr[pos]>=arr[st.peek()]){
                st.pop();
            }
            if(st.empty()){
                ans[pos] = pos + 1;
            }else{
                ans[pos] =pos - st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int[] result = next_greater_element(arr,n);
            for(int i=0;i<n;i++){
                System.out.print(result[i]);
                System.out.print(' ');
            }
            System.out.println();
            t--;
        }
    }
}
