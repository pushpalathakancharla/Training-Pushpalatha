import java.util.Scanner;
class Bottle
{
String name;
int length;
int height;
String color;
int price;
}
public class Scanner
{
public static void main(String args[])
{
Bottle ref=new Bottle();
Scanner sc=new Scanner(System.in);
System.out.println("enter Bottle features");
ref.name=sc.nextLine90; 
ref.length=sc.nextInt();
ref.height=sc.nextInt();
ref.color=sc.nextLine();
ref.address=sc.nextLine();
ref.price=sc.nextInt();
System.out.println("======Bottele Details====");
System.out.println("name="+ref.name);
System.out.println("length:"+ref.length);
System.out.println("height:"+ref.height);
System.out.println("color:"+ref.color);
System.out.println("price:"+ref.price);
}
}

