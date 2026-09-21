
public class Engineer extends Employee {
	
	private static final long serialVersionUID = 1L;
	
	Engineer(int id, String name, double salary){
		super(id, name, salary);
	}
	
	void display() {
		System.out.println("Type: Engineer");
		super.display();
	}
	
	String getType() {
		return "Engineer";
	}

}
