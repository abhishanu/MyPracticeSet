package abhi.test;

public class Drop {
	private String message;
	
	private Boolean empty=true;
	
	public synchronized String take(){
		 
		while(empty){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		empty=true;
		notifyAll();
		return message;
	}
	
	public synchronized void put(String msg){
		while(!empty){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		empty=false;
		this.message=msg;
		notifyAll();
	}
	
}
