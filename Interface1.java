interface Language
{
public void read();
}
interface English 
{
public void write();
}
class Hindi implements Language,English
{
public void read()
{
System.out.println("123");
}
public void write()
{
System.out.println("yyy");
}
}
class Interface1
{
public static void main(String args[])
{
Hindi h1=new Hindi();
h1.read();
h1.write();
}
}





