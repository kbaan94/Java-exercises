
interface Stack {
	void push(char n); // push item on stack

	char peek(); // retrieve top-most item on stack

	char pop(); // remove item and return it

	boolean isEmpty(); // check if stack is empty

	boolean isFull(); // check if stack is full

	String toString(); // return string representation of stack elements
}

class StackArray implements Stack {
	private char[] stack;
	private int top; // Index for current position in stack

	// initialize using desired size, and set top top to -1 since stack is empty
	public StackArray(int size) {
		stack = new char[size];
		top = -1;
	}

	public void push(char n) {
		if (!(stack.length - 1 == top)) {
			stack[++top] = n;
		}
	}

	public char peek() {
		return stack[top];
	}

	public char pop() {
		return stack[top--];
	}

	public boolean isEmpty() {
		return (top < 0);
	}

	public boolean isFull() {
		return (top == stack.length - 1);
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();

		for (int i = top; i >= 0; i--) {
			buffer.append(stack[i] + " ");
		}
		return buffer.toString();
	}
}

public class TestStack {
	public static void main(String[] args) {
		StackArray stack = new StackArray(4);
		stack.push('n');
		stack.push('a');
		stack.push('s');
		stack.push('f');
		stack.push('n');
		stack.push('n');
		char c = stack.peek();
		System.out.println(c);
		System.out.println(stack.toString());

	}
}
