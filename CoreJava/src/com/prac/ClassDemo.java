package com.prac;
class outer
{
	int i = 10;
	void blue()
	{
		System.out.println(i);
	}
	void blood()
	{
		System.out.println(i);
	}
	
}
class other
{
	public void red()
	{ int i = 20;
		System.out.println(i);
	}
}

public class ClassDemo {

	public static void main(String[] args) {
		outer obj = new outer();
		obj.blue();
		obj.blood();
		other mad = new other();
		mad.red();
		
	}

}
