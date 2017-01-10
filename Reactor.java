package lab5_7087;

public class Reactor implements Runnable {

	ReactionArea buff;
	
	public Reactor(ReactionArea buff){
		this.buff=buff;
	}
	public void run(){
		try{
			Thread.sleep(1000); //The initial sleep for 2 seconds = 2000 milliseconds
		}catch(InterruptedException e){
			e.printStackTrace();
			System.exit(1);
	}
		for(int i=0;i<10;i++){
			try{
					buff.react(i);
					Thread.sleep(50);
				}catch(InterruptedException e){
					e.printStackTrace();
					System.exit(1);
			}
		}
	}
}
