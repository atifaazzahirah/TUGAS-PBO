import java.util.Scanner;
	/* Baca N, */
	/* Print i = 1 s/d N dengan ITERATE */

 public class PrintIterasi {
	public static void main(String[] args) {
	  /* Kamus : */
	    int N;
	    int i;
	    Scanner masukan=new Scanner(System.in);

	 /* Program */
	    System.out.print ("Nilai N > 0 = "); /* Inisialisasi*/
	    
		N = masukan.nextInt();
		i = 1; 
		System.out.print ("Print i dengan ITERATE : \n");
		 for (;;){
	 	    System.out.println(i); /* Proses */
		    if (i == N)
		    break;
		    else {
			i++;
		    }
		} 
	}
}