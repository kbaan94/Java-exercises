import java.util.ArrayList;

public class HashTable {
	// size of array we are using for our address space. Using a prime number for
	// the size, we get fewer collisions in our address space
	private int size = 7;
	// data map array (array of pointers to nodes)
	private Node[] dataMap;

	class Node {
		private String key;
		private int value;
		private Node next;

		public Node(String key, int value) {
			this.key = key;
			this.value = value;
			next = null;
		}

	}

	public HashTable() {
		dataMap = new Node[size];
	}

	private int hash(String key) {
		int hash = 0;
		char[] keyChars = key.toCharArray();

		for (int i = 0; i < keyChars.length; i++) {
			int asciiValue = keyChars[i];

			// we multiply by 23 cause 23 is prime, and multiplying this by prime you get a
			// more random number.
			hash = (hash + asciiValue * 23) % dataMap.length;
		}
		return hash;
	}

	public void set(String key, int value) {
		// hash key to get index for where we will insert the data
		int index = hash(key);
		// create the node
		Node newNode = new Node(key, value);
		if (dataMap[index] == null) {
			dataMap[index] = newNode;
		} else {
			Node temp = dataMap[index];
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public int get(String key) {
		int index = hash(key);
		Node temp = dataMap[index];

		int result = 0;

		while (temp != null) {
			if (temp.key == key) {
				result = temp.value;
			}
			temp = temp.next;
		}
		return result;
	}

	public ArrayList<String> keys() {
		ArrayList<String> allKeys = new ArrayList<>();
		for (int i = 0; i < dataMap.length; i++) {
			Node temp = dataMap[i];
			while (temp != null) {
				allKeys.add(temp.key);
				temp = temp.next;
			}
		}
		return allKeys;
	}

	// print contents of the hash table
	public void printTable() {
		for (int i = 0; i < dataMap.length; i++) {
			System.out.println(i + ": ");
			Node temp = dataMap[i];
			while (temp != null) {
				System.out.println("   {" + temp.key + "= " + temp.value + "}");
				temp = temp.next;
			}
		}
	}

	public static void main(String[] args) {
		HashTable myHashTable = new HashTable();
		myHashTable.set("paint", 100);
		myHashTable.set("seal", 50);
		myHashTable.set("nails", 80);

		myHashTable.set("norm", 200);
		myHashTable.set("Jack", 140);
		myHashTable.printTable();

		System.out.println(myHashTable.keys());
	}

}
