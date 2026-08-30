import java.util.Scanner;

class InputPositiveNumber{

static int askForPositiveNumber(){
Scanner sc = new Scanner(System.in);

int n;

do{
System.out.println("Enter a number: ");
n = sc.nextInt();
}
while (n<0);

System.out.println("You entered a positive number: " + n + ".");
return n;
}
public static void main(String args[]){
askForPositiveNumber();
}
}