
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

		for (int n = 0; n < 3; n++) {

			for (int g = 0; g < 3; g++) {

				for (int x = 0; x < 3; x++) {
					System.out.println("" + n + "" + g);
				}
			}
		}

		for (int i = 1; i < 8; i += 3) {
			System.out.println();

			for (int z = 0 + i; z < i+3; z++) {

				System.out.print(z);
			}

			for (int g = 1; g < 99; g += 10) {
				System.out.println();

				for (int z = 0 + g; z < g+10; z++) {

					System.out.print(z);
				}
		
		
		}
	}
}}
