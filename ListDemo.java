import java.util.Vector;
class ListDemo{
public static void main(String args[])
{
Vector<Integer>v=new Vector<Integer>();
{
v.add(1);
v.add(2);
v.add(3);
v.add(4);
v.add(5);
v.add(5);
v.add(0);
v.add(9);
v.add(7);
System.out.println(v);
for(int i:v)
{
System.out.println(i);
}
}
}
}