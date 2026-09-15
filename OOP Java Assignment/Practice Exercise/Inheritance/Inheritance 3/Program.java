
public class Program {

	public static void main(String[] args) {
		
		int l = 5;
		int b = 6;
		Rectangle r = new Rectangle(l, b);
		
		int s = 4;
		Square sq = new Square(s);
		
		System.out.println("===== Rectangle ===== ");
		r.printArea();
		r.printPerimeter();
		
		System.out.println("===== Square ===== ");
		sq.printArea();
		sq.printPerimeter();

	}

}
