import java.util.Random;
import java.util.Scanner;


public class Exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite = 0;

        System.out.println("Jogo de Adivinhação");
        System.out.println("Tente adivinhar o numero escondido entre 1 e 100.");

        while (palpite != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            palpite = input.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Tente um número maior.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Tente um número menor.");
            } else {
                System.out.println("Parabéns! Você acertou o número secreto em " + tentativas + " tentativas.");
            }
        }

        input.close();
    }
    
}

