package com.abc;
class IfStatement
{
	public void doSomething()
	{
	int i=6;
	int j=0;
	if(i>5)
	{
		j=1;
	}
	else
		{
			j=2;
		}
	System.out.println(j);
	}
	public void TerinaryOp()
	{
		int i = 5;
		int j =0;
		 j = i>6 ? 1: 2;
		 System.out.println(j);
	}
}

public class TerinaryOperator {

	public static void main(String[] args) {
		IfStatement iff = new IfStatement();
		iff.doSomething();
		iff.TerinaryOp();
		
	}

}
