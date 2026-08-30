import java.util.Scanner;

class SumArray{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

int[] num = new int[5];

System.out.println("Enter 5 integers: ");
for(int i=0; i<5; i++){
num[i] = sc.nextInt();
}
int sum = 0;

for(int n : num){
sum = sum + n;
}
System.out.println("The sum of all numbers is: " + sum);
}
}