
public class Lab201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "Alice, Emma, Leon , John"}; 
		
		System.out.println("length =  " + names.length );
		System.out.println("The first element = " + names[0] );
		System.out.println("The last element = " + names[names.length -1] );
		System.out.println("The middle element = " + names[names.length / 2] );
		
		System.out.println("Display all elements: " );
		boolean first_element = true;
		for (String name : names) {
			//if (!first_element) {
			//	System.out.print(", ");
			//}
			System.out.print((!first_element ? ", " : "" ) + name);
			first_element = false;
		}
	
		
	}

}
