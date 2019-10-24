/*
 * Member Class
 * Static Inner Class
 * Anonymous Class (Used With Interfaces)
 */
package abc;
class Red // Outer class
{
	class Maroon // Inner class 
	{
		public void men()
		{
			System.out.println("Some Men Likes Maroon Red");
		}
	}
	public void women()
	{
		System.out.println("Some Women Likes Red");
	}
	
	static class Violet // Static Inner class 
	{
		public void  gender()
		{
			System.out.println("Violet Likes By any one ");
		}
		
	}
	
}

public class InnerClassDemo {

	public static void main(String[] args) {
		Red obj = new Red();
		Red.Maroon obj2 = obj.new Maroon(); // Creating a Object of inner Class
		Red.Violet obj3 = new Red.Violet(); // Creating a Object of Static inner Class
	
				
		obj.women();
		obj2.men();
		obj3.gender();
		

	}

}
