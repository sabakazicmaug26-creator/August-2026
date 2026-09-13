
public class Engineer extends Employee {
	
	private String specialization;
	
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	public void display() {
		System.out.println("Type: Engieer");
		super.display();
		System.out.println("Specialization: " + specialization);
	}

}
