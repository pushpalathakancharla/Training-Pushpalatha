class Pen
{
int price;
String brandName;
int size;
float weidth;
float bredth;
String color;
String style;
}
class Marker
{
int price;
String brand_name;
int height;
String symbol;
String color;
float weidth;
String style;
}
class Java
{
public static void main(String args[])
{
Pen parker=new Pen();
parker.price=20;
parker.brandName="nataraj";
parker.size=5;
parker.weidth=4.5f;
parker.bredth=3.2f;
parker.color="green";
parker.style="kwan";
System.out.println("=========Pen Details========");
System.out.println("price:"+parker.price);
System.out.println("brand Name="+parker.brandName);
System.out.println("size:"+parker.size);
System.out.println("weidth:"+parker.weidth);
System.out.println("bredth:"+parker.bredth);
System.out.println("color:"+parker.color);
System.out.println("style:"+parker.style);
Marker cello=new Marker();
cello.price=30;
cello.brand_name="camlin";
cello.height=5;
cello.symbol="circle";
cello.color="black";
cello.weidth=3.4f;
cello.style="camlin";
System.out.println("=======Marker Details=======");
System.out.println("price="+cello.price);
System.out.println("brand_name:"+cello.brand_name);
System.out.println("height:"+cello.height);
System.out.println("symbol:"+cello.symbol);
System.out.println("color:"+cello.color);
System.out.println("weidth:"+cello.weidth);
System.out.println("style:"+cello.style);
}
}




