import java.util.Arrays;

public class EsameA1819TestE2 {
	public static void main(String[] args) {

		int[] a0 = null;
		int[] b0 = null;
        EsameA1819.e2(a0,0);
	    System.out.println(Arrays.equals(a0,b0)==true);

		int[] a1 = {};
		int[] b1 = {};
        EsameA1819.e2(a1,1);
	    System.out.println(Arrays.equals(a1,b1)==true);
	    
		int[] a2 = {2};
		int[] b2 = {4};
        EsameA1819.e2(a2,1);
	    System.out.println(Arrays.equals(a2,b2)==true);
	    
		int[] a3 = {2};
		int[] b3 = {2};
        EsameA1819.e2(a3,2);
	    System.out.println(Arrays.equals(a3,b3)==true);

		int[] a4 = {2};
		int[] b4 = {2};
        EsameA1819.e2(a4,3);
	    System.out.println(Arrays.equals(a4,b4)==true);
	    
		int[] a5 = {4,3};
		int[] b5 = {8,3};
        EsameA1819.e2(a5,2);
	    System.out.println(Arrays.equals(a5,b5)==true);

  	    int[] a8 = {2,4,3,1};
        int[] b8 = {2,4,6,1};
        EsameA1819.e2(a8,2);
	    System.out.println(Arrays.equals(a8,b8)==true);
	    
  	    int[] a9 = {3,4, 6,1,2};
        int[] b9 = {3,4,12,1,2};
        EsameA1819.e2(a9,5);
	    System.out.println(Arrays.equals(a9,b9)==true);
	}
}
