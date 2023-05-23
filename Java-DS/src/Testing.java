import java.util.ArrayList;
import java.util.List;

public class Testing {
	public static void main(String[] args) {

		// create array list of products with initial values using List
		List<String> products = new ArrayList<>(List.of("Item-1100805", "Item-1100801", "Item-1100802", "Item-1100803",
				"Item-1100804", "Item-1100800"));
		// print list before swapping
		System.out.println("Before swapping: " + products);

		// swap the first and last values of our list and print the updated list
		swapFirstAndLast(products);
	}

	// Used for swapping the first and last elements of a given list
	public static void swapFirstAndLast(List<String> list) {
		// check if list isn't empty before attempting to swap
		if (list.size() > 0) {
			// store in temporary var, then make the swap using set
			String temp = list.get(0);
			list.set(0, list.get(list.size() - 1));
			list.set(list.size() - 1, temp);
		} else {
			System.out.println("Arraylist is empty");
		}
		System.out.println("After swapping: " + list);

	}
}
