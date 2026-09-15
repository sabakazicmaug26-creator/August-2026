
public class Rectangle {
	
	int l;
	int b;
	
	Rectangle(int l, int b){
		this.l = l;
		this.b = b;
	}
	
	void printArea() {
		int area = l*b;
		System.out.println("Area of Rectangle = " + area);
	}
	
	void printPerimeter() {
		int p = l+b;
		int perimeter = 2*p;
		System.out.println("Perimeter of Rectangle = " + perimeter);
	}
	
}
