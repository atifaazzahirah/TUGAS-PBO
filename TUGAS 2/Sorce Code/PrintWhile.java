import java.util.Scanner;

 public class PrintWhile {
	public static void main(String[] args) {
	 /* Kamus : */
	  int N;
	  int i;
	  Scanner masukan=new Scanner(System.in);

	/* Program */
	 System.out.print ("Nilai N > 0 = "); /* Inisialisasi */
	 N = masukan.nextInt();
	 i = 1;

	 System.out.print ("Print i dengan WHILE: \n");
	   while (i <= N) { 
	      System.out.println (i);
              i++;
	    };
	}
}