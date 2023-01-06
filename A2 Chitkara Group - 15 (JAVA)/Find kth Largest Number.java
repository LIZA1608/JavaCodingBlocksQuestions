

import java.util.*;
public class Main {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
    public static void main (String args[]) {
       
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
           
        int kthLargest = findKthLargest(arr, k);
        System.out.println(kthLargest);
    }
}
