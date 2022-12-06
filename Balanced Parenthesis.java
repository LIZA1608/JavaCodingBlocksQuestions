
import java.util.*;

public class Main {

	static boolean areBracketsBalanced(String str)
	{
		Deque<Character> stack
			= new ArrayDeque<Character>();

		for (int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);

			if (x == '(' || x == '[' || x == '{') {
				stack.push(x);
				continue;
			}

			
			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}

	
		return (stack.isEmpty());
	}


	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    
		String str = sc.nextLine();

		// Function call
		if (areBracketsBalanced(str))
			System.out.println("Yes ");
		else
			System.out.println("No ");
	}
}
