package PracticeBDD.Julypractice;

public class StringVsStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Ganesha H N Bharadwaja");
		System.out.println(sb.reverse());
		System.out.println("******************************************");
		System.out.println(sb.capacity());
		System.out.println("*****************************************************");
		System.out.println(sb.charAt(0));
		System.out.println("********************************************************");
		System.out.println(sb.reverse());
		System.out.println("*******************************************************");
		System.out.println(sb.capacity());
		System.out.println("***************************************************");
		System.out.println(sb.charAt(0));
		System.out.println("*******************************************");
		System.out.println(sb.length());
		System.out.println("******************************************");
		System.out.println(sb.substring(7));
		System.out.println("*********************************************");
		System.out.println(sb.substring(0, 6));
		System.out.println("******************************************");
		System.out.println(sb.insert(0, "Hello"));
		System.out.println("******************************************");
		System.out.println(sb.delete(0, 5));
		System.out.println("******************************************************");
		System.out.println(sb.deleteCharAt(21));
		System.out.println("***********************************");
		System.out.println(sb.append("a"));
		System.out.println("**********************");
		System.out.println(sb.replace(0, 1, "Gani"));
		System.out.println("***************************************************************");
		System.out.println("***************************************************************");
		System.out.println("***************************************************************");
		System.out.println("***************************************************************");
		System.out.println("***************************************************************");
		System.out.println("***************************************************************");
		String A="Ganesha";
		System.out.println(A);
		System.out.println("--------------------------------------------------------");
		System.out.println(A.charAt(0));
		System.out.println("--------------------------------------------------------");	
		System.out.println(A.length());
		System.out.println("--------------------------------------------------------");
		System.out.println(A.substring(1));
		System.out.println("--------------------------------------------------------");
		System.out.println(A.substring(1, 3));
		System.out.println("--------------------------------------------------------");
		System.out.println(A.contains("a"));
		System.out.println("--------------------------------------------------------");
		System.out.println(A.contains("A"));
		System.out.println("--------------------------------------------------------");
		System.out.println(A.isEmpty());
		System.out.println("--------------------------------------------------------");
		System.out.println(A.replace("G", "g"));
		System.out.println("--------------------------------------------------------");
		System.out.println(A.replace("ga", "Ga"));
		System.out.println("--------------------------------------------------------");
		String[] B=A.split("");
		
		for(String Ba:B)
		{
			
			System.out.print(Ba+" ");
		}
		System.out.println("--------------------------------------------------------");
		System.out.println(A.indexOf("G"));
		System.out.println("--------------------------------------------------------");
		System.out.println(A.toLowerCase());
		System.out.println("--------------------------------------------------------");
		System.out.println(A.toUpperCase());
		System.out.println("--------------------------------------------------------");
		char[] Aa=A.toCharArray();
		for(char s:Aa)
		{
			System.out.print(s+" ");
		}
		System.out.println("--------------------------------------------------------");
		 
		
	
	}

}
