lass Traineer
{
	public synchronized void message(String companyname) {
		for(int i=0;i<10;i++)
{
	System.out.println("Welcome  to the company");
try {
	Thread.sleep(1000);
	System.out.println(companyname);
}
catch (Exception e)
{
	e.printStackTrace();
}
}
	}
}
class Mythread extends Thread
{
	Traineer c;
	String companyname;
	Mythread(Traineer c,String companyname){
		this.c=c;
		this.companyname=companyname;
		}
	public void run()
	{
		c.message(companyname);
	}
}
public class Synchronizedexp 
{

	public static void main(String[] args) {
		Traineer ref=new Traineer();
		Mythread x=new Mythread(ref,"jnit");
		Mythread y=new Mythread(ref,"Motivitylabs");
		x.start();
		y.start();
	}
	}



	

