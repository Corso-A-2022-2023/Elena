/**
 * ESAME PROGRAMMAZIONE 1 07/02/19 mattina
 * Matricola: SCRIVERLA ORA!!!
 * Cognome: SCRIVERLO ORA!!!
 * Nome: SCRIVERLO ORA!!!
 * Corso: SCRIVERLO ORA!!!
 * 
 * Se non ancora fatto, SCRIVERE ORA nome, cognome, matricola, corso, 
 * NUMERO DEL PC sui fogli distribuiti.
 * 
 * PER CONSEGNARE/RITIRARSI chiamare un docente.
 * SE QUESTA CLASSE NON COMPILA E' INUTILE CONSEGANRE.
 */
public class EsameD1819 {

	/**
	 * ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo e1 con le seguenti caratteristiche:
	 * -) e1 ha come unico parametro m un array bidimensionale (matrice) 
	 * di interi; 
	 * -) e1 restituisce true se, per ogni riga, tranne l'ultima,
	 * esiste almeno un elemento che sia strettamente minore di quello 
	 * che occupa la stessa posizione, ma nella riga successiva. 
	 * In ogni altro caso e1 restitusce false.
	 * ATTENZIONE: m[i][j] si riferisce all'elemento di m di riga i e 
	 * colonna j; m.length si riferisce al numero di righe di m;
	 * m[i].length e' il numero di elementi della riga i.
	 * SCRIVERE la soluzione immediatamente qui sotto.               
	 */
		
	/**
	 * ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo involucro (wrapper o guscio) void e2 tale che:
	 * -) e2 ha un parametro a, di tipo array di booleani;
	 * -) e2 modifica l'array a, la quale puo' avere struttura arbitraria,
	 * richiamando un metodo void ricorsivo dicotomico e2R 
	 * (due indici individuano l'intervallo su cui opera e2R) con le seguenti 
	 * caratteristiche:
	 * --) e2R riscrive ogni cella in a di posizione dispari con la congiunzione 
	 * tra il contenuto della cella precedente ed il contenuto di quella successiva, 
	 * ammesso che entrambe esistano.
	 * Scrivere la soluzione immediatamente qui sotto.
	 */
	
	/** ESERCIZIO 3 (Massimo 2 + 2 + 3 + 3 punti -- da consegnare a mano)	 
	 * Sia P(n) il seguente predicato:
	 *        e3(a, n) == 10*a[0]*...*a[n-1] .
	 * Dato il metodo e3, dimostrare che, per ogni valore n>=0,
	 * il predicato P(n) e' vero, usando il principio di induzione:
	 * 1) formulare esplicitamente la base               (2 pt.) 
	 * 2) formulare esplicitamente il passo induttivo    (2 pt.) 
	 * 3) dimostrare che il predicato al punto 1 e' vero (3 pt.)
	 * 4) dimostrare che il predicato al punto 2 e' vero (3 pt.)      */
	public static int e3(int[] a, int n) {
		if (n>0)
			return e3(a, n-1)*a[n-1];
		else
			return 10;
	}
	 
	/** ESERCIZIO 4 (Massimo 8 punti -- da consegnare a mano).
	 * Scrivere lo stato della memoria della JVM giusto prima della 
	 * disallocazione del frame di attivazione del metodo m, 
	 * in cui il valore del parametro i e' pari ad 1.                     */
	public static void m(boolean[] a, int i) {
		if (i>0) {
			boolean t = a[i-1];
			a[i-1] = a[i];
			a[i] = t;
			m(a,i-1); // (B)
		} else {
			int[] x = {0};
		}	
	}
	/******************************************/
	public static void main(String[] args) {
		boolean[] a = {true,false};
		m(a,a.length-1); // (A)
	}
}
