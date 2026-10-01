import java.util.Scanner;

public class MoveZeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		int n = sc.nextInt();
		
		System.out.println("Enter array elements: ");
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int index = 0;
		
		for(int i=0; i<n; i++) {
			
			if(arr[i] != 0) {
				arr[index] = arr[i];
				index++;
			}		
		}
		
		while(index < n) {
			arr[index] = 0;
			index++;
		}
		
		System.out.println("Array after moving zeros: ");
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}

//Time complexity: O(n)
//Space complexity: O(n)
//Auxiliary space: O(1)
