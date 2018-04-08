
public class ReverseString {
	
	static void reverseStringMethod(String myString){
		
		//convert string to character array
		char[] myStringArray = myString.toCharArray();
		System.out.println("Total character in "+myString+" : "+myStringArray.length);
		for(int i=myStringArray.length-1; i>=0; i--){
			System.out.print(myStringArray[i]);
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		reverseStringMethod("beast boy");
	}

}
