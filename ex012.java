package estudosjava;
import java.util.Scanner;

public class Ex012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fatorial;

        System.out.println("FATORAÇÃO!!");

        while (true) {
            System.out.print("Digite o número que você quer a fatoração: ");
            fatorial = sc.nextInt();

            if (fatorial >= 0) {
                System.out.println("NÚMERO VÁLIDO!");
                break;
            } else {
                System.out.println("NÚMERO INVÁLIDO. Tente novamente!");
            }
        }

        fat(fatorial);
        sc.close();
    }

    static void fat(int fatorial) {
        int resultado = 1;

        for (int i = 1; i <= fatorial; i++) {
            resultado *= i;
        }

        System.out.println("Fatorial = " + resultado);
    }
}
