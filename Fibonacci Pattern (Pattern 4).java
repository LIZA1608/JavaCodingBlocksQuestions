import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n;
    n=sc.nextInt();
    int sum=0,ts=0;
    int nst=1,rows=1;
    int firstFibo=0,secondFibo=1;
    while(rows<=n){
      int cst=1;
      while(cst<=nst){
        System.out.print(firstFibo);
        System.out.print("\t");
        int thirdFibo=firstFibo+secondFibo;
        firstFibo=secondFibo;
        secondFibo=thirdFibo;
        cst++;
      }
      rows++;
      nst++;
      System.out.println();
    }
  }
}
