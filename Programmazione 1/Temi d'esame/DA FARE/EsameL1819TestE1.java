import java.util.Arrays;
public class EsameL1819TestE1 {
	public static void main(String[] args) {
		int[] a0 = null;
		int[] b0 = null;
	    System.out.println(EsameL1819.e1(a0,b0)==false);
		
		int[] a1 = {};
		int[] b1 = {};
	    System.out.println(EsameL1819.e1(a1,b1)==false);

	    int[] a2 = {};
		int[] b2 = null;
	    System.out.println(EsameL1819.e1(a2,b2)==false);
		
	    int[] a3 = null;
		int[] b3 = {};
	    System.out.println(EsameL1819.e1(a3,b3)==false);
		
	    int[] a4 = {1};
		int[] b4 = {0,2};
	    System.out.println(EsameL1819.e1(a4,b4)==false);
		
	    int[] a5 = {5,14,7};
	    int[] b5 = {0,7,0,6};
	    System.out.println(EsameL1819.e1(a5,b5)==false);

	    int[] a6 = {5,14,7};
	    int[] b6 = {0,8,0,9};
	    System.out.println(EsameL1819.e1(a6,b6)==true);
	    
	    int[] a7 = {5,14,10,7};
	    int[] b7 = {0,8,0,9,10};
	    System.out.println(EsameL1819.e1(a7,b7)==true);
	    
	    int[] a8 = {14,5,14,10,7};
	    int[] b8 = {0,8,0,9,0,10};
	    System.out.println(EsameL1819.e1(a8,b8)==true);
	}

}
