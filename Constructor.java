class Pen
{
int price;
int size;
float weidth;
float heigh;
Pen()
{
price=30;
size=6;
weidth=4.5f;
heigh=5.5f;
}
}
class Constructor
{
public static void main(String args[])
{
Pen ref=new Pen();
System.out.println("price="+ref.price);
System.out.println("size="+ref.size);
System.out.println("weidth="+ref.weidth);
System.out.println("heigh="+ref.heigh);
}
}
