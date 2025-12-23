package estudosjava;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;
import java.util.Arrays;

public class Menu {
	static void data() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o DIA da data: ");
		int a = sc.nextInt();
		System.out.println("Digite o MÊS da data: ");
		int b = sc.nextInt();
		System.out.println("Digite o ANO da data:");
		int c  = sc.nextInt();
		
		System.out.println(a+"/"+b+"/"+c);
		
	}
	
	static void cal_area_circuferencia() {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Digite o Raio: ");
		double raio = sc.nextDouble();
		double area = Math.PI * Math.pow(raio , 2);
		
		System.out.println("Área da circunferência é: "+area);
	}
	
	static void conversao_temp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em Fahrenheit para conversão");
		double farh = sc.nextDouble();
		
		double conv = (farh - 32 ) * (5.0/9.0);
		System.out.println("A temperatura em Celsius é "+ conv);
	}
	
	static void hipotenusa() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro cateto: ");
		double c1 = sc.nextDouble();
		System.out.println("Digite o valor do segundo cateto: ");
		double c2 = sc.nextDouble();
		
		double resultado1 = Math.pow(c1 , 2) + Math.pow(c2 , 2);
		double hipotenusa = Math.sqrt(resultado1);
		
		System.out.printf("O valor da hipotenusa é %.2f%n", hipotenusa);

		
	}
	
	static void equacao() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor A ");
		int a = sc.nextInt();
		System.out.println("Digite o valor b ");
		int b = sc.nextInt();
		System.out.println("Digite o valor c ");
		int c = sc.nextInt();
		
		System.out.println("Sua Equação do segundo grau é ↓");
		System.out.println(a + "x² + " + b + "x + " + c + " = 0");
		
		double delta = Math.pow(b ,2) - 4*a*c;
		if (delta < 0) {
			System.out.println("A equação não possui raízes reais ");
		}else if (delta == 0.0) {
			double raiz = -b / (2.0 *a);
			System.out.println("A equação possui uma raiz real "+raiz);
		}else {
			double raiz1 = (-b + Math.sqrt(delta)) / (2.0*a);
			double raiz2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			System.out.println("A equação possui 2 raízes reais: " + raiz1 + " e " + raiz2);

		}
		
	}
	
	static void contagem_letra() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma Palavra: ");
		String palavra = sc.nextLine();
		
		Map<Character ,Integer> contagem = new HashMap<>();
		
		for(char letra: palavra.toCharArray()) {
			if (contagem.containsKey(letra)){
				contagem.put(letra , contagem.get(letra)+1);
			}else {
				contagem.put(letra,1 );
			}
			}
		System.out.println(contagem);		
	}	
	
	static void palavra_contida() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String p1  = sc.nextLine().toUpperCase();
		System.out.println("Digite a segunda palavra: ");
		String p2 = sc.nextLine().toUpperCase();
		
		if (p1.contains(p2)) {
			System.out.println("A palavra 1 "+p1+" Está contida na palavra 2 "+p2);
		}else {
			System.out.println("Não tem nenhuma palavra contida");
		}
		
	}
	
	static int[] VetorAleatorio(){
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Digite o tamanho do vetor: ");
		int tamanho = sc.nextInt();
		System.out.println("Digite o intervalo mínimo do vetor: ");
		int intervalo = sc.nextInt();
		System.out.println("Digite o valor máximo do vetor: ");
		int fim = sc.nextInt();
		
		int [] vetor = new int[tamanho];
		for (int i = 0 ; i < tamanho; i++) {
			vetor[i] = random.nextInt(fim - intervalo + 1) + intervalo;
		}

        System.out.println("O VETOR GERADO ALEATORIAMENTE É ESSE EM BAIXO:");
        System.out.println(Arrays.toString(vetor));

        return vetor;
		
	}
	
	static int vetorMaior(){
		int [] vetor = VetorAleatorio();
		int maior = vetor[0];
		
		for (int i = 1 ; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}return maior;
	}	
			
			
			
    static void despedida() {
        System.out.println("Programa encerrado. Até logo!");
	
    }
	
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		
        do {
            System.out.println("\nMENU");
            System.out.println("1 - Formação de Data");
            System.out.println("2 - Calculo da área da circunferência");
            System.out.println("3 - Conversão de Temperatura");
            System.out.println("4 - Calculo da Hipotenusa");
            System.out.println("5 - Equação 2 Grau");
            System.out.println("6 - Contagem de Letras");
            System.out.println("7 - Se a Palavra está contida na outra");
            System.out.println("8 - Gera Vetor Aleatório");
            System.out.println("9 - Gera Vetor Maior");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                data();  
            } else if (opcao == 2) {
            	cal_area_circuferencia();    
            } else if (opcao == 3) {
            	conversao_temp();
            } else if (opcao == 4){
                hipotenusa();
            }else if  (opcao == 0){
            	despedida();
            }else if (opcao == 5){
            	equacao();
            }else if (opcao == 6){
            	contagem_letra();
            }else if(opcao == 7){
            	palavra_contida();
            }else if (opcao == 8){
            	VetorAleatorio();
            }else if(opcao == 9){
            	vetorMaior();
            }else {
            	System.out.println("Tente novamente!");
            }
		
		
	}while(opcao != 0);
	sc.close();
	
	}
}