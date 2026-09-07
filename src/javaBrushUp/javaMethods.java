package javaBrushUp;

public class javaMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		javaMethods jm = new javaMethods();
		//now that we've created a method (below) we can use this class object we have created to access the method getData from it.
		jm.getData();
		
		staticMethodRetun();
		String methodString = jm.methodRetun();
		System.out.println(methodString);
		
		//we can access other classes with the same syntax as above
		javaStrings js = new javaStrings();
		js.stringMethods();
		
		
	}
	//public can be accessed in other classes 
	//void returns nothing
	// if you want to create an object of a class's method you have to create an instance of it using the new keyword
	public void getData() {
		System.out.println("Java still awesome");
		
	}

	public String methodRetun() {
		
		return "Java still awesome";
	}
	
	//static method doesn't require instantiating a new object of the class
	public static void staticMethodRetun() {
		
		System.out.println("Java is still awesome");
	}


}
