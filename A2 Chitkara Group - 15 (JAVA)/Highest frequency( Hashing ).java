


import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxFrequency = 0;
int maxNumber = 0;
HashMap<Integer, Integer> map = new HashMap<>();
for (int num : arr) {
  if (map.containsKey(num)) {
    map.put(num, map.get(num) + 1);
  } else {
    map.put(num, 1);
  }
}
for (int num : map.keySet()) {
  if (map.get(num) > maxFrequency) {
    maxFrequency = map.get(num);
    maxNumber = num;
  }
}

System.out.println( maxNumber);
}
}
