import java.io.*;
class File
{
public static void main(String args[])
{
try
{
FileOutputStream fs=new FileOutputStream("E:\\Jnit.txt");
String name="This is file concept";
fs.write(name.getBytes());
fs.close();
}
catch(java.lang.Exception e)
{
e.printStackTrace();
}
}
}



 







 