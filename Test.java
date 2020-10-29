import java.util.Scanner;
class Student
{
String name;
int id;
int phonenum;
String address;
int age;
}
public class Test
{
public static void main(String args[])
{
Student pushpa=new Student();
Scanner sc=new Scanner(System.in);
System.out.println("enter student details"); 
pushpa.name=sc.nextLine();
pushpa.id=sc.nextInt();
pushpa.phonenum=sc.nextInt();
pushpa.address=sc.next();
pushpa.age=sc.nextInt();
System.out.println("======Student Details====");
System.out.println("Studentname="+pushpa.name);
System.out.println("id:"+pushpa.id);
System.out.println("phonenum:"+pushpa.phonenum);
System.out.println("age:"+pushpa.age);
}
}







