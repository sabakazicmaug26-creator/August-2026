import java.util.Scanner;

class PrintElementsArray{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

int[] number = new int[5];

System.out.println("Enter 5 integers: ");

for(int i=0; i<5; i++){
number[i] = sc.nextInt();
}

for(int n : number){
System.out.println(n);
}
}
}