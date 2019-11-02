package abc;
class Calc
{
	int num1;
	int num2;
	
	public Calc() // Default Constructor
	{
		num1 = 50;
		System.out.println("Hai");
	}
	public Calc(int i) // parametarised Constructor
	{
		i = 50;
		System.out.println("Hello");
	}
	public Calc(int num1, int num2) // Using The This Keyword
	{
		this.num1 = num1;
		this.num2 = num2;
				
		
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		Calc obj = new Calc(50,20);
		
		
		
	}

}
