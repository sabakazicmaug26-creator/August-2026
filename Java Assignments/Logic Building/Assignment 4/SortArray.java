import java.util.Scanner;
import java.util.Arrays;

class SortArray{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

int[] num = new int[5];

System.out.println("Enter 5 integers: ");
for(int i=0; i<5; i++){
num[i] = sc.nextInt();
}
Arrays.sort(num);
System.out.println("Sorted element of array is ");

for (int n : num) {
System.out.println(n);
}
}
}