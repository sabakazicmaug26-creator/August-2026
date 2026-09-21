import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class EmployeeList implements Serializable {
	
	public static final long serialVersionUID = 1L;
	
	Node head;
	Node tail;
	
	transient Node current;
	
	
	// Add Employee
	void addEmployee(Employee employee) {

        Node newNode = new Node(employee);

        if (head == null) {

            head = newNode;
            tail = newNode;

        } else {

            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }

        current = head;

        System.out.println("\nEmployee added successfully.");
    }
	
	
	// Display all employee
	void displayAll() {

        if (head == null) {
            System.out.println("\nNo employees found.");
            return;
        }

        Node temp = head;

        System.out.println("\n========== ALL EMPLOYEES ==========");

        while (temp != null) {

            temp.e.display();

            System.out.println("--------------------------------");

            temp = temp.next;
        }
    }
	
	
	// Display first employee
	void firstEmployee() {

        if (head == null) {
            System.out.println("\nNo employees found.");
            return;
        }

        current = head;

        System.out.println("\n========== FIRST EMPLOYEE ==========");
        current.e.display();
    }
	
	
	// Display next employee
	void nextEmployee() {

        if (current == null) {

            if (head == null) {
                System.out.println("\nNo employees found.");
                return;
            }

            current = head;

        } else if (current.next != null) {

            current = current.next;

        } else {

            System.out.println("\nAlready at the last employee.");
            return;
        }

        System.out.println("\n========== NEXT EMPLOYEE ==========");
        current.e.display();
    }
	
	
	// Display previous employee
	void previousEmployee() {

        if (current == null) {

            if (tail == null) {
                System.out.println("\nNo employees found.");
                return;
            }

            current = tail;

        } else if (current.previous != null) {

            current = current.previous;

        } else {

            System.out.println("\nAlready at the first employee.");
            return;
        }

        System.out.println("\n========== PREVIOUS EMPLOYEE ==========");
        current.e.display();
    }
	
	
	// Display last employee
	void lastEmployee() {

        if (tail == null) {
            System.out.println("\nNo employees found.");
            return;
        }

        current = tail;

        System.out.println("\n========== LAST EMPLOYEE ==========");
        current.e.display();
    }
	
	
	// Display employee by type
	 void displayByType(String type) {

	        if (head == null) {
	            System.out.println("\nNo employees found.");
	            return;
	        }

	        Node temp = head;
	        boolean found = false;

	        System.out.println("\n========== " + type.toUpperCase() + "S ==========");

	        while (temp != null) {

	            if (temp.e.getType().equals(type)) {

	                temp.e.display();

	                System.out.println("--------------------------------");

	                found = true;
	            }

	            temp = temp.next;
	        }

	        if (!found) {
	            System.out.println("No " + type + " found.");
	        }
	    }
	 
	 
	 // Sort ascending
	 void sortAscending() {

	        if (head == null) {
	            System.out.println("\nNo employees found.");
	            return;
	        }

	        for (Node i = head; i != null; i = i.next) {

	            for (Node j = i.next; j != null; j = j.next) {

	                if (i.e.name.compareToIgnoreCase(
	                        j.e.name) > 0) {

	                    Employee temp = i.e;
	                    i.e = j.e;
	                    j.e = temp;
	                }
	            }
	        }

	        current = head;

	        System.out.println("\nEmployees sorted in ascending order.");

	        displayAll();
	    }
	 
	 
	 // Sort descending
	 void sortDescending() {

	        if (head == null) {
	            System.out.println("\nNo employees found.");
	            return;
	        }

	        for (Node i = head; i != null; i = i.next) {

	            for (Node j = i.next; j != null; j = j.next) {

	                if (i.e.name.compareToIgnoreCase(
	                        j.e.name) < 0) {

	                    Employee temp = i.e;
	                    i.e = j.e;
	                    j.e = temp;
	                }
	            }
	        }

	        current = head;

	        System.out.println("\nEmployees sorted in descending order.");

	        displayAll();
	    }
	 
	 
	 // Save to file
	 void saveToFile(String fileName) {

	        try {

	            FileOutputStream fos =
	                    new FileOutputStream(fileName);

	            ObjectOutputStream oos =
	                    new ObjectOutputStream(fos);

	            oos.writeObject(this);

	            oos.close();
	            fos.close();

	            System.out.println("\nEmployees saved successfully.");

	        } catch (IOException e) {

	            System.out.println("\nError while saving file.");
	            System.out.println(e.getMessage());
	        }
	    }
	 
	 
	 // Load from file
	 static EmployeeList loadFromFile(String fileName) {

	        try {

	            FileInputStream fis =
	                    new FileInputStream(fileName);

	            ObjectInputStream ois =
	                    new ObjectInputStream(fis);

	            EmployeeList list =
	                    (EmployeeList) ois.readObject();

	            ois.close();
	            fis.close();

	            list.current = list.head;

	            System.out.println("\nEmployees loaded successfully.");

	            return list;

	        } catch (FileNotFoundException e) {

	            System.out.println("\nFile not found.");
	            return null;

	        } catch (IOException e) {

	            System.out.println("\nError while loading file.");
	            System.out.println(e.getMessage());
	            return null;

	        } catch (ClassNotFoundException e) {

	            System.out.println("\nEmployee class not found.");
	            return null;
	        }
	    }
}	

