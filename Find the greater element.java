
import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        nextLarger(arr);

	}

	public static void nextLarger(int[] arr) {
		int n = arr.length;
		int ans_arr[] = new int[n];
		Stack<Integer> st = new Stack<>();
		st.push(-1);

		for(int i = n-1; i >= 0; i--){
			// if elem at i is smaller
			if(arr[i] < st.peek()){
				ans_arr[i] = st.peek();
			}
			else{
				while(!st.isEmpty() && st.peek() <= arr[i]){
					st.pop();
				}

				if(st.isEmpty()){
					ans_arr[i] = -1;
				}
				else{
					ans_arr[i] = st.peek();
				}
			}
			st.push(arr[i]);
		}

        for(int i=0; i<n; i++){
            if(ans_arr[i] == -1){
                for(int j=0; j<i; j++){
                    if(arr[j] > arr[i]){
                        ans_arr[i] = arr[j];
                        break;
                    }
                }
            }
        }

		for(int i = 0; i<n; i++){
			System.out.print(ans_arr[i] + " ");
		}
	}
}
