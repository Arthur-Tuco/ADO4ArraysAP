import java.util.Scanner;

public class ExercicioFuncao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanho = lerTamanho(sc);
        int[] vetor = preencherVetor(sc, tamanho);

        imprimirVetor(vetor);

        int soma = calcularSoma(vetor);
        System.out.println("A soma dos elementos é " + soma);

        exibirMaiorMenor(vetor);
    }

    public static int lerTamanho(Scanner sc) {
        System.out.println("Tamanho vetor: ");
        return sc.nextInt();
    }

    public static int[] preencherVetor(Scanner sc, int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Vetor [%d]: \n", i);
            vetor[i] = sc.nextInt();
        }
        return vetor;
    }

    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Vetor[%d]: %d \n", i, vetor[i]);
        }
    }

    public static int calcularSoma(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }

    public static void exibirMaiorMenor(int[] vetor) {
        if (vetor.length == 0) return;

        int maior = vetor[0];
        int menor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}