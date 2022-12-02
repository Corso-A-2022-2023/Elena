import java.util.Arrays;
public class EsameL1819TestE2 {
	public static void main(String[] args) {

		int[] a0 = null;
		int[] b0 = null;
	    System.out.println(Arrays.equals(EsameL1819.e2(a0),b0)==true);

		int[] a1 = {};
		int[] b1 = {};
	    System.out.println(Arrays.equals(EsameL1819.e2(a1),b1)==true);
	    
		int[] a2 = {2};
		int[] b2 = {2};
	    System.out.println(Arrays.equals(EsameL1819.e2(a2),b2)==true);
	    
		int[] a3 = {3,4};
		int[] b3 = {3};
	    System.out.println(Arrays.equals(EsameL1819.e2(a3),b3)==true);

		int[] a4 = {5,3,4};
		int[] b4 = {4,5};
	    System.out.println(Arrays.equals(EsameL1819.e2(a4),b4)==true);
	    
  	    int[] a5 = {2,4,6,8};
        int[] b5 = {6,2};
	    System.out.println(Arrays.equals(EsameL1819.e2(a5),b5)==true);
	    
		int[] a6 = {1,2,3,4,5,6};
		int[] b6 = {5,3,1};
	    System.out.println(Arrays.equals(EsameL1819.e2(a6),b6)==true);
	}
}
