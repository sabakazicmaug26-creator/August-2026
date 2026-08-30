import java.util.Scanner;

class AgeChecker{
static void checkAgeCategory(){
Scanner sc = new Scanner(System.in);

System.out.println("Enter your age:");
int age = sc.nextInt();

if(age<18)
System.out.println("You are a Minor");

else if (age>=18 && age<=60)
System.out.println("You are an Adult");

else
System.out.println("You are a Senior citizen");
}

public static void main(String args[]){
checkAgeCategory();
}
}