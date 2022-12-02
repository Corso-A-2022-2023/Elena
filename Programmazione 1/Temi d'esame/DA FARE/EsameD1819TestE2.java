import java.util.Arrays;

public class EsameD1819TestE2 {
	public static void main(String[] args) {

		boolean[] a1 = null;
		boolean[] b1 = null;
        EsameD1819.e2(a1);
	    System.out.println("Caso  1:"+(Arrays.equals(a1,b1)==true));

		boolean[] a2 = {};
		boolean[] b2 = {};
        EsameD1819.e2(a2);
	    System.out.println("Caso  2:"+(Arrays.equals(a2,b2)==true));
	    
		boolean[] a3 = {true};
		boolean[] b3 = {true};
        EsameD1819.e2(a3);
	    System.out.println("Caso  3:"+(Arrays.equals(a3,b3)==true));
	    
		boolean[] a4 = {true,false};
		boolean[] b4 = {true,false};
        EsameD1819.e2(a4);
	    System.out.println("Caso  4:"+(Arrays.equals(a4,b4)==true));

		boolean[] a5 = {true,false,true};
		boolean[] b5 = {true,true ,true};
        EsameD1819.e2(a5);
	    System.out.println("Caso  5:"+(Arrays.equals(a5,b5)==true));
	    
  	    boolean[] a6 = {true,false,true,false};
        boolean[] b6 = {true,true ,true,false};
        EsameD1819.e2(a6);
	    System.out.println("Caso  6:"+(Arrays.equals(a6,b6)==true));
	    
		boolean[] a7 = {true,false,true,false,true};
		boolean[] b7 = {true,true ,true,true ,true};
        EsameD1819.e2(a7);
	    System.out.println("Caso  7:"+(Arrays.equals(a7,b7)==true));
	}
}