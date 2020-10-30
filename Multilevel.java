class Mobile
{
int price=200;
String brandname="iphone";
class nokia extends Mobile
{
public void call()
{
System.out.println("call");
}
class Realme extends nokia
{
public void videocall()
{
System.out.println("videocall");
}
}
}
class Multilevel
{
public static void main(String[]args)
{
Realme s1= new Realme();
s1.call();
s1.videocall();
System.out.println("price="+s1.price);
System.out.println("brandname="+s1.brandname);
}
}
}