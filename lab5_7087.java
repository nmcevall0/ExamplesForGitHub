package lab5_7087;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class lab5_7087 {

	public static void main(String[] args){


		ReactionArea buff = new ReactionArea();
		Oxygen oxygen = new Oxygen(buff);
		Hydrogen hydrogen = new Hydrogen(buff);
		Reactor reactor = new Reactor(buff);
		ExecutorService application = Executors.newCachedThreadPool(); 
		application.execute(reactor);
		application.execute(oxygen);
		application.execute(hydrogen);
		
		application.shutdown();
	}
}
