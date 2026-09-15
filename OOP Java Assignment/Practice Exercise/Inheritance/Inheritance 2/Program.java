
public class Program {

	public static void main(String[] args) {
		
		PrimeMember pm = new PrimeMember();
		
		System.out.println("Enter name: ");
		pm.setName(ConsoleInput.getString());
		
		System.out.println("Enter age: ");
		pm.setAge(ConsoleInput.getInt());
		
		System.out.println("Enter address: ");
		pm.setAddress(ConsoleInput.getString());
		
		System.out.println("Enter phone number: ");
		pm.setPhoneNo(ConsoleInput.getString());
		
		System.out.println("Enter salary: ");
		pm.setSalary(ConsoleInput.getDouble());
		
		System.out.println("Enter joining year: ");
		pm.setJoiningYear(ConsoleInput.getInt());
		
		System.out.println("Enter joining fees: ");
		pm.setJoiningFees(ConsoleInput.getDouble());
		
		System.out.println("Is active (true/false): ");
		pm.setIsActive(ConsoleInput.getBoolean());
		
		
		System.out.println("===== Members Details =====");
		pm.display();
		
		System.out.println("===== Salary Detail =====");
		pm.printSalary();
		
	}

}
