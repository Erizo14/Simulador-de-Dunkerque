package App;

public class Main {

	public static void main(String[] args) {
		Barco barco = new Barco();
		Playa playa = new Playa();
		Bote lancha1 = new Bote(playa, barco, 0);
		Bote lancha2 = new Bote(playa, barco, 0);
		Bote lancha3 = new Bote(playa, barco, 0);
		Bote lancha4 = new Bote(playa, barco, 0);
		Bote lancha5 = new Bote(playa, barco, 0);
		Bote salvavidas1 = new Bote(playa, barco, 1);
		Bote salvavidas2 = new Bote(playa, barco, 1);
		Bote salvavidas3 = new Bote(playa, barco, 1);
		Bote salvavidas4 = new Bote(playa, barco, 1);
		Bote salvavidas5 = new Bote(playa, barco, 1);
		Contador cont = new Contador();
		int salvados = 0, abandonados;

		cont.setPriority(Thread.MAX_PRIORITY);
		lancha1.setPriority(Thread.MIN_PRIORITY);
		lancha2.setPriority(Thread.MIN_PRIORITY);
		lancha3.setPriority(Thread.MIN_PRIORITY);
		lancha4.setPriority(Thread.MIN_PRIORITY);
		lancha5.setPriority(Thread.MIN_PRIORITY);
		cont.start();
		lancha1.start();
		lancha2.start();
		lancha3.start();
		lancha4.start();
		lancha5.start();
		salvavidas1.start();
		salvavidas2.start();
		salvavidas3.start();
		salvavidas4.start();
		salvavidas5.start();
		
		try {
			Thread.sleep(144000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		lancha1.interrupt();
		lancha2.interrupt();
		lancha3.interrupt();
		lancha4.interrupt();
		lancha5.interrupt();
		salvavidas1.interrupt();
		salvavidas2.interrupt();
		salvavidas3.interrupt();
		salvavidas4.interrupt();
		salvavidas5.interrupt();
		cont.interrupt();
		salvados = barco.getSalvados();
		abandonados = playa.getSoldados();
		System.out.println("Se han salvado " + salvados + " soldados en total");
		System.out.println("Se han quedado en la playa " + abandonados + " soldados que deberán rendirse al ejército alemán");
		System.out.println("Grupo Lanchas 1 ha salvado " + lancha1.getContLanchas());
		System.out.println("Grupo Lanchas 2 ha salvado " + lancha2.getContLanchas());
		System.out.println("Grupo Lanchas 3 ha salvado " + lancha3.getContLanchas());
		System.out.println("Grupo Lanchas 4 ha salvado " + lancha4.getContLanchas());
		System.out.println("Grupo Lanchas 5 ha salvado " + lancha5.getContLanchas());
		System.out.println("Grupo Salvavidas 1 ha salvado " + salvavidas1.getContBotes());
		System.out.println("Grupo Salvavidas 2 ha salvado " + salvavidas2.getContBotes());
		System.out.println("Grupo Salvavidas 3 ha salvado " + salvavidas3.getContBotes());
		System.out.println("Grupo Salvavidas 4 ha salvado " + salvavidas4.getContBotes());
		System.out.println("Grupo Salvavidas 5 ha salvado " + salvavidas5.getContBotes());
	}

}
