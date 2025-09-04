import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContarOcorrencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        Map<Integer, Integer> ocorrencias = new HashMap<>();
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }
        
        for (int num : numeros) {
            ocorrencias.put(num, ocorrencias.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : ocorrencias.entrySet()) {
            System.out.println("O número " + entry.getKey() + " aparece " + entry.getValue() + " vez(es).");
        }
    }
}
