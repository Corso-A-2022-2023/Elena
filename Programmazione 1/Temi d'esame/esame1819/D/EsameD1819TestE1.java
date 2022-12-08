import java.util.Arrays;
public class EsameD1819TestE1 {
	public static void main(String[] args) {

		int[][] m0 = null;
	    System.out.println("Caso  1:"+(EsameD1819.e1(m0)==false));
		
		int[][] m1 = {};
	    System.out.println("Caso  2:"+(EsameD1819.e1(m1)==false));

		int[][] m2 = {{1}};
	    System.out.println("Caso  3:"+(EsameD1819.e1(m2)==false));
		
		int[][] m3 = {{1}
		             ,{2}};
	    System.out.println("Caso  4:"+(EsameD1819.e1(m3)==true));
		
		int[][] m4 = {{1}
                     ,{1,2}};
	    System.out.println("Caso  5:"+(EsameD1819.e1(m4)==false));
		
		int[][] m5 = {{0,1}
                     ,{0,2,3}
                     ,{1,2}};
	    System.out.println("Caso  6:"+(EsameD1819.e1(m5)==true));

		int[][] m6 = {{0,1}
                     ,{0,2,3}
                     ,null};
	    System.out.println("Caso  7:"+(EsameD1819.e1(m6)==false));
	    
		int[][] m7 = {{0,1}
                     ,null
                     ,{0,2,3}};
	    System.out.println("Caso  8:"+(EsameD1819.e1(m7)==false));
	    
		int[][] m8 = {{0,1}
                     ,{0,2,3}
                     ,{0,4}
                     ,{0,5,3}};
		System.out.println("Caso  9:"+(EsameD1819.e1(m8)==true));
		
		int[][] m9 = {null
		             ,null
                     ,null};
        System.out.println("Caso 10:"+(EsameD1819.e1(m9)==false));
	}
}