import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0; i<2; i++){
                int n = sc.nextInt();
                for(int x=0; x<n; x++){
                    arr.add(sc.nextInt());
                }
            }
            Collections.sort(arr);
            for(int i=0; i<arr.size(); i++){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
        }
    }
}
