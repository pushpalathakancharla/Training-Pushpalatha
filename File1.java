import java.io.*;
class File1
{
public static void main(String args[]) throws IOException
{
FileInputStream fs=new FileInputStream("E:\\jnit.txt");
int i=fs.read();
System.out.println(i);
System.out.println((char)i);
}
}




 







 