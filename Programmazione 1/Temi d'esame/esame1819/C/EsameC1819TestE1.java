import java.util.Arrays;
public class EsameC1819TestE1 {
	public static void main(String[] args) {
		int[]   a0 = null;
		int[][] m0 = null;
	    System.out.println(EsameC1819.e1(a0,m0)==0);
		
		int[]   a1 = {};
		int[][] m1 = {};
	    System.out.println(EsameC1819.e1(a1,m1)==0);

	    int[]   a2 = {};
		int[][] m2 = null;
	    System.out.println(EsameC1819.e1(a2,m2)==0);
		
	    int[]   a3 = {};
		int[][] m3 = {null};
	    System.out.println(EsameC1819.e1(a3,m3)==0);
		
	    int[]   a4 = {1};
		int[][] m4 = {null};
	    System.out.println(EsameC1819.e1(a4,m4)==0);
		
	    int[]   a5 = {4,6,10};
	    int[][] m5 = {{1,6}
	                 ,{5,6,7,8}};
	    System.out.println(EsameC1819.e1(a5,m5)==10);

	    int[]   a6 = {4,5,10};
	    int[][] m6 = {{1,2,3,4}
	                 , null
	                 ,{5,6}};
	    System.out.println(EsameC1819.e1(a6,m6)==9);
	    
	    int[]   a7 = {40,50,10};
	    int[][] m7 = {{1,2,3,4}
	                 ,{7,8}};
	    System.out.println(EsameC1819.e1(a7,m7)==0);
	    
	    int[]   a8 = {40,50,10};
	    int[][] m8 = {{5,6,8}
	                 , null
	                 ,{1,2,3,4}
	                 , null    };
	    System.out.println(EsameC1819.e1(a8,m8)==0);
	}
}