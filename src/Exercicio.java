import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tamanho vetor: ");
        int tamanho = sc.nextInt();
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Vetor [%d}: \n", i);
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Vetor[%d]: %d \n", i, vetor[i]);
        }

        int soma = 0;

        for (int i = 0; i < tamanho; i++) {
            soma += vetor[i];
        }

        System.out.println("A soma dos elementos é " + soma);

        int maior = vetor[0];
        int menor = vetor[0];

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        System.out.println("Maior:" + maior);
        System.out.println("Menor: " + menor);
    }
}

