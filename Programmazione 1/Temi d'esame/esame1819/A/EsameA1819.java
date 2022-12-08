/**
 * ESAME PROGRAMMAZIONE 1 24/01/19
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
public class EsameA1819 {

    /** ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
     * 
     * Scrivere un metodo iterativo e1 con le seguenti caratteristiche:
     * -) e1 ha un singolo parametro, di tipo array bidimensionale (matrice) di interi; 
     * -) e1 restituisce true se nella matrice esiste almeno una riga di indice i 
     * in cui ogni elemento a partire dalla colonna i inclusa e' maggiore 
     * del precedente, ammesso che il precedente esista. In ogni altro 
     * caso il risultato deve essere false.
     * ATTENZIONE: Ricordate che m[i][j] si riferisce all'elemento di m 
     * di riga i e colonna j, m.length si riferisce al numero di righe di m,
     * m[i].length e' il numero di elementi della riga i.
     * SCRIVERE la soluzione immediatamente qui sotto.                */

    public static boolean e1(int[][] m){
        boolean esiste = false;	// true se esiste riga i che rispetta la condizione
		
		if(m != null && m.length > 1){	// devo avere almeno 2 elementi per poter fare il confronto
			for(int i = 0; i < m.length && !esiste; i++){
				boolean maggiore = true;
				if(m[i] != null && m[i].length > 0){
					for(int j = i; j < m[i].length && maggiore; j++)
						if(!(i == 0 && j == 0))
							maggiore = (m[i][j] > m[i][j-1]);
					
					esiste = maggiore;
				}
			}
		}
		return esiste;
    }
        
    /** ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
     * Scrivere un metodo involucro (wrapper o guscio) void e2 tale che:
     * -) e2 ha due parametri formali: un array di interi a, un intero v;
     * -) e2 modifica a richiamando un metodo void ricorsivo
     * co-variante e2R (in cui l'indice di ricorsione diminuisce nella 
     * chiamata ricorsiva). e2R deve raddoppiare il valore in a[i] nel 
     * caso in cui (1) i e' pari e (2) a[i] e' strettamente maggiore di v.   
     * Scrivere la soluzione immediatamente qui sotto.                */

    public static void e2(int[] a, int v){
		if(a == null || a.length == 0)
			return;
		e2R(a, v, a.length-1);
    }

    public static void e2R(int[] a, int v, int i) {
		if(i >= 0) {
			if(i%2 == 0 && a[i] > v)		// se vale (1) and (2) 
				a[i] = 2*a[i];				// --> raddoppio a[i]
			// in ogni caso chiamo ricorsivamente e2R sull'elemento precedente
			e2R(a, v, i-1);
		}	
	}
        
    /** ESERCIZIO 3 (Massimo 2 + 2 + 3 + 3 punti -- da consegnare a mano)	 
     * Sia P(i) il seguente predicato:
     *      "0+a[0]+...+a[c-1]==s all'inizio dell'iterazione i" .
     * Dato il metodo e3, dimostrare che, per ogni valore i>=0,
     * il predicato P(i) e' vero, usando il principio di induzione:
     * 1) formulare esplicitamente la base               (2 pt.)
     * 2) formulare esplicitamente il passo induttivo    (2 pt.) 
     * 3) dimostrare che il predicato al punto 1 e' vero (3 pt.)
     * 4) dimostrare che il predicato al punto 2 e' vero (3 pt.)      */
    public static int e3(int[] a) {
        int c = 0;
        int s = 0;
        // prima di ogni iterazione
        while (c < a.length) {
            // inizio dell'iterazione i >= 0			
            c = c + 1;
            s = s + a[c-1];
            // inizio dell'iterazione i+1 > 0			
        } 
        return s;
    }
	
	/* RISPOSTA
	*
	Data s == 0 + a[0] + ... + a[c-1]
	*
	1)	Base induttiva: quando i == 0
	*					ovvero quando inizialmente c = s = i = 0
	*					voglio dimostrare che s' == 0 + a[0]
	*					
	2)	Passo induttivo: suppongo che valga P(i) per qualche i>0
	*					 ovvero P(i): s == 0 + s[0] + ... + s[c - 1]
	*					 all'(i+1)-esimo passo:
	*						voglio dimostrare che s' == 0 + a[0] + ... + a[c' - 1]
	*
	*
	3)  predicato 1:	c' = 0 + 1 = 1
	*					s' = s + a[c' - 1] = 0 + a[1-1] = 0 + a[0]		è vero
	*					
	4)	predicato 2:	c" = c + 1
	*					s" = s + a[c" - 1] =	MA vale l'hp induttiva P(i)
	*					   = 0 + a[0] + ... + s[c - 1] + a[c" - 1] =	
	*					   = 0 + a[0] + ... + s[c - 1] + a[c + 1 - 1] = 
	*					   = 0 + a[0] + ... + a [c] + a[c - 1]		è vero
	*						
	*/

    /** ESERCIZIO 4 (Massimo 8 punti -- da consegnare a mano).
     * Scrivere lo stato della memoria della JVM giusto prima della 
     * disallocazione del frame di attivazione del metodo m, quando il 
     * valore di l e' pari a 0.                                       */
    public static void m(boolean[] a, int l) {
        if (l != 0) {
            a[l-1] = !a[l-1];
            m(a, l-1); // indirizzo rientro (B)
        }
    }

    public static void main(String[] args) {
        boolean[] a = {true,false};
        m(a,a.length); // indirizzo rientro (A)
    }
}
