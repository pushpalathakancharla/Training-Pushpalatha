import java.util.Scanner;
class Square
{
int a,b,c,d;
public void sqr()
{
c=a*a;
System.out.println(c);
}
}
class Sum extends Square
{
public void add()
{
d=a+b;
System.out.println(d);
}
}
class Inhertance
{
public static void main(String args[])
{
Sum ref=new Sum();
Scanner sc=new Scanner(System.in);
ref.a=sc.nextInt();
ref.b=sc.nextInt();
ref.sqr();
ref.add();
}
}