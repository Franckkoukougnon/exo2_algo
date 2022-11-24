package exo2_algo;

public class exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<100; i++) {
			if (i%3 == 0  ) {
				System.out.println("fuzzzz" );
			} else if(i%5 == 0 ) {
				System.out.println("bizzz");
			} else if(i%3 == 0 && i%5 == 0) {
				System.out.println("fuzz + bizzz");
			} else {
				System.out.println(i);
			}
		}

	}

}
