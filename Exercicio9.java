import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = input.nextInt();

        for (int i=0; i<=10;i++) {
            int tabuada = numero * i;
            System.out.println(i + "x " + numero + " = " + tabuada);
        }

        input.close();
    }
    
}
