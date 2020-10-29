class Employee
{
int empid;
String empname;
int salary;
int phonenumber;
long pannumber;
Employee(int empid,String empname,int salary,long phonenumber,long pannumber){
this.empid=empid;
this.empname=empname;
this.salary=salary;
this.phonenumber=phonenumber;
this.pannumber=pannumber;
}
void display()
{
System.out.println("Employeeid="+empid);
System.out.println("Employee name="+empname);
System.out.println("Salary="+salary);
System.out.println("Phonenumber="+phonenumber);
System.out.println("Pannumber="+pannumber);
}
}
class Constructor3
{
public static void main(String args[]){
Employee mahesh=new Employee(202,"suresh",8884,7894657,6754897342667l);
Employee suresh=new Employee(678,"mahesh",7895,764589,423456789l);
}
}


