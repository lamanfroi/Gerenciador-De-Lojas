import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Loja loja = null;
        Produto produto = null;
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer
            
            switch (opcao) {
                case 1:
                    loja = criarLoja(scanner);
                    break;
                case 2:
                    produto = criarProduto(scanner);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida");
                    continue;
            }
            
            if (loja != null && produto != null) {
                Data dataTeste = new Data(20, 10, 2023);
                System.out.println("\nResultados:");
                System.out.println(produto.estaVencido(dataTeste) ? "PRODUTO VENCIDO" : "PRODUTO NÃO VENCIDO");
                System.out.println(loja);
                break;
            }
        }
    }
    
    private static Loja criarLoja(Scanner scanner) {
        System.out.println("\nCriando uma nova loja:");
        
        System.out.print("Nome da loja: ");
        String nome = scanner.nextLine();
        
        System.out.print("Quantidade de funcionários: ");
        int qtdFunc = scanner.nextInt();
        
        System.out.print("Salário base (-1 para não informar): ");
        double salarioBase = scanner.nextDouble();
        scanner.nextLine(); // Limpar buffer
        
        System.out.println("\nEndereço da loja:");
        Endereco endereco = criarEndereco(scanner);
        
        System.out.println("\nData de fundação:");
        Data dataFundacao = criarData(scanner);
        
        return new Loja(nome, qtdFunc, salarioBase, endereco, dataFundacao, 10); // Tamanho estoque padrão 10
    }
    
    private static Produto criarProduto(Scanner scanner) {
        System.out.println("\nCriando um novo produto:");
        
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Limpar buffer
        
        System.out.println("\nData de validade:");
        Data dataValidade = criarData(scanner);
        
        return new Produto(nome, preco, dataValidade);
    }
    
    private static Endereco criarEndereco(Scanner scanner) {
        System.out.print("Nome da rua: ");
        String rua = scanner.nextLine();
        
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();
        
        System.out.print("Estado: ");
        String estado = scanner.nextLine();
        
        System.out.print("País: ");
        String pais = scanner.nextLine();
        
        System.out.print("CEP: ");
        String cep = scanner.nextLine();
        
        System.out.print("Número: ");
        String numero = scanner.nextLine();
        
        System.out.print("Complemento: ");
        String complemento = scanner.nextLine();
        
        return new Endereco(rua, cidade, estado, pais, cep, numero, complemento);
    }
    
    private static Data criarData(Scanner scanner) {
        System.out.print("Dia: ");
        int dia = scanner.nextInt();
        
        System.out.print("Mês: ");
        int mes = scanner.nextInt();
        
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer

        return new Data(dia, mes, ano);
    }
}