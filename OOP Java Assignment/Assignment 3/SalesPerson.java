
public class SalesPerson extends Employee {
	
	public static final long serialVersionUID = 1L;
	
	SalesPerson(int id, String name, double salary){
		super(id, name, salary);
	}
	
	void diaplay() {
		System.out.println("Type: Sales Person");
	}
	
	String getType() {
		return "Sales Person";
	}

}
