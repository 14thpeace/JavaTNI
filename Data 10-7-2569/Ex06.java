
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayController nums = new ArrayController();
		nums.Display("All element");
	
		int[] new_nums = new int[nums.getSize()-1];
		
		int delete_index = 2;
		
		for (int i=0; i < delete_index; i++ ) {
			new_nums[i] = nums.getNums()[i];
		}
		
		for (int i=delete_index + 1; i < nums.getSize(); i++ ) {
			new_nums[i-1] = nums.getNums()[i];
		}
		
		
		nums.setNums(new_nums);
		nums.Display("\n\nAfter Delete the element:");
	}

}
