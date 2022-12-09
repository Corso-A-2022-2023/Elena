import java.util.Arrays;
public class EsameE1819TestE1 {
	public static void main(String[] args) {

		int[][] m1 = null;
		int[]   a1 = null;
	    System.out.println("Caso  1:"+(EsameE1819.e1(m1,a1)==false));
		
		int[][] m2 = {};
		int[]   a2 = null;
	    System.out.println("Caso  2:"+(EsameE1819.e1(m2,a2)==false));

		int[][] m3 = null;
		int[]   a3 = {};
	    System.out.println("Caso  3:"+(EsameE1819.e1(m3,a3)==false));

	    int[][] m4 = {null
	    		     ,null};
		int[]   a4 = {};
	    System.out.println("Caso  4:"+(EsameE1819.e1(m4,a4)==false));
		
		int[][] m5 = {{1}};
		int[]   a5 = null;
	    System.out.println("Caso  5:"+(EsameE1819.e1(m5,a5)==false));
		
		int[][] m6 = {{1}};
		int[]   a6 = {2};
	    System.out.println("Caso  6:"+(EsameE1819.e1(m6,a6)==true));
		
		int[][] m7 = {{1, 2}
		             ,{4, 6}
		             ,{8,10}};
		int[]   a7 = {7};
	    System.out.println("Caso  7:"+(EsameE1819.e1(m7,a7)==true));
		
		int[][] m8 = {{1, 2}
                     ,{4, 6}
                     ,{8,10}};
        int[]   a8 = {5};
        System.out.println("Caso  8:"+(EsameE1819.e1(m8,a8)==false));
		
        int[][] m9 = {{1,2, 4}
                     ,{6,8,10}};
		int[]   a9 = {9};
	    System.out.println("Caso  9:"+(EsameE1819.e1(m9,a9)==true));
		
		int[][] m10 = {{1,2, 4}
                      ,{6,8,10}};
		int[]   a10 = {1,2,1,9};
	    System.out.println("Caso 10:"+(EsameE1819.e1(m10,a10)==true));	    	    
	}
}