package abhi.test;
import java.util.Random;

public class Producer implements Runnable {
	private Drop drop;
	
	public Producer(Drop drop){
		this.drop=drop;
	}
	
	public void run(){
		String msgList[]={"Hi","Its a test","Test Started","Test Finish","We will get back to you"};
		
		Random random=new Random();
		
		for (int i = 0; i < msgList.length; i++) {
			drop.put(msgList[i]);
			
			try {
				//System.out.println("Producing");
				Thread.sleep(random.nextInt(5000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		drop.put("Done");
	}
}
