class Car
{
public void cost()
{
System.out.println("no cost");
}
public void milage()
{
System.out.println("no millage");
}
}
class Audi extends Car
{
public void cost()
{
System.out.println("Audi cost is 50lakhs");
}
public void milage()
{
System.out.println("Audi millage is 50lakhs");
}
}
class Bmw extends Car
{
public void cost()
{
System.out.println("Bmw cost is 50lakhs");
}
public void milage()
{
System.out.println("Bmw millage is 50lakhs");
}
}
class Methodoveriding
{
public static void main(String args[])
{
Car x=new Audi();
x.cost();
x.milage();
x=new Bmw();
x.cost();
x.milage();
}
}






