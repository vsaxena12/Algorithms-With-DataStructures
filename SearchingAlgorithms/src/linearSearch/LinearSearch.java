package linearSearch;

public class LinearSearch {
	/*
	 * Let us assume we are given an array where the order of the elements 
	 * is not known. That means the elements of the array are not sorted. 
	 * In this case, to search for an element we have to scan the
	 * complete array and see if the element is there in the given list or not.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {4,2,3,7,8,1,35,57,342,1,34,4};
		System.out.println(searchElementUnordered(arr1, 1));
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(searchElementUnordered(arr2, 5));
		
	}

	private static boolean searchElementUnordered(int[] arr, int data) {
		// TODO Auto-generated method stub
		for(int index=0; index<arr.length; index++) {
			if(arr[index] == data) {
				System.out.println("Arr: "+arr[index]);
				return true;
			}
		}
		return false;
	}
	
	private static boolean searchElementOrdered(int[] arr, int data) {
		// TODO Auto-generated method stub
		for(int index=0; index<arr.length; index++) {
			if(arr[index] == data) {
				System.out.println("Arr: "+arr[index]);
				return true;
			}else if(arr[index] > data){
				return false;
			}
		}
		return false;
	}

}
