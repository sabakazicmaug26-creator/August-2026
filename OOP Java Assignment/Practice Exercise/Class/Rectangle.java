
public class Rectangle {
	
	int l1;
	int b1;
	int l2;
	int b2;
	
	Rectangle(int l1, int b1, int l2, int b2){
		this.l1 = l1;
		this.b1 = b1;
		this.l2 = l2;
		this.b2 = b2;		
	}

	public static void main(String[] args) {
		
		Rectangle a = new Rectangle(4, 5, 5, 8);
		
		int area1 = a.l1 * a.b1;
		int area2 = a.l2 * a.b2;
		
		System.out.println("Area of Rectangle 1 = " + a.l1 + " x " + a.b1 + " = " + area1);
		System.out.println("Area of Rectangle 2 = " + a.l2 + " x " + a.b2 + " = " + area2);
		
	}
}
