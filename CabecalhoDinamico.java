import java.util.Scanner;

public class CabecalhoDinamico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de asteriscos para o cabeçalho: ");
        int quantidade = scanner.nextInt();

        // Cabeçalho dinâmico
        for (int i = 0; i < quantidade; i++) {
            System.out.print("*");
        }

        System.out.println();

        System.out.println("Bem Vindo ao COMEX!");

        // Rodapé dinâmico
        for (int i = 0; i < quantidade; i++) {
            System.out.print("*");
        }

        System.out.println();
    }
}
