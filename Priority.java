
public class Priority extends Thread {
	public void run()
	{
		System.out.println("Thraed name"+Thread.currentThread().getName());
		System.out.println("Thraed priority"+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		Priority x=new Priority();
		Priority y=new Priority();
		x.setPriority(MAX_PRIORITY);
		x.start();
		y.start();
		
		

	}

}
