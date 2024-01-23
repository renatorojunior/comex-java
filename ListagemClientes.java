import java.time.Year;

public class ListagemClientes {
    public static void main(String[] args) {
        // Cliente 1
        String nomeCliente1 = "Fulano";
        int anoNascimentoCliente1 = 1980;

        // Cliente 2
        String nomeCliente2 = "Sicrano";
        int anoNascimentoCliente2 = 1995;

        // Calcular idade
        int idadeCliente1 = calcularIdade(anoNascimentoCliente1);
        int idadeCliente2 = calcularIdade(anoNascimentoCliente2);

        // Determinar característica etária
        String caracteristicaCliente1 = getCaracteristicaEtaria(idadeCliente1);
        String caracteristicaCliente2 = getCaracteristicaEtaria(idadeCliente2);

        // Listagem dos clientes
        System.out.println(">>> Listagem dos Clientes");
        System.out.println("--------------------------------------------------");
        System.out.println("Nome: " + nomeCliente1);
        System.out.println("Data de Nascimento: " + anoNascimentoCliente1);
        System.out.println("Idade: " + idadeCliente1);
        System.out.println("Característica Etária: " + caracteristicaCliente1);
        System.out.println("--------------------------------------------------");
        System.out.println("Nome: " + nomeCliente2);
        System.out.println("Data de Nascimento: " + anoNascimentoCliente2);
        System.out.println("Idade: " + idadeCliente2);
        System.out.println("Característica Etária: " + caracteristicaCliente2);
    }

    // Método para calcular a idade do cliente
    private static int calcularIdade(int anoNascimento) {
        int anoAtual = Year.now().getValue();
        return anoAtual - anoNascimento;
    }

    // Método para determinar a característica etária do cliente
    private static String getCaracteristicaEtaria(int idade) {
        if (idade <= 17) {
            return "ADOLESCENTE";
        } else if (idade >= 18 && idade <= 29) {
            return "JOVEM";
        } else if (idade >= 30 && idade <= 59) {
            return "ADULTO";
        } else {
            return "IDOSO";
        }
    }
}
