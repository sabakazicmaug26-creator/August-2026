
public class EmployeeList {
	
	Node head;
	Node tail;
	Node current;
	
	public void add(Employee e) {
		Node newNode = new Node(e);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
			current = newNode;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
		}
	}
	
	public void displayAll() {
		
		if(head == null) {
			System.out.println("No employee found")
			return;
		}
		
		Node temp = head;
		
		while(temp != null) {
			temp.e.display();
			System.out.println("====================");
			temp = temp.next;
		}
	}
	
	// First employee
	public void first() {
		
		if(head == null) {
			System.out.println("No employee found");
			return;
		}
		current = head;
		current.e.display();
	}
	
	// Next employee
    public void next() {
		
		if(current == null) {
			System.out.println("No employee found");
			return;
		}
		if(current.next == null){
			System.out.println("Already at last employee");
			return;
		}
		current = current.next;
		current.e.display();			
	}
    
    // Previous employee
    public void previous() {
		
		if(current == null) {
			System.out.println("No employee found");
			return;
		}
		if(current.previous == null){
			System.out.println("Already at first employee");
			return;
		}
		current = current.previous;
		current.e.display();			
	}
    
    // Last employee
    public void last() {
    	     
        if(tail == null) {
        	    System.out.println("No employee found");
        	    	return;
        }
        
        current = tail;
        current.e.display();
    }
}
