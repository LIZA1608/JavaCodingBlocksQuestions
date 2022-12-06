import java.util.*;
public class Main {
    public static void main(String args[]) {
 Scanner sc=new Scanner(System.in);
 int n;
 n=sc.nextInt();
    int a[][]=new int[n][n];
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            a[i][j]=sc.nextInt();
        }
    }
    int p=-1;
    for (int i = 0; i < n; i++)
    {
        boolean isCelebrity = true;
        for (int j = 0; j < n; j++)
        {
            if(i != j){
                if(a[i][j] == 1 || a[j][i] == 0){
                    isCelebrity = false;
                }
            }
        }
        if(isCelebrity == true){
            p = i;
            break;
        }
    }
	if(p != -1){
        System.out.print(p);
    }
	else{
        String c="No Celebrity";
		System.out.print(c);
	}
    
}
}
