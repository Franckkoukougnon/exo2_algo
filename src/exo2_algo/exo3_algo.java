package exo2_algo;

public class exo3_algo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 101; i++) {
			
			if(i < 4) {
				System.out.println("le micro est ok " + i );
				
			} else {
				
				if(i %2 == 0) {
					System.out.println("Comment vous appelez vous "+ i);
				} else if (i%3 == 0){
					System.out.println("je ne parle pas binaire "+ i);
				} else if(i%5 == 0) {
					System.out.println("FizzBuzz " +i);
				} else {
					System.out.println("Où sont les toilettes " +i);
				}
				
			}
			
			
			
		}

	}

}
