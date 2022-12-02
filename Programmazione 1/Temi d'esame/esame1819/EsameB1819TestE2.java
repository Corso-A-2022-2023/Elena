import java.util.Arrays;

public class EsameB1819TestE2 {
	public static void main(String[] args) {

		int[] a0 = null;
		int[] b0 = null;
        EsameB1819.e2(a0,0);
	    System.out.println(Arrays.equals(a0,b0)==true);

		int[] a1 = {};
		int[] b1 = {};
        EsameB1819.e2(a1,1);
	    System.out.println(Arrays.equals(a1,b1)==true);
	    
		int[] a2 = {2};
		int[] b2 = {2};
        EsameB1819.e2(a2,3);
	    System.out.println(Arrays.equals(a2,b2)==true);
	    // a[0]<3, ma a[0] pari
	    
		int[] a3 = {3};
		int[] b3 = {6};
        EsameB1819.e2(a3,4);
	    System.out.println(Arrays.equals(a3,b3)==true);
	    // !(a[0]<4) e a[0] dispari

		int[] a4 = {5,3};
		int[] b4 = {5,6};
        EsameB1819.e2(a4,4);
	    System.out.println(Arrays.equals(a4,b4)==true);
	    // !(a[0]<4) anche se a4[0] dispari
	    //   a[1]<4  e a4[1] dispari
	    
  	    int[] a5 = {2,4,6,8};
        int[] b5 = {2,4,6,8};
        EsameB1819.e2(a5,9);
	    System.out.println(Arrays.equals(a5,b5)==true);
	    // tutti inferiori a 9, ma nessun dispari
	    
  	    int[] a6 = {3, 5, 7};
        int[] b6 = {6,10,14};
        EsameB1819.e2(a6,9);
	    System.out.println(Arrays.equals(a6,b6)==true);
	    // Tutti inferiori a 9 e dispari  
	    
		int[] a7 = {1,2,3,4,5,6};
		int[] b7 = {2,2,6,4,5,6};
        EsameB1819.e2(a7,4);
	    System.out.println(Arrays.equals(a7,b7)==true);
	}
}
