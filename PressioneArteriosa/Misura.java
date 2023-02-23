/*
	CAMILLETTI SAMUELE - ESAMI DI PROGRAMMAZIONE

 * Si vuole realizzare un sistema per la gestione della pressione arteriosa. 
 * Il sistema memorizza un insieme di misure di pressione. 
 * Ciascuna misura è caratterizzata da 
 * un intero lungo positivo 'data' che esprime una data e ora in 
 * formato UNIX TIME, ovvero il numero di secondi a partire del primo gennaio 1970, 
 * da intero 'minima' e da un intero 'massima' con valori positivi e minore di 300. 
 * Il valore di 'minima' deve essere inferiore di 'massima'. 
 * Quindi un intero positivo 'pulsazioni' con valori compresi tra 1 e 200. 
 * Realizzare il costruttore per la classe   Misura che accetta i valori relativi alla data e i valori di minima, massima e pulsazioni e 
 * produce una eccezione se il valori sono errati.
 * 
 * 
 * 
 * 
 * Definire la classe Misure che memorizza oggetti 
 * di tipo Misura. Il costruttore di Misure ha come parametro il numero massimo di misurazioni memorizzatili 
 * e produce un'eccezione se tale valore è negativo.
 * Definire i seguenti metodi per la classe Misure
	+boolean add(Misura m) che aggiunge una misura e produce true se ha successo, false altrimenti
	+int pulsazioneMassima() che calcola la pulsazione massima tra le misurazioni presenti
	+double intervallo() che calcola la media delle differenze tra massima e minima tra le misurazioni presenti.
 * 
 */

public class Misura {
	
	/* ATTRIBUTI */
	
	// Ho dichiarato tutti i valori di una misurazione final in quanto in un sistema di misurazioni che lavora in funzione del tempo non dovranno mai essere ri-assegnati
	private final long data; // Intero lungo per la memorizzazione del tempo in formato unixtime - data > 0
	private final int minima; // Intero per la memorizzazione del valore di pressione minima - minima > 0 && minima < 300
	private final int massima; // Intero per la memorizzazione del valore di pressione massima - massima > 0 && massima < 300
	private final int pulsazioni; // Intero per la memorizzazione del valore delle pulsazioni - 0 < pulsazioni < 300
	
	/* METODI */
	
	// Costruttore
	public Misura(long data, int minima, int massima, int pulsazioni) throws Exception {
		
		// Controllo i valori inseriti
		if(data > 0 && minima >= 0 && minima < 300 && massima >= 0 && massima < 300 && pulsazioni >= 1 && pulsazioni <= 200 && minima < massima) {
			this.data = data;
			this.minima = minima;
			this.massima = massima;
			this.pulsazioni = pulsazioni;
		}
		// Se i valori sono errati lancio una eccezione checked della classe Exception, che pertanto deve essere gestita o catturata; in questo caso delego il compito al metodo chiamante (con la parola chiave throws)
		else throw new Exception("Valori di misurazione inseriti errati"); 
		
	}
	
	// Metodi getter
	public long getData() {
		return data;
	}
	
	public int getMinima() {
		return minima;
	}
	
	public int getMassima() {
		return massima;
	}
	
	public int getPulsazioni() {
		return pulsazioni;
	}
	
	

}
