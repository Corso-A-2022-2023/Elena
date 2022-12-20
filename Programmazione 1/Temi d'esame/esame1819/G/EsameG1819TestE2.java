import java.util.Arrays;

public class EsameG1819TestE2 {
	public static void main(String[] args) {

		int[] a0 = null;
		int[] b0 = null;
	    System.out.println(Arrays.equals(EsameG1819.e2(a0),b0)==true);

		int[] a1 = {};
		int[] b1 = {};
	    System.out.println(Arrays.equals(EsameG1819.e2(a1),b1)==true);
	    
		int[] a2 = {2};
		int[] b2 = {3};
	    System.out.println(Arrays.equals(EsameG1819.e2(a2),b2)==true);
	    
		int[] a3 = {3,4};
		int[] b3 = {4,3};
	    System.out.println(Arrays.equals(EsameG1819.e2(a3),b3)==true);

		int[] a4 = {5,3,4};
		int[] b4 = {6,2,5};
	    System.out.println(Arrays.equals(EsameG1819.e2(a4),b4)==true);
	    
  	    int[] a5 = {2,4,6,8};
        int[] b5 = {3,3,7,7};
	    System.out.println(Arrays.equals(EsameG1819.e2(a5),b5)==true);
	    
		int[] a6 = {1,2,3,4,5,6};
		int[] b6 = {2,1,4,3,6,5};
	    System.out.println(Arrays.equals(EsameG1819.e2(a6),b6)==true);
	}
}
