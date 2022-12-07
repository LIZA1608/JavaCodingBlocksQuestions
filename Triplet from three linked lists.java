import java.util.*;

class Node{
    int data;
    Node next;
    Node(int val){
        data=val;
        next=null;
    }
}


public class Main {

static Node insert(Node h,int val){
  Node n=new Node(val);
   if(h==null)return n;
  Node head=h;
   while(head.next!=null){
       head=head.next;
   }
   head.next=n;

   return h;
}

static void display(Node head){
    if(head==null)return;

    while(head!=null){
        System.out.print(head.data+" ");
        head=head.next;
    }
    System.out.println();
}

static Node reverse(Node head){
    if(head==null || head.next==null)return head;

    Node curr=head;
    Node pre=null;

    while(curr!=null){
        Node post=curr.next;
        curr.next=pre;
        pre=curr;
        curr=post;
    }
    return pre;
}

 static int findele(Node head,int k){

    if(k==1)return head.data;

    int a=1;

    while(head!=null && a<k){
        head=head.next;
        a++;
    }
    return head.data;
}
static Node sumofTwoll(Node head1,Node head2){
    Node ans=new Node(-1);
    Node temp=ans;
     
     int carry=0;

     while(head1!=null && head2!=null){
           int val=head1.data+head2.data+carry;
           carry=val/10;
           val=val%10;

           temp.next=new Node(val);
           temp=temp.next;
           head1=head1.next;
           head2=head2.next;
     }
      while(head1!=null){
           int val=head1.data+carry;
           carry=val/10;
           val=val%10;

           temp.next=new Node(val);
           temp=temp.next;
           head1=head1.next;
     }

      while(head2!=null){
           int val=head2.data+carry;
           carry=val/10;
           val=val%10;

           temp.next=new Node(val);
           temp=temp.next;
           head2=head2.next;
     }

     if(carry>0){
         temp.next=new Node(carry);
     }

     return ans.next;
}
    public static void main (String args[]) {
          Scanner s=new Scanner(System.in);

          Node head1=null;
          Node head2=null;
          Node head3=null;
          int n=s.nextInt();
          int m=s.nextInt();
          int k=s.nextInt();

         for(int i=0;i<n;i++){
             head1=insert(head1,s.nextInt());
         }
         for(int i=0;i<m;i++){
             head2=insert(head2,s.nextInt());
         }
         for(int i=0;i<k;i++){
             head3=insert(head3,s.nextInt());
         }

         int value=s.nextInt();
         
         while(head1!=null){
             Node temp=head2;
             while(temp!=null){
                 Node t=head3;
                 while(t!=null){

                     int val=head1.data+temp.data+t.data;

                     if(val==value){
                         System.out.println(head1.data+" "+temp.data+" "+t.data);
                         return;
                     }
                     t=t.next;
                 }
                 temp=temp.next;
             }
             head1=head1.next;
         }

        
        
    }
}
