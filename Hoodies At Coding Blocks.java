import java.util.*;

class Main{

	protected int size;

	protected int front;
	protected int[] data;

	public Main() {
		this.size = 0;
		this.front = 0;
		this.data = new int[5];
	}

	public Main(int cap) {
		this.size = 0;
		this.front = 0;
		this.data = new int[cap];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void enqueue(int item) throws Exception {
		if (this.size() == this.data.length) {
			int[] oa = this.data;
			int[] na = new int[oa.length * 2];
			for (int i = 0; i < this.size(); i++) {
				int idx = (i + front) % oa.length;
				na[i] = oa[idx];
			}

			this.data = na;
			this.front = 0;
		}

		// if (this.size == this.data.length) {
		// throw new Exception("Mainis full");
		// }

		this.data[(front + size) % this.data.length] = item;
		size++;

	}
	public int dequeue() throws Exception {
		if (this.size == 0) {
			throw new Exception("queue is empty");

		}
		int rv = this.data[front];
		front = (front + 1) % this.data.length;
		size--;
		return rv;
	}
	public int getFront() throws Exception {
		if (this.size == 0) {
			throw new Exception("queue is empty");
		}
		int rv = this.data[front];
return rv;
	}
	public void display() {
		System.out.println();
		for (int i = 0; i < size; i++) {
			int idx = (i + front) % this.data.length;
			System.out.print(this.data[idx] + " ");
		}
        System.out.print("END");
	}
    public static void hoodies(int q) throws Exception{ 
		
		int arr[]=new int[5];
        int i=0;
		for(i=0;i<5;i++){
			arr[i]=-1;
		}
		LinkedList<Integer> q1=new LinkedList<>();
		LinkedList<Integer> q2=new LinkedList<>();
		LinkedList<Integer> q3=new LinkedList<>();
		LinkedList<Integer> q4=new LinkedList<>();
	  int a=1;
	   for(i=0;i<q;i++){
           char ch=scn.next().charAt(0);

		   if(ch=='E'){
                 int j=scn.nextInt();
				 int val=scn.nextInt();
				 if(j==1){
					 q1.add(val);
				 }
				 else if(j==2){
					q2.add(val);
				 }
				 else if(j==3){
					q3.add(val);
				 }
				else if(j==4){
					 q4.add(val);
				 }
				 if(arr[j]==-1){
					 arr[j]=a;
					 a++;
				 }
		   }
		   else{
			   int m=Integer.MAX_VALUE;
			   int ans=1;
                 for(int k=1;k<5;k++){
                      if(m>arr[k] && arr[k]!=-1){
						  m=arr[k];
						  ans=k;
					  }
				 }
                int res=0;
                 if(ans==1){
					 res=q1.poll();
					 if(q1.isEmpty()==true){
						 arr[ans]=-1;
					 }
				 }
				 else if(ans==2){
					 res=q2.poll();
					  if(q2.isEmpty()==true){
						 arr[ans]=-1;
					 }
				 }
				 else if(ans==3){
					 res=q3.poll();
					  if(q3.isEmpty()==true){
						 arr[ans]=-1;
					 }
				 }
				else if(ans==4){
					 res=q4.poll();
					  if(q4.isEmpty()==true){
						 arr[ans]=-1;
					 }
				 }
		 System.out.println(ans+" "+res);		
		   }
	   }
}
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
        int n = scn.nextInt();
        hoodies(n);
	}
}
