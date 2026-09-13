
public class SalesPerson extends Employee {
	
	private double commision;
	
	public double getCommision() {
		return commision;
	}
	public void setCommision(double commision) {
		this.commision = commision;
	}
	
	public void display() {
		System.out.println("Type: Sales Person");
		super.display();
		System.out.println("Commision: " + commision);
	}

}
