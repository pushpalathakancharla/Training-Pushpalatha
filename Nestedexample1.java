class University
{
 static class Department
{
 void annuoncement()
{
System.out.println("Exam start from 1st Dec");
}
static void prepraing()
{
System.out.println(" prepraing for Exam ");
}
}
}
class Nestedexample1
{
public static void main(String args[])
{
University .Department cse=new University.Department();
cse.annuoncement();
University.Department.prepraing(); 

}
}

