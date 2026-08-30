import java.util.Scanner;
import java.util.Arrays;

class SearchArrayIndex{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

int[] num = new int[5];

System.out.println("Enter 5 integers: ");
for(int i=0; i<5; i++){
num[i] = sc.nextInt();
}
Arrays.sort(num);

System.out.println("Enter the number to search: ");
int srch = sc.nextInt();

int index = Arrays.binarySearch(num, srch);

if(index>=0)
System.out.println("Index: " + index);
else
System.out.println("Not Found");
}
}