package vadvadva;

public class myClass {
	
	public static void main(String[] args) 
	{
		int number = 10;
		System.out.print("Fibonacci Series of "+number+" numbers: ");
		for(int i = 0; i < number; i++)
		{
			System.out.print(FibonacciSeries(i) +" ");
		} 
	}
	
	public static int FibonacciSeries(int number)
	{
		if(number == 0) return 0;
		if(number == 1 || number == 2) return 1;		
			return FibonacciSeries(number-2) + FibonacciSeries(number-1);
	}
}
