abstract class Car
{
abstract public void cost();
abstract public void millage();
abstract public void cc();
public void start()
{
System.out.println("starts with a key");
}
}
class Benz extends Car
{
public void cost()
{
System.out.println("car cost is 60 lakhs");
}
public void milage()
{
System.out.println("car millage is 20lakhs");
}
public void cc()
{
System.out.println("car cc is 3000");
}
}
class Bmw extends Car
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
class Abstract
{
public static void main(String args[])
{
Bmw x=new Bmw();
x.cost();
x.milage();
}
}






