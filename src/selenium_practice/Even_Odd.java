package selenium_practice;

public class Even_Odd {

	public static void main(String[] args) {
		for(int i=0;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even number: " + i);
			}
			if(i%2!=0)
			{
				System.out.println("Odd number: " + i);
			}
		}
	}

}
