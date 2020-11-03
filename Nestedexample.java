class University
{
public void annuoncement()
{
System.out.println("Exam start from 1st Dec");
}
class Department
{
public void prepraing()
{
System.out.println(" prepraing for Exam ");
}
}
}
class Nestedexample
{
public static void main(String args[])
{
University jntu=new University();
jntu.annuoncement();
University.Department cse=jntu.new Department();
cse.prepraing();
}
}

