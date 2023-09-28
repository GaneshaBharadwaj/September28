package PracticeBDD.Julypractice;

import org.testng.annotations.Test;

public class ReverseMethod {
	
	@Test
	public static void main(String[] args) {
		 String Name="Ganesh H N Bhardwaj";
		String[] A= Name.split("");
		System.out.println(A.length);
		for(int i=A.length-1;i>=0;i--)
		{
			System.out.print(A[i]);
		}
		 
	}
	@Test
	public void Method2()
	{
		StringBuffer sb=new StringBuffer("Ganesh H N Bharadwaj");
		System.out.println(sb.reverse());
	}

}
