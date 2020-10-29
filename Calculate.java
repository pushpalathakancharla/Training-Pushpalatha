class Sample
{
public void sum(int a,int b)
{
System.out.println("sum is"+(a+b));
}
public void sum(int a,float b)
{
System.out.println("sum is"+(a+b));
}
public void sum(float a,double b)
{
System.out.println("sum is"+(a+b));
}
public void sum( double a,int b)
{
System.out.println("sum is"+(a+b));
}
}
class Calculate
{
public static void main(String args[])
{
Sample ref=new Sample();
ref.sum(8,5);
ref.sum(7,3.8);
ref.sum(7.5f,8.4);
ref.sum(1.6,5);
}
}
