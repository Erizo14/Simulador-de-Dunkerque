package App;

import java.util.concurrent.Semaphore;

public class Playa {
	int soldados = 400000;
	Semaphore semaforo = new Semaphore(7); 
	public boolean recoger(int capacidad) {
		try {
			semaforo.acquire();
			if(soldados != 0) {
				soldados -= capacidad;
				System.out.println("Quedan "+soldados+" en la playa");
				
			} else {
				System.out.println("No quedan más soldados en Dunkerque");
				System.exit(0);
			}
			semaforo.release();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
		
	}
	public synchronized int getSoldados() {
		return this.soldados;
	}
}
