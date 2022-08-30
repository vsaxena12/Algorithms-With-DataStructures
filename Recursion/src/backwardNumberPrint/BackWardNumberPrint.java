package backwardNumberPrint;

public class BackWardNumberPrint {
	
	static int print(int num) {
		if(num == 0) {
			return 0;
		}
		else {
			System.out.print(num+" ");
			return print(num - 1);
		}
	}
	public static void main(String[] args) {
		System.out.print("Print: ");
		print(5);
		System.out.print("\n");
	}
}
