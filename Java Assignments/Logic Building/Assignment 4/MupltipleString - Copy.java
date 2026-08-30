class MupltipleString{
public static void main(String args[]){

String str1 = "java";
String str2 = "java";
String str3 = "java";

System.out.println("All strings point to the same object: " + (str1 == str2 && str1 == str3 && str2 == str3));
}
}