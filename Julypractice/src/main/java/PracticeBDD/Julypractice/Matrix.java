package PracticeBDD.Julypractice;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Matrix {
	public static WebDriver driver=null;
	@Ignore
	@Test(enabled=false)
	public void add() {
		int A[][]= {{1,2,3},{4,5,6}};
		int B[][]= {{1,2,3},{4,5,6}};
		int C[][]=new int[A.length][A[0].length];
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{
				C[i][j]=A[i][j]+B[i][j];
			}
		}
		for(int i=C.length-1;i>=0;i--)
		{
			for(int j=C[0].length-1;j>=0;j--)
			{
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}
	}


	@Ignore
	@Test(enabled=false)
	public void Multiplication()
	{
		int A[][]= {{1,2,3},{4,5,6}};
		int B[][]= {{1,2,3},{4,5,6}};
		int C[][]=new int[A.length][A[0].length];
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{ 
				C[i][j]=0;
				for(int k=0;k<3;k++)
				{
					C[i][j]+=A[i][k]*B[j][k];
				}
				System.out.print(C[i][j]+" ");

			}
			System.out.println();
		}

	}
	@Ignore
	@Test
	public void Assign()
	{
		int size=0;
		for(int i=1;i<30;i++)
		{
			if(i%2==0)
			{
				size++;

			}
		}
		System.out.println(size);
		int array[]=new int[size];
		int k=0;
		for(int i=1;i<30;i++)
		{
			if(i%2==0)
			{
				array[k]=i;
				k++;
			}
		}
		for(int j=0;j<size;j++)
		{
			System.out.print(array[j]+" ");
		}
	}
	@Ignore
	@Test
	public void Table()

	{
		int a=1;
		for(int i=1;i<=10;i++)
		{
			a=i*8;
			System.out.print(a+" ");
		}
		int array[]=new int[10];
		int k=0;

		for(int i=1;i<=10;i++)
		{
			a=i*8;
			array[k]=a;
			k++;
		}
		for(int j=0;j<10;j++)
		{
			System.out.print(array[j]+" ");
		}
	}
	@Ignore
	@Test
	public void Sum()

	{
		int a=0; 
		for(int i=1;i<=10;i++)
		{
			int j=i*8;
			a=a+j;

		}
		System.out.println(a);
	}
	@Ignore
	@Test
	public void prime()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Integer");
		int a=scanner.nextInt();
		int flag=0;

		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				flag++;
			}
		}
		if(flag==0)
		{
			System.out.println("Given integer is prime Number");
		}
		else
		{
			System.out.println("Given integer is not prime Number");
		}
		scanner.close();

	}
	@Ignore
	@Test
	public void print()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Integer");
		int a=scanner.nextInt();


		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				System.out.print(i+" ");
			}
		}
		scanner.close();
	}
	@Ignore
	@Test
	public void Sqrt()
	{

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Integer");
		int a=scanner.nextInt();
		System.out.println("Square root of a Given Number" +Math.sqrt(a));
		scanner.close();
	}
	@Ignore
	@Test
	public void Palindrome()
	{
		StringBuffer sb=new StringBuffer("gag");
		String C=sb.toString();
		StringBuffer A=sb.reverse();
		String B=A.toString();
		if(C.equals(B))
		{
			System.out.println("palindrome ");
		}
		else
		{
			System.out.println("Not a palindrome");
		}

	}
	@Ignore
	@Test
	public void palindromeA()
	{
		String A="Gag";
		char[] chare=A.toCharArray();
		String B="";
		for(int i=chare.length-1;i>=0;i--)
		{
			B=B+chare[i];
		}
		if(A.equals(B))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}

	}
	@Ignore
	@Test
	public void palindromeB()

	{
		String A="123";
		char[] B=A.toCharArray();
		String C="";
		for(int i=B.length-1;i>=0;i--)
		{
			C=C+B[i];
		}
		if(A.equals(C))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}

	}
	@Ignore
	@Test
	public void sumA()
	{
		int A=2564;
		int sum=0;
		while(A>0)
		{
			int rem=A%10;
			sum=sum+rem;
			A=A/10;
		}
		System.out.println(sum);
	}
	@Ignore
	@Test
	public void MultiplicationA()

	{
		int A=2564;
		int mult=1;
		while(A>0)
		{
			int rem=A%10;
			mult=mult*rem;
			A=A/10;
		}
		System.out.println(mult);
	}
	@Ignore
	@Test
	public void even()
	{
		int A=1252354;
		int even=0;
		while(A>0)
		{
			int rem=A%10;
			if(rem%2==0)
			{
				even++;
			}
			A=A/10;
		}
		System.out.println(even);
	}
	@Ignore
	@Test
	public void swapingInMatrix()

	{
		int A[]= {1,2,3,4,5,6};
		int temp=A[0];
		A[0]=A[A.length-1];
		A[A.length-1]=temp;
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}


	}
	@Ignore
	@Test
	public void primeprint()

	{
		for(int i=0;i<10;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(!(i%j==0))
				{
					System.out.println(i);
				}
			}
		}

	}
	
	@Test
	public void Pascal()

	{
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<5-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	@Ignore
	@Test
	public void Pattern() 
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<5-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	

}


