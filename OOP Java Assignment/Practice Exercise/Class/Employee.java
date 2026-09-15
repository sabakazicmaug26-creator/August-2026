public class Employee {
	
	double salary;
	int workingHour;
	
	void getInfo(double salary, int workingHour){
		this.salary = salary;
		this.workingHour = workingHour;
	}
	
	void addSal() {
			if(salary<500)
			salary += 10;							
	}
	
	void addWork() {
			if(workingHour>6)
			salary += 5;
	}
	
	void display() {
		System.out.println("Final Salary:" + salary);
	}
	
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.getInfo(400.0, 5);
		e1.addSal();
		e1.addWork();
		e1.display();
		
		Employee e2 = new Employee();
		e2.getInfo(750.0, 7);
		e2.addSal();
		e2.addWork();
		e2.display();

	}

}