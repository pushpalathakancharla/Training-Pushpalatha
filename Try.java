class Throw
{
public static void main(String[] args)
{
int a=10,b=0;
String s="pushpa";
System.out.println("Statement1");
try{
System.out.println("Division ia="+(a/b));
System.out.println("Statement2");
}
catch(ArithmeticException ae)
{
System.out.println("Statement3");
ae.printStackTrace();
System.out.println(ae.getMessage());
}
System.out.println("Statement4");
System.out.println("Statement5");
}
}

