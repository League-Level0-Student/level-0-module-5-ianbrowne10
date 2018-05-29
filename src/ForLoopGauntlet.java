
public class ForLoopGauntlet {
	public static void main(String[] args) {
	for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}

		for (int j = 100; j > -1; j--) {
			System.out.println(j);
		}

		for (int t = 2; t < 101; t += 2) {
			System.out.println(t);
		}

		for (int s = 0; s < 100; s++) {
			if (s % 2 == 1) {
				System.out.println(s);
			}
		}

		for (int m = 0; m < 501; m++) {
			if (m % 2 == 1) {
				System.out.println(m + " is odd!");
			}
			if (m % 2 == 0) {
				System.out.println(m + " is even!");
			}
		}

		for (int e = 7; e < 778; e += 7) {
			System.out.println(e);
		}

		for (int p = 2006; p < 2018; p++) {
			System.out.println("In " + p + " I was " + (p - 2006) + " years old!");
		}
		for (int c = 0; c < 10; c++) {

			for (int l = 0; l < 3; l++) {
				System.out.println(l);
			}
		}

	//1	
		
		
		for (int n = 0; n < 3; n++) {

		for (int x = 0; x < 3; x++) {
					System.out.println(" " + n + " " + x);
				}
			}
		

	//2
	
	for(int p =1; p < 10; p+=3) {	
	for(int r=p; r < p+3; r++) {
System.out.print( r);
	}
System.out.println();
	
		
	}
	for(int p =1; p < 101; p+=10) {	
	for(int r=p; r < p+10; r++) {
System.out.print(" " +r+ " " );
	}
System.out.println();
	
	
	
	}

	for(int x = 1; x< 7; x++) {
for (int i = 0; i < x; i++) {
	System.out.print("*");
}
System.out.println();
	}
	
	
	
	
	
	}}
