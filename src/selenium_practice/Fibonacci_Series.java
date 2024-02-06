package selenium_practice;

public class Fibonacci_Series {
	
public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		for(int i=0;i<=10;i++)
		{
			int sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum+ " ");
		}
	}
}
