class Googleoverloading
{
 public void search(double a)
{
System.out.println("calling double argrument method");
}
public void search(int b)
{
System.out.println("calling int argrument method");
}
public void search(String c)
{
System.out.println("calling String argrument method");
}
public void search(int a,String b)
{
System.out.println("calling int and String argrument method");
}
}
 
class Sample
{
public static void main(String args[])
{
Googleoverloading ref=new Googleoverloading();
ref.search(8.7);
ref.search(10);
ref.search("lingampally");
ref.search(10,"jntu");


}
}



