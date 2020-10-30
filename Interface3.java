interface Vehicle
{
public void cost();
public void millage();
}
abstract class Car implements Vehicle
{
public void viper()
{
System.out.println("vipping");
}
}
class Bmw extends Car
{
public void cost()
{
System.out.println("Bmw cost is 5000");
}
public void millage()
{
System.out.println("millage cost is3000");
}
}
abstract class Bike implements Vehicle
{
public void Stand()
{
System.out.println("stands");
}
}
class Fz extends Bike
{
public void cost()
{
System.out.println("fz cost is3000");
}
public void millage()
{
System.out.println("Fz millage is 155");
}
}
class Apache extends Bike
{
public void cost()
{
System.out.println("apache cost is 300");
}
public void millage()
{
System.out.println("apache millage is 200");
}
}
class Interface3
{
public static void main(String args[])
{
Apache b1=new Apache();
b1.cost();
b1.millage();
}
}

 


