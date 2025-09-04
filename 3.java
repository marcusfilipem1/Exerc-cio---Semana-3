import java.util.Scanner;

public class RemoverNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("Digite o nome que deseja remover: ");
        String nomeRemover = scanner.nextLine();
        
        boolean removido = false;
        
        for (int i = 0; i < 10; i++) {
            if (nomes[i].equals(nomeRemover)) {
                nomes[i] = "---";
                removido = true;
                System.out.println("Nome removido com sucesso.");
                break;
            }
        }

        if (!removido) {
            System.out.println("O nome " + nomeRemover + " não foi encontrado no array.");
        }

        System.out.println("Array após remoção:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
