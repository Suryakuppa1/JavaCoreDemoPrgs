package com.prac;
class Thing
{
	int RollNo = 10;
 String Name = "SuryaKiran";
public int getRollNo()
{
	return RollNo;
}
public void setRollNo(int rollNo)
{
	RollNo = rollNo;
}
public String getName() 
{
	return Name;
}
public void setName(String name)
{
	Name = name;
}

	
	
}

public class ConstructorOverloadingDemo {

	public static void main(String[] args) {
		Thing obj = new Thing();
		System.out.println(obj.getRollNo());
		System.out.println(obj.getName());
		obj.getName();
		

	}

}
