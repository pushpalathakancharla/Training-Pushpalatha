package pushpa1;
import java.util.HashSet;
 class HashSetexample {
public static void main(String[] args){
	HashSet<String> s1=new HashSet<String>();
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
System.out.println(s1.empty());
System.out.println(s1.contain("m"));

System.out.println(s1.add("w"));
System.out.println(s1.clone());

		
	}
}