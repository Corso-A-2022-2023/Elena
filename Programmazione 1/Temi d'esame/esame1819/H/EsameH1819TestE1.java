public class EsameH1819TestE1 {
	
	public static void main(String[] args) {
		int[] a1 = null;
		int[] b1 = null;
	    System.out.println(EsameH1819.e1(a1,b1)==false);
		
		int[] a2 = {};
		int[] b2 = {};
	    System.out.println(EsameH1819.e1(a2,b2)==false);

	    int[] a3 = {};
		int[] b3 = null;
	    System.out.println(EsameH1819.e1(a3,b3)==false);
		
	    int[] a4 = null;
		int[] b4 = {};
	    System.out.println(EsameH1819.e1(a4,b4)==false);
		
	    int[] a5 = {0,4};
		int[] b5 = {0,5,0,1};
	    System.out.println(EsameH1819.e1(a5,b5)==false);
		
	    int[] a6 = {1,7};
	    int[] b6 = {0,9,0,8};
	    System.out.println(EsameH1819.e1(a6,b6)==true);

	    int[] a7 = {7,9,2};
	    int[] b7 = {0,10,0,8};
	    System.out.println(EsameH1819.e1(a7,b7)==false);
	    
	    int[] a8 = {2,9,7,8};
	    int[] b8 = {0,11,0,0,0,10};
	    System.out.println(EsameH1819.e1(a8,b8)==true);
	    
	    int[] a9 = {7,9,2,5,6,8};
	    int[] b9 = {0,11,0,10};
	    System.out.println(EsameH1819.e1(a9,b9)==true);
	}
}