class Mobileshop
{
public void mobile()
{
System.out.println("1.iphone,2.sumsung,3.realme");
}
public void bookmobile(String order)
{
System.out.println("order given="+order);
}
int givebill(){
return 234;
}
public void exchangemobile(String exchange)
{
System.out.println("exchange given="+exchange);
}
}
class Customer
{
public static void main(String args[])
{
Mobileshop ref=new Mobileshop();
ref.mobile();
ref.bookmobile("iphone");
System.out.println("Bill"+ref.givebill());
}
}

 
