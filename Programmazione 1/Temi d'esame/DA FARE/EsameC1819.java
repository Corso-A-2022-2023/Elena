/**
 *  ESAME PROGRAMMAZIONE 1 ESTRATTO
 */

public class EsameC1819 {

	/**
	 * ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo e1 con le seguenti caratteristiche:
	 * -) e1 ha due parametri: a e' un array di interi, 
	 * m e' un array bidimensionale (matrice) di interi; 
	 * -) e1 restituisce la somma di tutti gli elementi di a per cui, in m, ne
	 * esiste almeno uno maggiore.
	 * ATTENZIONE: Ricordate che m[i][j] si riferisce all'elemento di m 
	 * di riga i e colonna j, m.length si riferisce al numero di righe di m,
	 * m[i].length e' il numero di elementi della riga i
	 * SCRIVERE la soluzione immediatamente qui sotto.               
	 */
	 
	/**
	 * ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo involucro (wrapper o guscio) void e2 tale che:
	 * -) e2 ha un parametro a, di tipo array di interi;
	 * -) e2 modifica l'array a richiamando 
	 * un metodo void ricorsivo co-variante e2R (l'indice aggiuntivo in
		e2R diminuisce nella chiamata ricorsiva) con le seguenti caratteristiche:
	 * --) e2R ricopre ogni a[i] con il contenuto della cella precedente se i e' dispari.
	 * Scrivere la soluzione immediatamente qui sotto.                   */
	
	/** ESERCIZIO 3 (Massimo 2 + 2 + 3 + 3 punti -- da consegnare a mano)	 
	 * Sia P(n) il seguente predicato:
	 *                 0+a[0]+...+a[n-1]==e3(a,n).
	 * Dato il metodo e3, dimostrare che, per ogni valore n>=0,
	 * il predicato P(n) e' vero, usando il principio di induzione:
	 * 1) formulare esplicitamente la base               (2 pt.) 
	 * 2) formulare esplicitamente il passo induttivo    (2 pt.) 
	 * 3) dimostrare che il predicato al punto 1 e' vero (3 pt.)
	 * 4) dimostrare che il predicato al punto 2 e' vero (3 pt.)      */
	public static int e3(int[] a, int n) {
		if (n==0)
			return 0;
		else
			return e3(a,n-1) + a[n-1];
	}

	/** ESERCIZIO 4 (Massimo 8 punti -- da consegnare a mano).
	 * Scrivere lo stato della memoria della JVM giusto prima della 
	 * disallocazione del frame di attivazione del metodo m, in cui
	 * il valore del parametro l e' pari ad 1.         */
	public static boolean[] m(boolean[] a, int l) {
        if (l==0) {
            return a;
		} else {
			a[l-1] = !a[l-1];
			return m(a, l-1); // indirizzo rientro (B)
		}
	}
	public static void main(String[] args) {
		boolean[] a = {true,false};
		boolean[] b = m(a,a.length); // indirizzo rientro (A)
	}
}
