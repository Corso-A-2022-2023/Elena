import java.util.Arrays;

public class EsameC1819TestE2 {
	public static void main(String[] args) {

		int[] a0 = null;
		int[] b0 = null;
        EsameC1819.e2(a0);
	    System.out.println(Arrays.equals(a0,b0)==true);

		int[] a1 = {};
		int[] b1 = {};
        EsameC1819.e2(a1);
	    System.out.println(Arrays.equals(a1,b1)==true);
	    
		int[] a2 = {2};
		int[] b2 = {2};
        EsameC1819.e2(a2);
	    System.out.println(Arrays.equals(a2,b2)==true);
	    
		int[] a3 = {3,4};
		int[] b3 = {3,3};
        EsameC1819.e2(a3);
	    System.out.println(Arrays.equals(a3,b3)==true);

		int[] a4 = {5,3,5};
		int[] b4 = {5,5,5};
        EsameC1819.e2(a4);
	    System.out.println(Arrays.equals(a4,b4)==true);
	    
  	    int[] a5 = {2,4,6,8};
        int[] b5 = {2,2,6,6};
        EsameC1819.e2(a5);
	    System.out.println(Arrays.equals(a5,b5)==true);
	    
		int[] a6 = {1,2,3,4,5,6};
		int[] b6 = {1,1,3,3,5,5};
        EsameC1819.e2(a6);
	    System.out.println(Arrays.equals(a6,b6)==true);
	}
}
