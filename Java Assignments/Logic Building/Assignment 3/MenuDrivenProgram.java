import java.util.Scanner; 

class MenuDrivenProgram{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
int choice;

do {
System.out.println("Enter your choice:");
System.out.println("1. Grade Evaluation System");
System.out.println("2. Leap Year Check");
System.out.println("3. Day of the week");
System.out.println("4. Identify Default Values of Variables");
System.out.println("5. Exit");
System.out.println("Enter your choice: ");
choice = sc.nextInt();

switch(choice){
case 1:
System.out.println("1. Grade Evaluation System");
System.out.println("Enter your marks in Maths");
int m = sc.nextInt();
System.out.println("Enter your marks in Science");
int s = sc.nextInt();
System.out.println("Enter your marks in History");
int h = sc.nextInt();

int avg = m+s+h/3;
System.out.println("Average Marks: "+ avg);

if (avg>=90)
System.out.println("Grade A");
else if (avg>70 && avg <89)
System.out.println("Grade B");
else if (avg>50 && avg <69)
System.out.println("Grade C");
else if (avg>30 && avg <49)
System.out.println("Grade D");
else
System.out.println("Fail");
break;


case 2:
System.out.println("2. Leap Year Check");
System.out.println("Enter the year: ");
int y = sc.nextInt();

if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
System.out.println(y + " is a Leap Year.");
else
System.out.println(y + " is not a Leap Year.");
break;


case 3:
System.out.println("3. Day of the week");
System.out.println("Day number: ");
int day = sc.nextInt();

switch(day){
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tueday");
break;
case 3:
System.out.println("Wednesday");
break;
case 4:
System.out.println("Thursday");
break;
case 5:
System.out.println("Friday");
break;
case 6:
System.out.println("Saturday");
break;
case 7:
System.out.println("Sunday");
break;
default:
System.out.println("Invalid Day");
break;
}
break;


case 4: 
System.out.println("4. Identify Default Values of Variables");
System.out.println("Enter your age: ");
byte age = sc.nextByte();
System.out.println("Enter your marks: ");
short marks = sc.nextShort();
System.out.println("Enter your salary: ");
int salary = sc.nextInt();
System.out.println("Enter population of your area: ");
long population = sc.nextLong();
System.out.println("Enter price of product: ");
float price = sc.nextFloat();
System.out.println("Enter your percentage: ");
double percentage = sc.nextDouble();
System.out.println("Enter your name: ");
char name  = sc.next().charAt(0);
System.out.println("Are you pass? ");
boolean isPassed = sc.nextBoolean();
break;


case 5:
System.out.println("5. Exit");
break;
}
}
while (choice != 5);
sc.close();
}
}