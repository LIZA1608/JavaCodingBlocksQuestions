import java.util.*;
public class Main {
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int  t;
  t=sc.nextInt();
  for(int u=1;u<=t;u++){
    int c1=sc.nextInt();
    int c2=sc.nextInt();
    int c3=sc.nextInt();
    int c4=sc.nextInt();
    int rickshaw=sc.nextInt();
    int cab=sc.nextInt();
    int []cabs=new int[cab];
    int[]rick=new int[rickshaw];
    for(int i=0;i<rickshaw;i++){
      rick[i]=sc.nextInt();
    }
    for(int i=0;i<cab;i++){
      cabs[i]=sc.nextInt();
    }
    int cost2=0;
    int cost3=0;
    int ans;
    for(int i=0;i<rickshaw;i++){
      cost2+=Math.min(rick[i]*c1,c2);
    }
    cost3+=Math.min(cost2,c3);
    cost2=0;
    for(int i=0;i<cab;i++){
      cost2+=Math.min(cabs[i]*c1,c2);
    }
    cost3+=Math.min(cost2,c3);
    ans=Math.min(cost3,c4);
    System.out.println(ans);
  }
}
}

