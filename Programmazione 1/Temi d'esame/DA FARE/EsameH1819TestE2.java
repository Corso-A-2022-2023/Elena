import java.util.Arrays;

public class EsameH1819TestE2 {
	public static void main(String[] args) {

		int[] a0 = null;
		int[] b0 = null;
	    System.out.println(Arrays.equals(EsameH1819.e2(a0),b0)==true);

		int[] a1 = {};
		int[] b1 = {};
	    System.out.println(Arrays.equals(EsameH1819.e2(a1),b1)==true);
	    
		int[] a2 = {2};
		int[] b2 = {2};
	    System.out.println(Arrays.equals(EsameH1819.e2(a2),b2)==true);
	    
		int[] a3 = {3,4};
		int[] b3 = {3};
	    System.out.println(Arrays.equals(EsameH1819.e2(a3),b3)==true);

		int[] a4 = {5,3,4};
		int[] b4 = {5,4};
	    System.out.println(Arrays.equals(EsameH1819.e2(a4),b4)==true);
	    
  	    int[] a5 = {2,4,6,8};
        int[] b5 = {2,6};
	    System.out.println(Arrays.equals(EsameH1819.e2(a5),b5)==true);
	    
		int[] a6 = {1,2,3,4,5,6,7};
		int[] b6 = {1,3,5,7};
	    System.out.println(Arrays.equals(EsameH1819.e2(a6),b6)==true);
	}
}
