class Outerclass
{
 int a=10;
class Innerclass
{
void show()
{
System.out.println("value is="+a);
}
}
void display()
{
Innerclass ic=new Innerclass();
ic.show();
}
public static void main(String args[])
{
 Outerclass oc=new  Outerclass();
oc.display();
}
}
