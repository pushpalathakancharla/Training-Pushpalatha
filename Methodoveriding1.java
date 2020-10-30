class Laptop
{
public void os()
{
System.out.println("no os");
}
public void size()
{
System.out.println("no size");
}
}
class Lenovo extends Laptop
{
public void os()
{
System.out.println("Lenovo os is windows10");
}
public void size()
{
System.out.println("Lenovo size is Large");
}
}
class Acer extends Laptop
{
public void os()
{
System.out.println(" acer os  is windows8");
}
public void size()
{
System.out.println("acer size is small");
}
}
class Methodoveriding1
{
public static void main(String args[])
{
Laptop y=new Lenovo();
y.os();
y.size();
y=new Acer();
y.os();
y.size();
}
}






