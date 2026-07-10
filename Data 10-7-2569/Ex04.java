
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayController nums = new ArrayController();
		nums.Display("All elements:");
		
		int[] new_nums = new int[nums.getSize()-1];

		
		for (int i=0; i < new_nums.length; i++ ) {
			new_nums[i] = nums.getNums()[i+1];
		}
		
		nums.setNums(new_nums);
		nums.Display("\n\nAfter Delete the first element:");
	}
}
