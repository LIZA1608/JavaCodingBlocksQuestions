/*https://hack.codingblocks.com/app/contests/3682/43/problem*/

import java.util.*;
public class Main {
    public static long count( long n,int k)
    {
        long low =0;
        long high =n;
        long mid =0;
        double pov=0;
        while(low<=high)
        {
            mid = low + (high-low)/2;
            pov =  Math.pow(mid,k);
            if(pov == n)
            {
                return mid;
            }
            if(pov < n)
            {
                low = mid+1;
            }
            else
            {
                high = mid -1;
            }

        }
        if (Math.pow(mid,k) <= n) return mid;
        else return mid-1;
    }
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t!=0)
       {
           long  n = sc.nextLong();
           int k = sc.nextInt();
           System.out.println(count(n,k));
           t--;
       }
    }
}
