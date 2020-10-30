class Transfermoney
{
long contactnumber;
class Paytm extends Transfermoney
{
public void pay()
{
System.out.println("paying money");
}
class Phonepay extends Transfermoney
{
public void message()
{
System.out.println("messageing");
}
}
}
}
class Hierarchial
{
public static void main(String[]args)
{
Paytm p1=new Paytm();
p1.pay();
Phonepay p2=new Phonepay();
p2.message();
}
}