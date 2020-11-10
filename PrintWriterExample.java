package Assignment;
import java.io.*;

public class PrinterWritterExample {

	public static void main(String[] args) 
		  
	{
		            PrintWriter writer = new PrintWriter(System.out);    
		      writer.write("Programming languages are");        
		 writer.flush();  
		      writer.close();  
		       
		      PrintWriter writer1 =null;      
		         try {
					writer1 = new PrintWriter("D:\\java.txt");
				} catch (FileNotFoundException e) {
				
					e.printStackTrace();
				}  
		         writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");                                                   
		                         writer1.flush();  
		         writer1.close();  
		    }  
		

	}


