import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayTestTest {
	ArrayUtilities arrUtils = new ArrayUtilities();
	
	@Test
	public void toIncrementTest() {
		int[] arr = new int[] {1,2,3,4,5};
		arrUtils.toIncrementArray(arr);
		assertArrayEquals(new int[] {2,3,4,5,6}, arr);
		
	}
	
	@Test
	public void toUpperTest() {
		String[] arr = new String[] {"cat", "dog", "bird"};
		arrUtils.toUpperArray(arr);
		assertArrayEquals(new String[] {"CAT", "DOG", "BIRD"}, arr);
	}

}
