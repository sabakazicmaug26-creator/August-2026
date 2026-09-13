
public class Manager extends Employee {
	
	private String department;
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public void display() {
		System.out.println("Type: Manager");
		super.display();
		System.out.println("Department: " + department);
	}
}
