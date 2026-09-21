import java.util.ArrayList;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		// 1. Add elements
		list.add("Blue");
		list.add("Red");
		list.add("Pink");
		list.add("Yellow");
		list.add("Black");
		list.add("White");
		System.out.println(list);
		
		// 2. Add element at first position
		list.add(0, "Purple");
		System.out.println(list);
		
		// 3. Retrieve element
		String element = list.get(4);
		System.out.println(element);
		
		// 4. Update element
		list.set(2, "Orange");
		System.out.println(list);
		
		// 5. Remove element
		list.remove(2);
		System.out.println(list);
		
		// 6. Search element from list
		String search = "Black";
		if(list.contains(search)) {
			System.out.println(search + " found");
		} else {
			System.out.println(search + " not found");
		}
		
		// 7. Sort array list
		Collections.sort(list);
		System.out.println(list);
		
		// 8. Copy one list to another
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add(" ");
		list2.add(" ");
		list2.add(" ");
		list2.add(" ");
		list2.add(" ");
		list2.add(" ");
		list2.add(" ");
		
		Collections.copy(list2, list);
		System.out.println(list2);
		
		// 9. Shuffle elements
		Collections.shuffle(list);
		System.out.println(list);
		
		// 10. Reverse elements
		Collections.reverse(list);
		System.out.println(list);	

	}

}
