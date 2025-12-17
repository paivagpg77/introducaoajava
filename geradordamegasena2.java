import java.util.Random;

public class GeradorDaMegaSena2 {
	public static void main(String[] args) {
		Random generate = new Random();
		
		//Utilização do For para geração
		for(int i = 0; i < 6; i++) {
			int number = generate.nextInt(60);
			System.out.println("Número "+(i+1)+" :"+number);
			
		}
		
	}

}
