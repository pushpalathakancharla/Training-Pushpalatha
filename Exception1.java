class Exception1
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
}
}