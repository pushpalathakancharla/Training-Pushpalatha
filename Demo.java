import java.util.Vector;
class Demo{
public static void main(String args[])
{
int i,j;
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
for(i=0;i<v.size();i++)
{
for(j=i+1;j<v.size();j++)
{
if(v.get(i)==v.get(j))
{
System.out.println(v.get(i));
}
}
}
}
}
}