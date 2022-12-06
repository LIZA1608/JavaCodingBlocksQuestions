import java.util.*;

public class Main {
	public static void main(String args[]) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(), a = 0, b = 0, count = 1, noc = 0; // noc=number of changes
		if (n > 0 && n < 1000) {
			a = scn.nextInt();
			if (a <= 0 || a >= 1000000000) {
				count = n + 1;
				noc = -1;
			}
			count++;
			boolean type; // true for increasing, false for decreasing
			b = scn.nextInt();
			if (b <= 0 || b >= 1000000000) {
				count = n + 1;
				noc = -1;
			}
			count++;
			if (b > a){
				type = true;
				noc=1;    // if first number is increasing then the whole sequence must be increasing
			}
			else if(a>b)
				type = false;
			else{
				System.out.println("false");
				return ;    //Must end the program if a=b
			}
			while (count <= n) {
				a = b;
				b = scn.nextInt();
				if (b <= 0 || b >= 1000000000) {
					noc = -1;
					break;
				}
				count++;
				boolean temp = type;
				if (b > a)
					type = true;
				else if(a>b)
					type = false;
				else{
					System.out.println("false");
					return;           //Must end the program if a=b
				}
				if (temp != type) {
					noc++;
				}

			}
			if (noc >= 0 && noc < 2)
				System.out.println(true);
			else
				System.out.println(false);
		}
	}
}
