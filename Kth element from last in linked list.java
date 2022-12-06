import java.util.*;
public class Main {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(-1);
        Node tail = head;
        int n = sc.nextInt();
        int len = 0;
        while(n != -1){
            len++;
            Node new_node = new Node(n);
            tail.next = new_node;
            tail = tail.next;
            n = sc.nextInt();
        }
        int last = sc.nextInt();
        Node temp = head;
        for(int i=0; i<len-last; i++){
            temp = temp.next;
        }
        System.out.println(temp.next.data);
    }
}
