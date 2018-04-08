package overloading_constructorOverloading;

/**
 * class to implement constructor overloading.
 * 
 * @author Administrator
 *
 */
public class Employee {
	
	/**
	 * Default constructor
	 */
	public Employee(){
		System.out.println("Default constructor from Employee Class");
	}
	
	/**
	 * Single parameter constructor
	 * @param a
	 */
	public Employee(int a){
		System.out.println("Single parameter constructor from Employee Class");
		System.out.println("a="+a);
	}
	
	
	/**
	 * Multiple parameters constructor
	 * @param a
	 * @param b
	 */
	public Employee(int a, int b){
		System.out.println("Multiple parameters constructor from Employee Class");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	
	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee(10);
		Employee e3 = new Employee(20, 30);
	}

}
