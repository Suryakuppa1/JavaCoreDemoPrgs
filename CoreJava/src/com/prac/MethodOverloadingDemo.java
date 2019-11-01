package com.prac;
class Pink
{
	public void red()
	{
		System.out.println("Harish");
	}
	public int red(int i)
	{
		System.out.println(" Harish2"+ " "+ i);
		return i;
	}
	public String red(String i)
	{
		System.out.println(" Harish3"+ " "+ i);
		return i;
	}
}
class Violet extends Pink
{
	public void red()
	{
		super.red();
		System.out.println("Kiran");
	}
}

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		Violet vk = new Violet();
		vk.red();
		
	}

}
