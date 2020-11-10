import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.*;

class File2{
  public static void main(String[] args) {

  
    char[] array = new char[100];

    try {
      
      FileWriter file = new FileWriter("E:\\jnit");

      
      BufferedWritter input = new BufferedWriter(file);

      
      input.write(array);
      System.out.println("Data in the file: ");
      System.out.println(array);

      
      input.close();
    }

    catch(java.lang.Exception e) {
      e.getStackTrace();
    }
  }
}