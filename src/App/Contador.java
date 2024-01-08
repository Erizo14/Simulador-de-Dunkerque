package App;

public class Contador extends Thread {
	
	@Override
	public void run() {
		try {
		for(int i = 0; i < 6; i++) {
			Thread.sleep(24000); 
			System.out.println("HAN PASADO "+i+1+" DÍAS DE COMBATE");
			
		}
			
		} catch (InterruptedException e) {
		}

	}
}
