import java.util.Scanner;

class SumOfTwoNumbers{

static int SumOfTwoNumbers(int a, int b){
return a+b;
}

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter first number: ");
int first = sc.nextInt();

System.out.println("Enter second number: ");
int second = sc.nextInt();

int sum = SumOfTwoNumbers(first, second);

System.out.println("The sum of " + first + " and " + second + " is " + sum + ".") ;
}
}