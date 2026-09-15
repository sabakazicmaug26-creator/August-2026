
public class Triangle {
	
	int side1 = 3;
	int side2 = 4;
	int side3 = 5;
	
	Triangle(int side1, int side2, int side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;		
	}	


	public static void main(String[] args) {
		
		Triangle t = new Triangle(3, 4, 5);
		
		int perimeter = t.side1 + t.side2 + t.side3;
		
		double s = perimeter / 2;
		double area = Math.sqrt(s*(s - t.side1)*(s - t.side2)*(s - t.side3));
		
		System.out.println("Perimeter of triangle = " + perimeter);
		System.out.println("Area of triangle = " + area);		

       }
}

