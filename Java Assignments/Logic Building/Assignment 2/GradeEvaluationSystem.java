class GradeEvaluationSystem{
public static void main(String args[]){

int phy = 75;
int chem = 86;
int bio = 90;

int avg = (phy + chem + bio)/3;
System.out.println(avg);

if (avg>=90)
System.out.println("Grade A");

else if (avg>70 && avg<89)
System.out.println("Grade B");

else if (avg>50 && avg<69)
System.out.println("Grade C");

else if (avg>30 && avg<49)
System.out.println("Grade C");

else
System.out.println("Fail");


}
}