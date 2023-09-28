package PracticeBDD.Julypractice;
class A
{
	private int value;
	
	private String number; 
	public void Setvalue(int a,String b)
	{
		value=a;
		number=b;
		
	}
	
	public int getValue()
	{
		return value;
	}
	public String Get()
	{
		return number;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		A a=new A();
		a.Setvalue(200,"A");
		
		System.out.println(a.getValue());
		System.out.println(a.Get());
		System.out.println(a.Get());
		
		
				


	}

}
