
class Customer
{
	int amount=1000;
	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw");
	
	if(this.amount<amount) {
		System.out.println("Less balance go and deposit");
		try {
			wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
this.amount-=amount;
System.out.println(" Withdraw completed");
	}
	synchronized void deposit(int amount) {
		System.out.println("going to deposit");
		this.amount+=amount;
		System.out.println("deposit done");
		notify();
	}
		
	}
public class Test {

	public static void main(String[] args) {
		Customer pushpa=new Customer();
		new Thread()
		{
			public void run()
			{
				pushpa.withdraw(15000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				pushpa.deposit(10000);
			}
		}.start();
	}

}


