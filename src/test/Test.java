package test;


import java.util.ArrayList;
import java.util.List;



public class Test 
{
	int field;
	static int field2 = 0;
	
	public static void main(String[] args)
	{		
		System.out.println(Test.class instanceof Object);
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		List<Integer> list = (List) arrayList;
	}
	
	public Test(int digit)
	{
		this("string");
		System.out.println("cons");
		field = digit;
	}
		
	
	Test(String lol){}
	
	void qwe()
	{
		System.out.println("1");
	}
}


class Test2 extends Test
{
	public Test2(int digit) {
		
		super(digit);
		
		
		int digit2 = super.field;
		
		this.getClass();
	}
	
	Test2(String lol)
	{
		super("123");
	}
	
	
}
	

