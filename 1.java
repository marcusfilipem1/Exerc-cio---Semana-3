 import java.util.Scanner;

public class ContarParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int pares = 0, impares = 0;
        
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        for (int num : numeros) {
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares + ", Ímpares: " + impares);
    }
}
