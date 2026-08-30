import java.util.Scanner;

class AverageArrayElements{
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
double avg = (double) sum/num.length;
System.out.println("The average of the numbers is: " + avg);
}
}