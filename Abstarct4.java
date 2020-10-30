abstract class Interview
{
public abstract void java();
public abstract void testing();
}
abstract class Attempt1 extends Interview
{
public void testing()
{
System.out.println("providing implemetion testing");
}
}
class Attempt2 extends Attempt1
{
public void java()
{
System.out.println("providing implemetion java");
}
}
class Abstract4
{
public static void main(String args[])
{
 Attempt2 a2=new Attempt2();
a2.testing();
a2.java();
}
}


