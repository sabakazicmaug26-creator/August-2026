import java.util.Scanner;
import java.util.Arrays;

class SearchArrayElement{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

Integer[] num = new Integer[5];

System.out.println("Enter 5 integers: ");
for(int i=0; i<5; i++){
num[i] = sc.nextInt();
}
System.out.println("Enter the number to search: ");
Integer srch = sc.nextInt();

if(Arrays.asList(num).contains(srch))
System.out.println(srch + "Found");
else
System.out.println(srch + "Not Found");
}
}