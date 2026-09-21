import java.io.*;
import java.util.*;

public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	int id;
	String name;
	double salary;
	
	Employee(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void display() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}
	
	String getType() {
		return "Employee";
	}

}
