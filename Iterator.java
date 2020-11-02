import java.util.Vector;
import java.util.Enumeration;
class Iterator{
public static void main(String[]args) {
Vector<Integer>al=new Vector<Integer>();
al.add(99);
al.add(80);		
al.add(99);
al.add(98);
al.add(77);
al.add(65);
System.out.println(al);
Enumeration<Integer> e1=al.elements();
while(e1.hasMoreElements()) {
System.out.println(e1.nextElement());
}
}
}
		
		