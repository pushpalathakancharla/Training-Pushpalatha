package pushpa1;
import java.util.TreeSet;
 class Set {

public static void main(String args[])
	{
TreeSet<String>s1=new TreeSet<String>();
s1.add("a");
s1.add("w");
s1.add("k");
s1.add("l");
s1.add("d");
s1.add("n");
s1.add("z");
s1.add("t");
s1.add("i");
System.out.println(s1);
System.out.println(s1.headSet("d",true));
System.out.println(s1.tailSet("n",false));
System.out.println(s1.subSet("g",false,"i",true));
System.out.println(s1.first());
System.out.println(s1.last());
System.out.println(s1.lower("m"));
System.out.println(s1.higher("i"));
System.out.println(s1.add("w"));
System.out.println(s1.clone());
System.out.println(s1.floor("b"));
		
	}
}