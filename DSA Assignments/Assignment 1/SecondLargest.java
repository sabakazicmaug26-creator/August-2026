import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		
		if(n<=2) {
			System.out.println("To find second largest element, array size must be greater than 2. ");
		}
		
		System.out.println("Enter array elements: ");
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int largest = arr[0];
		int secondlargest = arr[0];
		
		for(int i=1; i<n; i++) {
			
			if(arr[i] > largest) {
				secondlargest = largest;
				largest = arr[i];
			}
			
			if(arr[i] > secondlargest && arr[i] != largest) {
				secondlargest = arr[i];
			}
		}
		
		System.out.println("Second largest element: " + secondlargest);

	}
}

// Time complexity: O(n)
// Space complexity: O(n)
// Auxiliary space: O(1)
