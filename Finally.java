class Finally
{
public static void main(String[] args)
{
try{
int x=10/0;
}
catch(ArithmeticException e)
{
e.printStackTrace();
}
finally
{
System.out.println("the value is 10");
}
}
}