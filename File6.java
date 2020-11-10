import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.*;

class File6{
  public static void main(String[] args) {

  
    char[] array = new char[100];

    try {
      
      FileReader file = new FileReader("E:\\jnit.txt");

      
      BufferedReader input = new BufferedReader(file);

      
      input.read(array);
      System.out.println("Data in the file: ");
      System.out.println(array);

      
      input.close();
    }

    catch(java.lang.Exception e) {
      e.getStackTrace();
    }
  }
}