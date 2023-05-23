
class Node {
	int value;
	Node next;

	public Node(int value) {
		this.value = value;
		this.next = null;
	}
}

public class LinkedList {
	private int length;
	private Node head;
	private Node tail;

	public LinkedList() {
		head = null;
		tail = null;
		length = 0;
	}

	public LinkedList(int value) {
		head = new Node(value);
		tail = head;
		length++;
	}

	private void printList() {
		Node current = this.head;
		while (current != null) {
			System.out.print(current.value + " ");
			current = current.next;
		}
		System.out.println();
	}

	private void append(int i) {
		Node newNode = new Node(i);
		if (head == null) {
			head = newNode;
			tail = newNode;
			length++;
		} else {
			this.tail.next = newNode;
			this.tail = newNode;
			length++;
		}
	}

	private Node popLast() {
		if (length == 0) {
			return null;
		}

		Node current = this.head;
		Node pre = this.head;

		while (current.next != null) {
			pre = current;
			current = current.next;
		}
		tail = pre;
		tail.next = null;
		length--;
		if (length == 0) {
			head = null;
			tail = null;
		}
		return current;

	}

	private boolean addFirst(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = this.head;
			head = newNode;
		}
		length++;
		return true;
	}

	private Node popFirst() {
		if (length == 0) {
			return null;
		}

		Node temp = head;
		head = head.next;
		temp.next = null;
		length--;

		if (length == 0) {
			tail = null;
		}
		return temp;

	}

	private Node getNode(int index) {
		Node temp = head;
		if (index < 0 || index > length) {
			return null;
		} else if (index == 0) {
			return head;
		} else if (index == length - 1) {
			return tail;
		} else {
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
		}
		return temp;
	}

	private void setValue(int index, int val) {
		Node temp = this.getNode(index);
		if (temp != null) {
			temp.value = val;
		}
	}

	private boolean insertNode(int index, int val) {
		if (index < 0 || index > length) {
			return false;
		} else if (index == 0) {
			return this.addFirst(val);
		} else if (index == length - 1) {
			this.append(val);
			return true;
		}
		Node newNode = new Node(val);
		Node temp = this.getNode(index - 1);
		newNode.next = temp.next;
		temp.next = newNode;
		length++;
		return true;

	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList(0);
		list.append(2);
		// list.append(22);

		list.insertNode(1, 1);
		list.printList();
	}
}
