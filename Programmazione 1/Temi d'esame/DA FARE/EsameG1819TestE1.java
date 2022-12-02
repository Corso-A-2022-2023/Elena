import java.util.Arrays;
public class EsameG1819TestE1 {
	
	public static void main(String[] args) {
		int[] a0 = null;
		int[] b0 = null;
	    System.out.println(EsameG1819.e1(a0,b0)==false);
		
		int[] a1 = {};
		int[] b1 = {};
	    System.out.println(EsameG1819.e1(a1,b1)==false);

	    int[] a2 = {};
		int[] b2 = null;
	    System.out.println(EsameG1819.e1(a2,b2)==false);
		
	    int[] a3 = null;
		int[] b3 = {};
	    System.out.println(EsameG1819.e1(a3,b3)==false);
		
	    int[] a4 = {0,4};
		int[] b4 = {0,5,0,1};
	    System.out.println(EsameG1819.e1(a4,b4)==false);//
		
	    int[] a5 = {1,7};
	    int[] b5 = {0,9,0,8};
	    System.out.println(EsameG1819.e1(a5,b5)==true);

	    int[] a6 = {7,9,2};
	    int[] b6 = {0,10,0,8};
	    System.out.println(EsameG1819.e1(a6,b6)==true);
	    
	    int[] a7 = {2,11,7};
	    int[] b7 = {0,10,0};
	    System.out.println(EsameG1819.e1(a7,b7)==true);
	    
	    int[] a8 = {7,11,2};
	    int[] b8 = {0,10,0};
	    System.out.println(EsameG1819.e1(a8,b8)==true);
	}
}