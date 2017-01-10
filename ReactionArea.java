package lab5_7087;


public class ReactionArea{
	public int waitingHydrogen=0; //keeps track of the amount of hydrogen in reactor
	public int waitingOxygen=0; //keeps track of the amount of oxygen in reactor
	public int totalHydrogen=0; //the total amount of hydrogen that has been added
	public int totalOxygen=0; //the total amount of oxygen that has been added
	public int waterMolecules=0; //the total amount of water molecules formed

	
	public synchronized void increWHydrogen(int index){
		while(waitingHydrogen<=5&&totalHydrogen<20){
		System.out.println("The "+totalHydrogen+ "th Hydrogen was added.");
		waitingHydrogen++;
		totalHydrogen++;
		notifyAll();
		}
	}
	public synchronized void increWOxygen(int index){
		while(waitingOxygen<=2&&totalOxygen<10){
		System.out.println("The "+totalOxygen+ "th Oxygen was added.");
		waitingOxygen++;
		totalOxygen++;
		notifyAll();
	}
	}
	public synchronized void react(int index){
		while(waitingHydrogen>=2&&waitingOxygen>=1){
		System.out.println("The "+waterMolecules+ "th water molecule was formed.");
			waterMolecules++;
			waitingHydrogen=waitingHydrogen-2;
			waitingOxygen=waitingOxygen-1;
			notifyAll();
		}
	}
}
