import java.util.Arrays;
public class EsameE1819TestE2 {
	public static void main(String[] args) {

		int[]   a1 = null;
	    System.out.println("Caso  1:"+(EsameE1819.e2(a1,1,1)==true));
		
		int[]   a2 = {2};
	    System.out.println("Caso  2:"+(EsameE1819.e2(a2,0,2)==true));

		int[]   a3 = {2};
	    System.out.println("Caso  3:"+(EsameE1819.e2(a3,1,2)==false));

		int[]   a4 = {3,4};
	    System.out.println("Caso  4:"+(EsameE1819.e2(a4,0,2)==true));
		
		int[]   a5 = {3,4};
	    System.out.println("Caso  5:"+(EsameE1819.e2(a5,1,2)==true));
		
		int[]   a6 = {3,4};
	    System.out.println("Caso  6:"+(EsameE1819.e2(a6,2,2)==false));
		
		int[]   a7 = {3,5};
	    System.out.println("Caso  7:"+(EsameE1819.e2(a7,2,2)==true));
		
        int[]   a8 = {3,5,8};
        System.out.println("Caso  8:"+(EsameE1819.e2(a8,0,4)==true));
		
		int[]   a9 = {3,5,8};
	    System.out.println("Caso  9:"+(EsameE1819.e2(a9,1,4)==true));
		
		int[]   a10 = {3,5,8,9};
	    System.out.println("Caso 10:"+(EsameE1819.e2(a10,3,4)==false));	    	    
	}
}