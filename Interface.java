interface Bird
{
public void eat();
}
interface Peigeon 
{
public void sleep();
}
class Parrot implements Bird,Peigeon
{
public void eat()
{
System.out.println("Grass");
}
public void sleep()
{
System.out.println("yyy");
}
}
class Interface
{
public static void main(String args[])
{
Parrot p1=new Parrot();
p1.eat();
p1.sleep();
}
}





