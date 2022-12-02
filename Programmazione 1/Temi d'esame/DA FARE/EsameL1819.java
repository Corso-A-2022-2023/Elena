/**
 * ESAME PROGRAMMAZIONE 1 16/09/19
 * Matricola: SCRIVERLA ORA!!!
 * Cognome: SCRIVERLO ORA!!!
 * Nome: SCRIVERLO ORA!!!
 * Corso: SCRIVERLO ORA!!!
 * 
 * Se non ancora fatto, SCRIVERE ORA nome, cognome, matricola, corso, 
 * NUMERO DEL PC sui fogli distribuiti.
 * 
 * PER CONSEGNARE o RITIRARSI chiamare un docente.
 * SE QUESTA CLASSE NON COMPILA E' INUTILE CONSEGANRE.
 */
public class EsameL1819 {

	/** ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente). 
	 * Scrivere un metodo iterativo e1 con le seguenti caratteristiche:
	 * -) e1 ha due parametri, entrambi di tipo array di interi, di nome 
	 * a e b, rispettivamente; 
	 * -) e1 restituisce true se esistono almeno due elementi di a 
	 * inferiori ad un elemento in b di posizione dispari. 
	 * In ogni altro caso, e1 restituisce false. 
	 * SCRIVERE la soluzione immediatamente qui sotto.                */

	/** ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo involucro (wrapper o guscio) e2 tale che:
     * -) e2 ha come unico parametro formale un array di interi a;
     * -) e2 restituisce un array di interi, richiamando un metodo 
     * ricorsivo *co-variante* e2R che si comporta come segue:
     * -) e2R prende quattro parametri:
     * --) il primo parametro e' l'array a;
     * --) il secondo parametro e' un array b, passatogli da e2, che
     * verra' restituito come risultato;
     * --) il terzo parametro e' l'indice che individua 
     * l'intervallo di lavoro sull'array a;
     * --) il quarto parametro e' l'indice che individua il prossimo
     * elemento di b in cui inserire un valore. 
     * -) e2R scrive nell'array b, 
     * ogni elemento dell'array a che si trovi in posizione pari. 
     * Per semplicita', l'ordine degli elementi copiati in b e' l'inverso
     * dell'ordine di apparizione in a.
     * In generale, b contiene meno elementi di quelli di a.
     * Per metodo ricorsivo *co-variante* intendiamo che il parametro 
     * che guida la ricorsione *de*cresce al *de*crescere della
     * difficolta' della porzione di problema che resta da risolvere.  
	 * Scrivere la soluzione immediatamente qui sotto.                */
	 
	/** ESERCIZIO 3 (Massimo 2 + 2 + 3 + 3 punti -- da consegnare a mano)	 
     * Sia P(i) il seguente predicato:
     * 
	 *   "la congiunzione
	 *    true && a[0]==1 && a[1]==1 && ... && a[j-1]==1 
	 *    e' vera al termine dell'iterazione i".
	 *   
	 * Dato il metodo e3, dimostrare che, per ogni valore i>=0,
	 * il predicato P(i) e' vero, usando il principio di induzione:
	 * 1) formulare esplicitamente la base               (2 pt.) 
	 * 2) formulare esplicitamente il passo induttivo    (2 pt.) 
	 * 3) dimostrare che il predicato al punto 1 e' vero (3 pt.)
	 * 4) dimostrare che il predicato al punto 2 e' vero (3 pt.)      
	 */
	public static int e3(int[] a) {
		int j = 0;
		// prima di ogni iterazione
		while (j < a.length) {
			// inizio dell'iterazione i >= 0
			a[j] = 1;
			j = j+1;
			// inizio dell'iterazione i+1 > 0
		}
		return 0;
	}
	
	/** ESERCIZIO 4 (Massimo 8 punti -- da consegnare a mano).
	 * Scrivere lo stato della memoria della JVM giusto prima della 
	 * disallocazione del frame di attivazione del metodo m in cui 
	 * valore di i e' 0.                                            */

	public static void m(int[] a, int i, int[] b) {
		if (i == 0) {
			b[b.length - 1] = a[i]-1;
		} else {
			b[i - 1] = a[i] - 1;
			m(a, i - 1, b);  // indirizzo ritorno (B)
		}
	}

	/******************************************/
	public static void main(String[] args) {
		int[] a = { 1000, 100, 10 };
		int[] b = new int[a.length];
		m(a, a.length - 1, b); // indirizzo ritorno (A)
	}
}
