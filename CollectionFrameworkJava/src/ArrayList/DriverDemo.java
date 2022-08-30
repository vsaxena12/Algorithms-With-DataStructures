package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class CollectionDemo {
	
	public static void collectionInterfaceMethods() {
		Collection<Integer> arrayList1 = new ArrayList<>();
		arrayList1.add(100);
		arrayList1.add(200);
		arrayList1.add(300);
		arrayList1.add(400);
		arrayList1.add(null);
		System.out.println("Collections in Array List 1: "+arrayList1);
		
		//Collection Interface searches for the object and not the index to remove an element
		arrayList1.remove(400);
		System.out.println("Collections in Array List 1: "+arrayList1+"\n");
	}
}

class ArrayListDemo {
	
	private static List<Integer> arrayList1 = new ArrayList<>();
	private static List<Integer> arrayList2 = new ArrayList<>();
	
	public static void arrayListMethods() {
			
		arrayList1.add(100);
		arrayList1.add(200);
		arrayList1.add(300);
		arrayList1.add(400);
		arrayList1.add(null);
		System.out.println("Array List 1: "+arrayList1);
		
		//List Interface searches for the index and not the object to remove an element
		arrayList1.remove(4);
		System.out.println("Array List 1: "+arrayList1);
		
		//Adding an element/ Object at a specific index
		arrayList1.add(0, null);
		System.out.println("Array List 1: "+arrayList1+"\n");
		
		//Replacing an element at a given index
		Integer setElement = arrayList1.set(1, 123); 
		System.out.println("Set Element: "+setElement); //Why it returns 100 instead of 123?
		System.out.println("Array List 1: "+arrayList1+"\n");
		
		//Get the element at a given index
		Integer getElement = arrayList1.get(1);
		System.out.println("Get Element: "+getElement);
		System.out.println("Array List 1: "+arrayList1+"\n");
		
		//Searches for the Element in an ArrayList and return true if the list CONTAINS the Element
		boolean isTrue = arrayList1.contains(400);
		System.out.println("Does Element Exists: "+isTrue+"\n");		
	}
	
	public static void arrayListBulkMethods() {
		//Bulk Operations - Similar to Venn Diagram
		System.out.println("BULK OPERATIONS");
		
		arrayList2.add(200);
		arrayList2.add(300);
		arrayList2.add(500);
		
		System.out.println("Array List 1: "+arrayList1);
		System.out.println("Array List 2: "+arrayList2);
		
		//Add All Elements from List1 and List2
		arrayList1.addAll(arrayList2);
		System.out.println("ArrayList1 Add All: "+arrayList1+"\n");
		
		//Remove all elements from List1, present in List2
		arrayList1.removeAll(arrayList2);
		System.out.println("Remove All Elements from List1 present in List2: "+ arrayList1+"\n");

		//Retaining common elements
		arrayList2.add(123);
		System.out.println("Array List 1: "+arrayList1);
		System.out.println("Array List 2: "+arrayList2);
		arrayList1.retainAll(arrayList2);
		System.out.println("Retain All Elements present in both List1 & List2: "+ arrayList1+"\n");
		
		//Add All Elements from List1 and List2 - again
		System.out.println("Array List 1: "+arrayList1);
		System.out.println("Array List 2: "+arrayList2);
		arrayList1.addAll(arrayList2);
		System.out.println("ArrayList1: "+arrayList1+"\n");
		
		System.out.println("arrayList1.set(2,2): "+arrayList1.set(2, 2));
		System.out.println("ArrayList1: "+arrayList1+"\n");
	}
	
	public static void arrayListSearchMethods() {
		System.out.println("SEARCH: ArrayList1: "+arrayList1);
		System.out.println("Search for element: 200 in an arraylist using contains() method: "+arrayList1.contains(200));
		System.out.println("Search for element: 300 in an arraylist using contains() method: "+arrayList1.contains(300)+"\n");
		
		System.out.println("Search for index of element: 200 in an arraylist using indexOf() method: "+arrayList1.indexOf(200));
		System.out.println("Search for index of element: 123 in an arraylist using indexOf() method: "+arrayList1.indexOf(123));
		System.out.println("Search for index of element: 300 in an arraylist using indexOf() method: "+arrayList1.indexOf(300));
		System.out.println("Search for index of element: 123 in an arraylist using lastIndexOf() method: "+arrayList1.lastIndexOf(123)+"\n");
	}
	
	public static void rangeView() {
		
		System.out.println("Range View: ArrayList1: "+arrayList1);
		List<Integer> arrayList3 = arrayList1.subList(1, 4); //1(including) & 4(excluding) are indexes
		System.out.println("List3: "+arrayList3);
		
		arrayList3.add(0,7);
		System.out.println("List3: "+arrayList3); //If changes happens in list3, it also gets reflected in list1
		System.out.println("List1: "+arrayList1);
		
		
	}
	
	
}

public class DriverDemo {
	
	public static void main(String[] args) {
		CollectionDemo.collectionInterfaceMethods();
		
		ArrayListDemo.arrayListMethods();
		ArrayListDemo.arrayListBulkMethods();
		ArrayListDemo.arrayListSearchMethods();
		ArrayListDemo.rangeView();
		
	}
}
