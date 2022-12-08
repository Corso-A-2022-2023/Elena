import java.util.Arrays;

public class EsameB1819TestE1 {
	
	public static void main(String[] args) {
		int[][] a0 = null;
	    System.out.println(EsameB1819.e1(a0)==false);
		
		int[][] a1 = {};
	    System.out.println(EsameB1819.e1(a1)==false);
		
		int[][] a2 = {null};
	    System.out.println(EsameB1819.e1(a2)==false);
		
		int[][] a3 = {null
			         ,null};
	    System.out.println(EsameB1819.e1(a3)==false);
		
	    int[][] a4 = {{2}
	                 ,{3,2,1}
	                 ,{3,4,2}};
	    System.out.println(EsameB1819.e1(a4)==false);
	    // nessuna riga soddisfa la condizione

	    int[][] a5 = {{2,3}
	                 ,{3,2,1}
	                 ,{2,2,2}};
	    System.out.println(EsameB1819.e1(a5)==true);
	    // {2,3} soddisfa la condizione
	    
	    int[][] a6 = { null
			         ,{5,4,1,2,3}
	                 ,{0,1,2,3}};
	    System.out.println(EsameB1819.e1(a6)==true);
	    // {3,4,2,3} soddisfa la condizione
	    
	    int[][] a7 = { null
		             ,{5,4,1,2,3}
                     ,{0,1,2,1}};
        System.out.println(EsameB1819.e1(a7)==false);
       // nessuna riga soddisfa la condizione

	    int[][] a8 = {{5,4,1,2,3}
	                 ,null
                     ,{0,1,2,1}};
	    System.out.println(EsameB1819.e1(a8)==false);
	    // nessuna riga soddisfa la condizione
	}
}
