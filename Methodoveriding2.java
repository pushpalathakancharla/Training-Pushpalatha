class Mobile
{
public void ram()
{
System.out.println("no Ram");
}
public void rom()
{
System.out.println("no rom");
}
}
class Iphone extends Mobile
{
public void ram()
{
System.out.println("iphone ram is 4gb");
}
public void rom()
{
System.out.println("rom is 64gb");
}
}
class Oppo extends Mobile
{
public void ram()
{
System.out.println("oppo ram is 5gb");
}
public void rom()
{
System.out.println("rom is 128gb");
}
}
class Methodoveriding2
{
public static void main(String args[])
{
Mobile w=new Iphone();
w.ram();
w.rom();
w=new Oppo();
w.ram();
w.rom();
}
}






