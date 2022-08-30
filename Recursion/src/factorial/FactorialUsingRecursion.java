package factorial;

public class FactorialUsingRecursion {
	
	static long factorial(int num) {
		if(num == 0 || num == 1)
			return 1;
		else {
			return num * factorial(num - 1); 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long factorialValue = factorial(5);
		System.out.println("Factorial Value: "+factorialValue);
	}

}
