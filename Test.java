class Student
{
String name;
int id;
int phonenum;
String address;
int age;

}
class Employee
{
String name;
int age;
int phonenum;
String address;
int id;

}
public class Test
{
public static void main(String args[])
{
Student pushpa=new Student();
pushpa.name="latha";
pushpa.id=12;
pushpa.phonenum=7865423;
pushpa.address="Hyderabd";
pushpa.age=23;
System.out.println("======Student Details====");
System.out.println("Studentname="+pushpa.name);
System.out.println("id:"+pushpa.id);
System.out.println("phonenum:"+pushpa.phonenum);
System.out.println("age:"+pushpa.age);
Employee latha=new Employee();
latha.name="karthik";
latha.age=12;
latha.phonenum=1234567;
latha.address="guntur";
latha.id=123;
System.out.println("======Employee Details====");
System.out.println("employeename="+latha.name);
System.out.println("age:"+latha.age);
System.out.println("phonenum:"+latha.phonenum);
System.out.println("address:"+latha.address);
System.out.println("id:"+ latha.id);

}
}







