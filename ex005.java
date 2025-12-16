import java.util.Scanner;

public class Ex005{
    public static void main(String[] args){
       Scanner sc =  new Scanner(System.in);

       System.out.println("Digite o primeiro número: ");
       int x = sc.nextInt();

       System.out.println("Digite o segundo número: ");
       int y = sc.nextInt();

       sum(x,y);
       sc.close();
    }

    static void sum(int x, int y) {
        System.out.println("A soma deles é :" +(x+y));
    }
}