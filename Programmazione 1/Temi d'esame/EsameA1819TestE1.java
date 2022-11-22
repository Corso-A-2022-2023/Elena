import java.util.Arrays;

public class EsameA1819TestE1 {
	
	public static void main(String[] args) {
		int[][] a0 = null;
	    System.out.println(EsameA1819.e1(a0)==false);
		
		int[][] a1 = {};
	    System.out.println(EsameA1819.e1(a1)==false);
		
		int[][] a2 = {null};
	    System.out.println(EsameA1819.e1(a2)==false);
		
		int[][] a3 = {null
			         ,null};
	    System.out.println(EsameA1819.e1(a3)==false);
		
	    int[][] a4 = {{1,2,3}
	                 ,{3,4,1}
			         ,{3,4,2}};
	    System.out.println(EsameA1819.e1(a4)==true);
	    // {1,2,3} soddisfa la condizione

	    int[][] a5 = {{3,4,1}
			         ,{3,2,1}
			         ,{3,4,2}};
	    System.out.println(EsameA1819.e1(a5)==false);
	    // nessuna riga soddisfa la condizione
	    
	    int[][] a6 = { null
			         ,{3,2,4}
			         ,{3,4,2}};
	    System.out.println(EsameA1819.e1(a6)==false);
	    // nessuna riga soddifsfa la condizione.
	    
	    int[][] a7 = { null
			         ,{3,2,1}
			         ,{3,1,2}};
	    System.out.println(EsameA1819.e1(a7)==true);
	    // {3,1,2} soddisfa la condizione

	    int[][] a8 = { null
			         ,{1,3,2,4}
			         ,{3,1,2,4}};
	    System.out.println(EsameA1819.e1(a8)==true);
	    // {3,1,2,4} soddisfa la condizione
	}
}
