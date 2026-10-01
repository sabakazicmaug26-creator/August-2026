import java.util.ArrayList;

public class Student<T> {
	
	ArrayList<T> list = new ArrayList<>();
	
	// add
	public void enqueue(T data) {
		list.add(data);
	}
	
	
	// remove
	public T dequeue() {
		if(list.isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		return list.remove(0);
	}
	
	
	// view front
	public T peek() {
		if(list.isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		return list.get(0);
	}
	
	
	// empty
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	// size
	public int size() {
		return list.size();
	}
	
	
	// search
	public boolean search(T key) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).equals(key)) {
				return true;
			}
		}
		return false;
	}
	

	public static void main(String[] args) {
		
		Student<Integer> s = new Student<>();
		
		s.enqueue(101);
		s.enqueue(107);
		s.enqueue(121);
		s.enqueue(111);
		s.enqueue(119);
		s.enqueue(127);
		
		System.out.println("Initial queue: " + s.list);
		
		System.out.println("Student " + s.dequeue() + " submits.");
		
		System.out.println("Queue becomes: " + s.list);
		
		int id = 101;
		
		System.out.println("Search: ");
		System.out.println("Enter Student ID: " + id);
		
		if(s.search(id)) {
			System.out.println("Student " + id + " is waiting");
		}
		else {
			System.out.println("Student " + id + " is not waiting");
		}
		
		System.out.println("Current number of students: " + s.size());

	}

}

// Time Complexity
// Add Student: O(1)
// Remove Student: O(n)
// Search Student: O(n)
// Display Queue: O(n)
// Count Students: O(1)


