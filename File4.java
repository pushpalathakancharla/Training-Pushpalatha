import java.io.FileReader;
import java.io.BufferedReader;
import java.io.*;

class File4{
  public static void main(String[] args) {

  
    String Data="this is file concept";

    try {
      
      StringWriter file = new StringWriter();
      file.write(Data);
System.out.println("Data in the StringWriter: " +Data);
 file.close();
    }

    catch(IOException e) {
      e.getStackTrace();
    }
  }
}