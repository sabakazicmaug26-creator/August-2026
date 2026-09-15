class Student{
	String name;
	int roll_no;
	String phone_no;
	String address;	
}


public class Program {

	public static void main(String[] args) {
		
		Student s1 = new Student();		
		s1.roll_no = 2;
		s1.name = "John";
		s1.address = "Andheri";
		s1.phone_no = "0987654321";
		
		
		Student s2 = new Student();
		s2.roll_no = 1;
		s2.name = "Sam";
		s2.address = "Bandra";
		s2.phone_no = "1234567890";
		
		System.out.println("Name: " + s1.name + ", Roll no: " + s1.roll_no + ", Address: " + s1.address + ", Phone no: " + s1.phone_no);
		System.out.println("Name: " + s2.name + ", Roll no: " + s2.roll_no + ", Address: " + s2.address + ", Phone no: " + s2.phone_no);
			

	}

}
