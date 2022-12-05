

import java.util.*;
public class Main {
	private class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public Main() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public Main(Node head, Node tail, int size) {
		this.head = head;
		this.tail = tail;
		this.size = size;
	}

	// O(1)
	public int size() {
		return this.size;
	}

	// O(1)
	public boolean isEmpty() {
		return this.size() == 0;
	}

	// O(1)
	public int getFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty.");
		}

		return this.head.data;
	}

	// O(1)
	public int getLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty.");
		}

		return this.tail.data;
	}

	// O👎
	public int getAt(int idx) throws Exception {
		Node temp = this.getNodeAt(idx);
		return temp.data;
	}

	// O👎
	private Node getNodeAt(int idx) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}

		if (idx < 0 || idx >= this.size()) {
			throw new Exception("Invalid arguments");
		}

		Node retVal = this.head;
		for (int i = 0; i < idx; i++) {
			retVal = retVal.next;
		}

		return retVal;
	}

	// O(1)
	public void addFirst(int data) {
		Node node = new Node(data, this.head);

		if (this.size() == 0) {
			this.head = node;
			this.tail = node;
		} else {
			this.head = node;
		}

		this.size++;
	}

	// O(1)
	public void addLast(int data) {
		Node node = new Node(data, null);

		if (this.size() == 0) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}

		this.size++;
	}

	// O👎
	public void addAt(int idx, int data) throws Exception {
		if (idx < 0 || idx > this.size()) {
			throw new Exception("Invalid arguments");
		}

		if (idx == 0) {
			this.addFirst(data);
		} else if (idx == this.size()) {
			this.addLast(data);
		} else {
			Node nm1 = this.getNodeAt(idx - 1);
			Node n = nm1.next;

			Node node = new Node(data, n);
			nm1.next = node;

			this.size++;
		}
	}

	// O(1)
	public int removeFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}

		int retVal = this.head.data;

		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
		}

		this.size--;
		return retVal;
	}

	// O👎
	public int removeLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}

		int retVal = this.tail.data;

		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node sm2 = this.getNodeAt(this.size() - 2);
			sm2.next = null;
			this.tail = sm2;
		}

		this.size--;
		return retVal;
	}

	// O👎
	public int removeAt(int idx) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}

		if (idx < 0 || idx >= this.size()) {
			throw new Exception("Invalid arguments");
		}

		if (idx == 0) {
			return this.removeFirst();
		} else if (idx == this.size() - 1) {
			return this.removeLast();
		} else {
			Node nm1 = this.getNodeAt(idx - 1);
			Node n = nm1.next;
			Node np1 = n.next;

			nm1.next = np1;
			this.size--;

			return n.data;
		}
	}

	// O👎
	public void display() {
		Node node = this.head;

		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}

		//System.out.println("END");
	}
   
public Node kappend( Node head, int k) {
   Node newTail = head;
        Node temp = head;
        int len = 1;
        if(head == null) return head;
        while(newTail.next != null){
            newTail = newTail.next;
            len++;   
        }
        k = len - k%len;
        for(int i = 1; i<k; i++){
            temp = temp.next;
        }
        newTail.next = head;
        head = temp.next;
        temp.next = null;
        return head;
    }
public static void main(String[] args) throws Exception {
		
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		Main list = new Main();
		for (int i = 0; i < N; i++) {
			list.addLast(scn.nextInt());
		}
       int K=scn.nextInt();
		list.head=list.kappend(list.head,K);
        list.display();
}
}
