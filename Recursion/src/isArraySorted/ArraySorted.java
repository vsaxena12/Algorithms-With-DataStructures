package isArraySorted;

public class ArraySorted {
	
	static boolean isSortedArray(int[] arr, int n) {
		if(n == 1 || n == 0)
			return true;
		else if(arr[n-1] < arr[n-2]){
			return false; 
		}
		return isSortedArray(arr, n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int n = arr.length;
		boolean isSorted = isSortedArray(arr,n);
		System.out.println(isSorted);
	}

}
