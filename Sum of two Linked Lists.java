import java.util.*;

public class Main
{
	class node
	{
		int val;
		node next;

		public node(int val)
		{
			this.val = val;
		}
	}
	
	// Function to print linked list
	void printlist(node head)
	{
		while (head != null)
		{
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

	node head1, head2, result;
	int carry;

	/* A utility function to push a value to linked list */
	void push(int val, int list)
	{
		node newnode = new node(val);
		if (list == 1)
		{
			newnode.next = head1;
			head1 = newnode;
		}
		else if (list == 2)
		{
			newnode.next = head2;
			head2 = newnode;
		}
		else
		{
			newnode.next = result;
			result = newnode;
		}

	}
	void addsamesize(node n, node m)
	{
		// Since the function assumes linked lists are of
		// same size, check any of the two head pointers
		if (n == null)
			return;

		// Recursively add remaining nodes and get the carry
		addsamesize(n.next, m.next);

		// add digits of current nodes and propagated carry
		int sum = n.val + m.val + carry;
		carry = sum / 10;
		sum = sum % 10;

		// Push this to result list
		push(sum, 3);

	}

	node cur;
	void propogatecarry(node head1)
	{
		// If diff. number of nodes are not traversed, add carry
		if (head1 != cur)
		{
			propogatecarry(head1.next);
			int sum = carry + head1.val;
			carry = sum / 10;
			sum %= 10;

			// add this node to the front of the result
			push(sum, 3);
		}
	}

	int getsize(node head)
	{
		int count = 0;
		while (head != null)
		{
			count++;
			head = head.next;
		}
		return count;
	}
	void addlists()
	{
		// first list is empty
		if (head1 == null)
		{
			result = head2;
			return;
		}

		// first list is empty
		if (head2 == null)
		{
			result = head1;
			return;
		}

		int size1 = getsize(head1);
		int size2 = getsize(head2);

		// Add same size lists
		if (size1 == size2)
		{
			addsamesize(head1, head2);
		}
		else
		{
			// First list should always be larger than second list.
			// If not, swap pointers
			if (size1 < size2)
			{
				node temp = head1;
				head1 = head2;
				head2 = temp;
			}
			int diff = Math.abs(size1 - size2);

			// move diff. number of nodes in first list
			node temp = head1;
			while (diff-- >= 0)
			{
				cur = temp;
				temp = temp.next;
			}

			// get addition of same size lists
			addsamesize(cur, head2);

			// get addition of remaining first list and carry
			propogatecarry(head1);
		}
			if (carry > 0)
				push(carry, 3);
		
	}
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
		Main list = new Main();
		list.head1 = null;
		list.head2 = null;
		list.result = null;
		list.carry = 0;
		int arr1[] = new int[n];
		int arr2[] = new int[m];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }
		for (int i = arr1.length - 1; i >= 0; --i)
			list.push(arr1[i], 1);
		for (int i = arr2.length - 1; i >= 0; --i)
			list.push(arr2[i], 2);

		list.addlists();
		list.printlist(list.result);
	}
}
