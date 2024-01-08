package App;

public class Barco {
		int contLanchas = 0, contBotes = 0;
	public synchronized void desembarcar(int capacidad, int tipoBote) {
			if(tipoBote == 0) {
				contLanchas += capacidad;
			}
			if(tipoBote == 1) {
				contBotes += capacidad;
			}
		}
	
	public int getSalvados() {
		int salvados = contLanchas + contBotes;
		return salvados;
	}
	
}
