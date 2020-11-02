import java.util.TreeSet;
import java.util.Set;
import java.util.Iterator;
class Iterator1{
public static void main(String[]args) {
Set<String>al= new TreeSet<String>();
al.add("k");
al.add("l");		
al.add("z");
al.add("l");
al.add("o");
al.add("p");
System.out.println(al);
Iterator<String> i=al.iterator();
while(i.hasNext()) {
System.out.println(i.next());
}
}
}
		
		