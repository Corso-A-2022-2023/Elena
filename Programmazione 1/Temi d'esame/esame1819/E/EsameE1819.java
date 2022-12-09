/**
 * ESAME PROGRAMMAZIONE 1 07/02/19 pomeriggio
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
public class EsameE1819 {

    /**
	 * ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo e1 con le seguenti caratteristiche:
	 * -) e1 ha due parametri: un array bidimensionale di interi (matrice) m, 
	 * un array di interi a. L'ipotesi su m e' che o tutte le righe sono null, 
	 * oppure tutte hanno la stessa lunghezza. Quindi, m non e' detto che sia 
	 * quadrata.
	 * -) e1 restituisce true se, per ogni elemento m[i][i], esiste un elemento 
	 * di a maggiore di m[i][i]. In ogni altro caso e1 restituisce false.
	 * ATTENZIONE: m[i][j] si riferisce all'elemento di m di riga i e 
	 * colonna j; m.length si riferisce al numero di righe di m;
	 * m[i].length e' il numero di elementi della riga i.
	 * 
	 * SCRIVERE la soluzione immediatamente qui sotto.               
	 */
	 
	public static boolean e1(int[][] m, int[] a){
		boolean ogniElemento = true;
		
		if(m == null || m.length == 0 || a == null || a.length == 0)
			ogniElemento = false;
		else{
			for(int i = 0; i < m.length && ogniElemento; i++){
				boolean maggiore = false;
				if(m[i] != null && m[i].length > 0){
					if(m[i].length > i)
						for(int k = 0; k < a.length && !maggiore; k++)
							maggiore = a[k] > m[i][i];
					else
						maggiore = true;
				}
				ogniElemento = maggiore;
			}
		}
		return ogniElemento;
	}
	
	/**
	 * ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo e2 con tre parametri: un array di interi a, 
	 * un intero f, un intero d. Il metodo e2 deve restituire false se d e' 
	 * divisore intero di almeno un elemento di a il cui indice sia nell'intervallo 
	 * 0 incluso ed f escluso. In ogni altro caso, e2 deve restituire true.
	 * Il metodo e2 svolge il proprio compito richiamando e2R, metodo ricorsivo 
	 * contro-variante (l'indice di e2R che guida la ricorsione aumenta).
	 *   
	 * SCRIVERE la soluzione immediatamente qui sotto.               
	 */
	 
	public static boolean e2(int[] a, int f, int d){
		boolean ris = true;
		if(a != null && a.length > 0 && f >= 0 && d > 0)
			ris = e2R(a, 0, f, d);
		return ris;
	}

	public static boolean e2R(int[] a, int i, int f, int d){
		if(i == f)
			return true;
		else{
			return !(a[i] % d == 0) && e2R(a, i+1, f, d);
		}
	}
	
	/** ESERCIZIO 3 (Massimo 2 + 2 + 3 + 3 punti -- da consegnare a mano)	 
	 * Sia P(n) il seguente predicato:
	 *        e3(n) == #{d | 0<= d <=n && d dispari} .
	 * ovvero, P(n) afferma che il risultato di e3(n) coincide col numero
	 * di valori dispari compresi nell'intervallo di indici tra 0 ed n, 
	 * estremi inclusi.
	 * Dato il metodo e3, dimostrare che, per ogni valore n>=0,
	 * il predicato P(n) e' vero, usando il principio di induzione:
	 * 1) formulare esplicitamente la base               (2 pt.) 
	 * 2) formulare esplicitamente il passo induttivo    (2 pt.) 
	 * 3) dimostrare che il predicato al punto 1 e' vero (3 pt.)
	 * 4) dimostrare che il predicato al punto 2 e' vero (3 pt.)      */
	public static int e3(int n) {
		if (n==0)
			return 0;
		else if (n%2==1)
			return e3(n-1)+1;
		else
			return e3(n-1)+0;
	}

	/** ESERCIZIO 4 (Massimo 8 punti -- da consegnare a mano).
	 * Scrivere lo stato della memoria della JVM giusto prima della 
	 * disallocazione del frame di attivazione del metodo m, 
	 * in cui il valore del parametro i e' pari a 0.                     */
	public static void m(boolean[] a, int i) {
		if (i==0) {
			if(a[i]) {
				int[] x = {1};
			}
		} else {
        	int[] x = {0};
        	m(a,i-1); // (B)
		}
	}
	/******************************************/
	public static void main(String[] args) {
		boolean[] a = {true,false};
		m(a,a.length-1); // (A)
	}
}
