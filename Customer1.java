class Restuarant
{
public void menu()
{
System.out.println("1.idly,2.wada,3.poori,4.dosa");
}
void takeOrder(String order)
{
System.out.println("order given is="+order);
}
String servefood()
{
return "Dosa";
}
int givebill(){
return 500;
}
String payBill(int amount)
{
System.out.println("Amount given is"+amount);
return "paid";
}
}
class Customer1
{
public static void main(String args[])
{
Restuarant ref=new Restuarant();
ref.menu();
ref.takeOrder("dosa");
System.out.println("Food served is"+ref.servefood());
System.out.println("Bill"+ref.givebill());
System.out.println("Bill"+ref.payBill(50));
}
}

 
