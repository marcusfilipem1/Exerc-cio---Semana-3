import java.util.Scanner;

public class VerificarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Digite o número a ser pesquisado: ");
        int numeroPesquisado = scanner.nextInt();
        
        boolean encontrado = false;
        
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == numeroPesquisado) {
                System.out.println("O número " + numeroPesquisado + " está na posição " + i + ".");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("O número " + numeroPesquisado + " não foi encontrado no array.");
        }
    }
}
