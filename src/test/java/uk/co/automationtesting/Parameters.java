package uk.co.automationtesting;

public class Parameters {
	{  
		@Test  
		@Parameters({"a","b"})  
		public void add(int c, int d)  
		{  
		int sum=c+d;  
		System.out.println("Sum of two numbers : "+sum);  
		}  
		}  

}
