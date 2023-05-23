
public class ArrayUtilities {
	
	public void toUpperArray(String[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].toUpperCase();
		}
	}
	
	public void toIncrementArray(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ++arr[i];
		}
	}

}
