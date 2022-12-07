import java.util.*;
class Main {
public static void main(String args[] ) throws Exception {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
Queue<Integer> q1 = new LinkedList<>();
Queue<Integer> q2 = new LinkedList<>();
for(int i = 0;i<n;i++)
q1.add(in.nextInt());
for(int i = 0;i<n;i++)
q2.add(in.nextInt());
time(n,q1,q2);
}
static void time(int n,Queue<Integer> q1,Queue<Integer> q2){
int count = 0;
while(true){
if(q1.peek()!=q2.peek()){
int a = q1.peek();
q1.remove();
q1.add(a);
count++;
}
if(q1.peek()==q2.peek()){
q1.remove();
q2.remove();
count++;
}
if(q1.isEmpty())
break;
}
System.out.println(count);
}
}
