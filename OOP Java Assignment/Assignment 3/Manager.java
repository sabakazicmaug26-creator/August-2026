
public class Manager extends Employee {
	
	private static final long serialVersionUID = 1L;
	
	Manager(int id, String name, double salary){
		super(id, name, salary);
	}
	
	void display() {
		System.out.println("Type: Manager");
		super.display();
	}
	
	String getType() {
		return "Manager";
	}

}
