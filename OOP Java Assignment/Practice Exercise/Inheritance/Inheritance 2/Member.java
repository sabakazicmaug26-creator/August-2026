
public class Member {
	
	private String name;
	private int age;
	private String phone_no;
	private String address;
	private double salary;
	
	// Accessor get
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPhone_no() {
		return phone_no;
	}
	
	public String getAddress() {
		return address;
	}
	
	public double getSalary() {
		return salary;
	}
	
	// Mutator set
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setPhoneNo(String phone_no) {
		this.phone_no = phone_no;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void printSalary() {
		System.out.println("Salary is " + salary);
	}

}
