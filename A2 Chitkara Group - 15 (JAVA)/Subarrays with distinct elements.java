

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int [n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
int sum = 0;
    for (int i = 0; i < n; i++) {
        HashSet<Integer> set = new HashSet<>();
        for (int j = i; j < n; j++) {
            if (set.contains(arr[j])) {
                break;
            }
            set.add(arr[j]);
            sum += set.size();
        }
    }
    System.out.println(sum);
    }
}
