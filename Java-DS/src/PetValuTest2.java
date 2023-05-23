public class PetValuTest2 {
	public static void main(String[] args) {

		// Define array of int sales
		int[] sales = new int[] { 93000, 89000, 121000, 108000, 104000, 132000, 113000, 118000, 143000, 116000, 115000,
				180000 };

		// Print second largest element in the given array of sales
		secondLargest(sales);
	}

	/*
	 * Custom sorting algorithm using selection sort, which orders elements in
	 * decreasing order. Could have also used Arrays.sort(sales) which makes use of
	 * Quick-sort
	 */
	public static void secondLargest(int[] sales) {

		if (sales.length > 0) {
			// Iterate over all elements in the array except the last
			for (int i = 0; i < sales.length - 1; i++) {

				// Keep track of max element
				int maxIndex = i;

				// Iterate over remaining unsorted portion of array and find the index of the
				// maximum element. The max element is swapped with the current unsorted element
				for (int j = i + 1; j < sales.length; j++) {
					// Compare current element with max element found so far, if current element is
					// larger, then set maxIndex to the index of current element.
					if (sales[j] > sales[maxIndex]) {
						maxIndex = j;
					}
				}
				// Swap value of sales[i] with maxIndex to place max at current position
				int temp = sales[i];
				sales[i] = sales[maxIndex];
				sales[maxIndex] = temp;
			}
			// Print second largest element in the sorted algorithm
			System.out.println("Second largest sales: " + sales[1]);
		} else {
			System.out.println("Array is empty");
		}
	}
}
