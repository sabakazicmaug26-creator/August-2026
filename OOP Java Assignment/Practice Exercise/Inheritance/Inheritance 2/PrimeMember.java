
public class PrimeMember extends Member {
	
	private int joiningYear;
	private double joiningFees;
	private boolean isActive;
	
	// Accessor get
	public int getJoiningYear() {
		return joiningYear;
	}
	
	public double getJoiningFees() {
		return joiningFees;
	}
	
	public boolean getIsActive() {
		return isActive;
	}
	
	// Mutator set
	public void setJoiningYear(int joiningYear) {
		this.joiningYear = joiningYear;
	}
	
	public void setJoiningFees(double joiningFees) {
		this.joiningFees = joiningFees;
	}
	
	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	void display() {
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Phone number: " + getPhone_no());
		System.out.println("Address: " + getAddress());
		System.out.println("Salary: " + getSalary());
		
		System.out.println("Joining Year: " + getJoiningYear());
		System.out.println("Joining Fees: " + getJoiningFees());
		System.out.println("Is Active: " + getIsActive());
		
	}

}
