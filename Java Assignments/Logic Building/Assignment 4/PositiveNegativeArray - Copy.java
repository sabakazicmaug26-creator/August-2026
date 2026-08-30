import java.util.Scanner;

class PositiveNegativeArray{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

int[] num = new int[6];

System.out.println("Enter 6 integers: ");

for(int i=0; i<6; i++){
num[i] = sc.nextInt();
}
int positive = 0;
int negative = 0;

for(int n : num){

if(n>=0)
positive++;
else
negative++;
}
System.out.println("Positive numbers: " + positive);
System.out.println("Negative numbers: " + negative);

}
}