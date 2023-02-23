/*
 *  * Definire la classe Misure che memorizza oggetti 
 * di tipo Misura. Il costruttore di Misure ha come parametro il numero massimo di misurazioni memorizzatili 
 * e produce un'eccezione se tale valore è negativo.
 * Definire i seguenti metodi per la classe Misure
	+boolean add(Misura m) che aggiunge una misura e produce true se ha successo, false altrimenti
	+int pulsazioneMassima() che calcola la pulsazione massima tra le misurazioni presenti
	+double intervallo() che calcola la media delle differenze tra massima e minima tra le misurazioni presenti.
 */

public class Misure {
	
	/* ATTRIBUTI */
	// Ho utilizzato un array nativo di Java considerando che il n. di misurazioni è inserito in input; altrimenti sarebbe stato più efficiente utilizzare una struttura dati come una lista
	private Misura collezioneMisure []; // Array di oggetti Misura - 
	private final int nMisure; // Intero per la memorizzazione del numero massimo di misure memorizzabili - nMisure > 0
	private int indiceMisure; // Intero positivo per la memorizzazione del numero effettivo di misure allocate nell'array
	
	/* METODI */
	
	// Costruttore
	public Misure(int n) {
		
		// Se il n di misurazioni possibili è maggiore di 0
		if(n > 0) {
			
			this.collezioneMisure = new Misura[n];
			this.nMisure = n;
			this.indiceMisure = 0;
			
		}
		// Altrimenti lancio una eccezione sottoclasse RunTimeException, la quale è unchecked e non necessita di essere gestita o catturata
		else throw new IllegalArgumentException("Valore inserito inferiore a 0.");
		
	}
	
	// Metodi getter
	public int getMisureRegistrate() {
		
		return indiceMisure; // Ritorna il n. di misure attualmente registrate
		
	}
	
	public int getMaxMisure() {
		 
		return nMisure;  // Ritorna il numero massimo di misurazioni possibili
		
	}
	
	public Misura getMisurazione(int indice) {
		
		return collezioneMisure[indice]; // Ritorna una misurazione dato l'indice
		
	}
	
	/* Metodo per l'allocazione in memoria di una nuova misura
	
	Parametri:
	- Misura x: Oggetto di tipo misura
	
	Valore di ritorno:
	true: se l'allocazione è avvenuta con successo
	false: se non.

	 */	
	public boolean add(Misura m) {
		
		if(m != null && indiceMisure < nMisure) {
			
			collezioneMisure[indiceMisure++] = m; // Alloco e aumento l'indice delle misurazioni
			return true;
		}
		else return false;
		
	}
	


	/* Metodo per ottenere la pulsazione massima registrata nella collezione
	
	Valore di ritorno:
	intero che rappresenta le pulsazioni
	-1 se nessuna pulsazione presente;

	 */
	public int pulsazioneMassima() {
		
		int max; // Variabile locale per la mem. del valore massimo
		
		if(indiceMisure != 0) {
			
			max = collezioneMisure[0].getPulsazioni();
			for(int i=0; i<indiceMisure; i++) {
				
				if(collezioneMisure[i].getPulsazioni() > max) max = collezioneMisure[i].getPulsazioni();
				
			}
			return max;
		}
		else return max = -1;
		
	}
	
	/* Metodo che calcola la media delle differenze tra massima e minima tra le misurazioni presenti.
	
	Valore di ritorno:
	intero che rappresenta le pulsazioni
	-1 se nessuna pulsazione presente;

	 */
	public double intervallo() {
		
		int somma = 0; // Variabile locale per la somma delle differenze
		
		if(indiceMisure != 0) {
			
			for(int i=0; i<indiceMisure; i++) {
				
				somma += collezioneMisure[i].getMassima() - collezioneMisure[i].getMinima();
				
			}
			return somma/indiceMisure;
		}
		else return somma = -1;		
		
	}
	
	/* Override metodo toString
	 * 
	 * Valore di ritorno:
	 * - Stringa contentente tutte le misurazioni e il n. di misurazioni registrate rispetto a quelle disponibili.
	 */
	@Override
	public String toString() {
		
		String result = "Misure registrate: \n";
		
		result += this.getMisureRegistrate() + "/" + this.getMaxMisure() + "\n";
		
		for(int i=0; i<indiceMisure; i++) {
			
			result += i + " " + collezioneMisure[i].getData() + 
			" " + collezioneMisure[i].getMassima() + " " 
			+ collezioneMisure[i].getMinima() + " " + 
			collezioneMisure[i].getPulsazioni() + " \n";
			
		}		
		
		return result;
	}
}
