package App;

import java.util.Random;

public class Bote extends Thread {
	private Playa playa;
	private Barco barco;
	private Random rand = new Random();
	private int tipoBote;
	private String nombreBote;
	private int capacidad, contLanchas = 0, contBotes = 0;
	
	public Bote(Playa playa, Barco barco, int tipoBote) {
		super();
		this.playa = playa;
		this.barco = barco;
		this.tipoBote = tipoBote;
		if (tipoBote == 0 ) {
			this.nombreBote = "LANCHA";
		} 
		if (tipoBote == 1) {
			this.nombreBote = "BOTE SALVAVIDAS";
		}
	}
	
	
	private void generarCapacidad() {
		if(tipoBote == 0) {
			capacidad = rand.nextInt(101)+100;
		}
		if(tipoBote == 1) {
			capacidad = rand.nextInt(101)+300;
		}
		
		
	}
	public int getContLanchas() {
		return contLanchas;
	}
	public int getContBotes() {
		return contBotes;
	}
	@Override
	public void run() {
		try {
		while (!Thread.interrupted()) {
				generarCapacidad();
					if (playa.recoger(capacidad)) {
						System.out.println( "Han embarcado "+capacidad+" soldados de la playa en " +nombreBote);
						if(tipoBote == 0) {
							contLanchas += capacidad;
						}
						if(tipoBote == 1) {
							contBotes += capacidad;
						}
						Thread.sleep(400);
						barco.desembarcar(capacidad, tipoBote);
						Thread.sleep(500);
					}
				}
			
		} catch (InterruptedException e) {
		}
	}
	
	
}
