import java.io.*;
class CharArrayWritterExample {  
public static void main(String args[])throws Exception{    
          CharArrayWriter out=new CharArrayWriter();    
          out.write("java");    
          FileWriter f1=new FileWriter("E:\\jnit.txt");    
          FileWriter f2=new FileWriter("E:\\jnit.txt");    
          FileWriter f3=new FileWriter("C:\\java.txt");    
          
          out.writeTo(f1);    
          out.writeTo(f2);    
          out.writeTo(f3);    
             
          f1.close();    
          f2.close();    
          f3.close();    
         
          System.out.println("Program...");    
         }    
        }    