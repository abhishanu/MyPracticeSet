package abhi.test;
import java.util.Random; 

public class Consumer implements Runnable{
	private Drop drop;
	
	public Consumer(Drop drop){
		this.drop=drop;
	}
	
	public void run(){
		Random random=new Random();
		
		for(String msg=drop.take();!msg.equals("Done");msg=drop.take()){
			System.out.println("Message :"+msg);
			try {
				Thread.sleep(random.nextInt(5000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
