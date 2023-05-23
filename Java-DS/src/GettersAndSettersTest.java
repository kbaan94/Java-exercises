
public class GettersAndSettersTest {
	
	private int[] nums;
	
	public void setListOfNums(int[] src) {
		this.nums = src;
	}
	
	public int[] getListOfNums(){
		return this.nums;
	}
	
	
	
	public static void main(String[] args) {
		GettersAndSettersTest app = new GettersAndSettersTest();
		
		int[] numbers = {1, 2, 3, 4, 5};
		
		app.setListOfNums(numbers);
		
		System.out.println(app.getListOfNums());
		
	}

}
