class Exception
{
public static void main(String[] args)
{
String h=null;
try{
System.out.println(h.length());
}
catch(NullPointerException e)
{
e.printStackTrace();
}
}
}