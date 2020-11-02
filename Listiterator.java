import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
class Listiterator{
public static void main(String[]args) {
List<String>al= new ArrayList<String>();
al.add("k");
al.add("l");		
al.add("z");
al.add("l");
al.add("o");
al.add("p");
System.out.println(al);
ListIterator<String> i=al.listIterator();
while(i.hasNext()) {
System.out.println(i.next());
}
}
}
		
		