package Uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1006 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, med;
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		
		med = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
		
		System.out.printf("MEDIA = %.1f%n", med);
		
		
		
		sc.close();


	}

}
