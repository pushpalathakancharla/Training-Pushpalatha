class Cabbooking
{
public void cabs()
{
System.out.println("1.prime 2.share 3.premier 4.mini");
}
public void bookCab(String order)
{
System.out.println("order given="+order);
}

public void paybill(int amount)
{
System.out.println("Amount given is "+amount);
}
}

class Passenger
{
public static void main(String args[])
{
Cabbooking ref=new Cabbooking();
ref.cabs();
ref.bookCab("Mini");
ref.paybill(200);
}
}



