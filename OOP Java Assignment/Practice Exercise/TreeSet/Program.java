import java.util.TreeSet;
public class Program {

	public static void main(String[] args) {
		TreeSet<String> color = new TreeSet<String>();
		
		// 1. Add elements
		color.add("Pink");
		color.add("Blue");
		color.add("Red");
		color.add("Green");
		
		System.out.println(color);
		
		// 2. Add all elements
		TreeSet<String> color1 = new TreeSet<String>();
		
		color1.add("Black");
		color1.add("White");
		color1.add("Yellow");
		
		color1.addAll(color);
		System.out.println(color1);
		
		// 3. Reverse order view
		System.out.println(color.descendingSet());
		
		// 4. First and last element
		System.out.println(color.first());
		System.out.println(color.last());
		
		// 5. Greater than or equal element
		System.out.println(color.ceiling("Orange"));
		System.out.println(color.ceiling("Q"));
	}

}
