class Traineer
{
	public  static synchronized void message(String companyname) {
for(int i=0;i<5;i++)
{
	System.out.println("Welcome  to the company");
try {
	Thread.sleep(1000);
	System.out.println(companyname);
}
catch (Throwable e)
{
         e.printStackTrace(); 
              
           
            System.out.println(e); 
	
}
}
}	
}
class Mythread extends Thread
{

	String companyname;
	Mythread(String companyname){
		
		this.companyname=companyname;
		}
	public void run()
	{
		Traineer.message(companyname);
	}
}


public class Synchronizedexp1 
{

	public static void main(String[] args) {
		//Traineer ref=new Traineer();
		Mythread x=new Mythread("jnit");
		Mythread y=new Mythread("Motivitylabs");
		x.start();
		y.start();
	}
	}




	

