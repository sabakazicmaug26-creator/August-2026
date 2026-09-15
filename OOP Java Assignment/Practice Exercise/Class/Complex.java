import java.util.Scanner;
public class Complex {
	int r1;
	int i1;
	int r2;
	int i2;
	
	Complex(int r1, int i1, int r2, int i2){
		this.r1 = r1;
		this.i1 = i1;
		this.r2 = r2;
		this.i2 = i2;		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first real no: ");
		int r1 = sc.nextInt();
		System.out.println("Enter first imaginary no: ");
		int i1 = sc.nextInt();
		System.out.println("Enter second real no: ");
		int r2 = sc.nextInt();
		System.out.println("Enter second imaginary no: ");
		int i2 = sc.nextInt();
		
		System.out.println("First Complex Number is " + r1 + " + " + i1 + "i");
		System.out.println("Second Complex Number is " + r2 + " + " + i2 + "i");
		
		Complex c = new Complex(r1, i1, r2, i2);
		
		int sumR = r1 + r2;
		int sumI = i1 + i2;
		
		int diffR = r1 - r2;
		int diffI = i1 - i2;
		
		int prodR1 = r1 * r2;
		int prodR2 = i1 * i2;
		int prodR = prodR1 - prodR2;
		int prodI1 = r1 * i2;
		int prodI2 = i1 * r2;
		int prodI = prodI1 - prodI2;
		
		System.out.println("Sum of Complex Number = " + sumR + " + " + sumI + "i");
		System.out.println("Difference of Complex Number = " + diffR + " + " + diffI + "i");
		System.out.println("Product of Complex Number = " + prodR + " + " + prodI + "i");
		
	}

}
