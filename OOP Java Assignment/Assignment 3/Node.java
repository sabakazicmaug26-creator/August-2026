import java.io.Serializable;

public class Node implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	Employee e;
	
	Node previous;
	Node next;
	
	Node(Employee e){
		this.e = e;
		this.previous = null;
		this.next = null;
	}

}
