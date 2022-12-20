/**
 * ESAME PROGRAMMAZIONE 1 10/06/19
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
public class EsameG1819 {

	/** ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente). 
	 * Scrivere un metodo iterativo e1 con le seguenti caratteristiche:
	 * -) e1 ha due parametri, entrambi di tipo array di interi, di nome 
	 * a e b, rispettivamente; 
	 * -) e1 restituisce true se esistono almeno due elementi di a 
	 * inferiori ad ogni elemento di posizione dispari in b. 
	 * In ogni altro caso, e1 restituisce false. 
	 * SCRIVERE la soluzione immediatamente qui sotto.                */
	 
	public static boolean e1(int[] a, int[] b){
		boolean  esiste = false;
		
		if(a != null && b != null && a.length > 1 && b.length > 0){
			int cnt = 0;
			for(int i = 0; i < a.length && !esiste; i++){
				boolean minore = true;
				for(int j = 1; j < b.length && minore; j += 2){	// salto di 2 per controllare solo j dispari
					minore = a[i] < b[j];
				}
				if (minore)
					cnt++;
				if(cnt==2)
					esiste = true;
			}
		}
		
		return esiste;
	}

	/** ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo involucro (wrapper o guscio) e2 tale che:
     * -) e2 ha come unico parametro formale un array di interi a;
     * -) e2 restituisce un array di interi, richiamando un metodo 
     * ricorsivo dicotomico e2R che si comporta come segue:
     * -) e2R prende quattro parametri:
     * --) il primo parametro e' l'array a;
     * --) il secondo parametro e' un array b, passatogli da e2, che
     * conterra' il risulato;
     * --) il terzo ed il quarto parametro sono gli indici che individuano 
     * l'intervallo di lavoro sull'array a; 
     * -) e2R scrive nell'array b ogni elemento di a, 
     * incrementato di una unita' se l'elemento ha posizione pari, 
     * decrementato di una unita' se l'elemento ha posizione dispari.
	 * Scrivere la soluzione immediatamente qui sotto.                */
	 
	public static int[] e2(int[] a){
		if(a == null)
			return null;
		int[] b = new int[a.length];
		if(a.length > 0)
			e2R(a, b, 0, a.length-1);	
		return b;
	}
	
	public static void e2R(int[] a, int[] b, int l, int r){
		if(l == r){
			if(l%2 == 0)
				b[l] = a[l] + 1;
			else
				b[l] = a[l] - 1;
		}
		else{
			int m = (l+r)/2;
			e2R(a, b, l, m);
			e2R(a, b, m+1, r);
		}
	}
	 
	/** ESERCIZIO 3 (Massimo 2 + 2 + 3 + 3 punti -- da consegnare a mano)	 
     * Sia P(i) il seguente predicato:
     * 
	 *   "false||a[0]||...||a[j-2]==r vero alla fine dell'iterazione i".
	 *   
	 * Dato il metodo e3, dimostrare che, per ogni valore i>=0,
	 * il predicato P(i) e' vero, usando il principio di induzione:
	 * 1) formulare esplicitamente la base               (2 pt.) 
	 * 2) formulare esplicitamente il passo induttivo    (2 pt.) 
	 * 3) dimostrare che il predicato al punto 1 e' vero (3 pt.)
	 * 4) dimostrare che il predicato al punto 2 e' vero (3 pt.)      
	 */
	public static boolean e3(boolean[] a) {
		boolean r = false;
		int j = 1;
		// prima di ogni iterazione
		while (j-1 < a.length) {
			// inizio dell'iterazione i >= 0
			j = j + 1;
			r = r || a[j-2];
			// inizio dell'iterazione i+1 > 0
		}
		return r;
	}
	
	/** ESERCIZIO 4 (Massimo 8 punti -- da consegnare a mano).
	 * Scrivere lo stato della memoria della JVM giusto prima della 
	 * disallocazione del frame di attivazione del metodo m in cui 
	 * valore di i e' 0.                                            */
	public static void m(boolean[] a, int i, boolean[] b) {
		if (i > 0) {
			b[i - 1] = a[i];
			m(a, i - 1, b);  // indirizzo ritorno (b)
		} else
			b[b.length - 1] = true;
	}

	/******************************************/
	public static void main(String[] args) {
		boolean[] a = { true, false, true };
		boolean[] b = new boolean[a.length];
		m(a, a.length - 1, b); // indirizzo ritorno (a)
	}
}
