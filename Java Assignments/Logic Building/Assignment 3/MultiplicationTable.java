import java.util.Scanner;

class MultiplicationTable{

static int printMultiplicationTable(){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number: ");
int n = sc.nextInt();

for(int i = 1; i<=10; i++){
System.out.println(n + " x " + i + " = " + n*i);
}
return n;
}
public static void main(String args[]){
printMultiplicationTable();
}
}