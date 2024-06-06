package artefato2;
import java.util.Scanner;

class Produto {
    String nome;
    String dataValidade;
    int quantidade;
    int tipoPromocao; // 10, 20, 30, 40 ou 50 (% de desconto)

    Produto(String nome, String dataValidade, int quantidade, int tipoPromocao) {
        this.nome = nome;
        this.dataValidade = dataValidade;
        this.quantidade = quantidade;
        this.tipoPromocao = tipoPromocao;
    }
}

public class artefato2 {
    static Produto[] produtos = new Produto[100];
    static int contador = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar produto em promoção");
            System.out.println("2. Exibir produtos em promoção");
            System.out.println("3. Buscar produto em promoção");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    adicionarProduto(scanner);
                    break;
                case 2:
                    exibirProdutos();
                    break;
                case 3:
                    buscarProduto(scanner);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    public static void adicionarProduto(Scanner scanner) {
        if (contador < produtos.length) {
            System.out.print("Digite o nome do produto: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a data de validade (dd/MM/yyyy): ");
            String dataValidade = scanner.nextLine();
            System.out.print("Digite a quantidade: ");
            int quantidade = scanner.nextInt();
            System.out.print("Digite o tipo de promoção (10, 20, 30, 40, 50): ");
            int tipoPromocao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            produtos[contador] = new Produto(nome, dataValidade, quantidade, tipoPromocao);
            contador++;
            System.out.println("Produto adicionado com sucesso!");
        } else {
            System.out.println("Limite de produtos atingido.");
        }
    }

    public static void exibirProdutos() {
        if (contador == 0) {
            System.out.println("Nenhum produto em promoção.");
        } else {
            System.out.println("Produtos em promoção:");
            for (int i = 0; i < contador; i++) {
                System.out.println("Nome: " + produtos[i].nome + ", Validade: " + produtos[i].dataValidade +
                                   ", Quantidade: " + produtos[i].quantidade + ", Promoção: " + produtos[i].tipoPromocao + "%");
            }
        }
    }

    public static void buscarProduto(Scanner scanner) {
        System.out.print("Digite o nome do produto para buscar: ");
        String nome = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < contador; i++) {
            if (produtos[i].nome.equalsIgnoreCase(nome)) {
                encontrado = true;
                System.out.println("Nome: " + produtos[i].nome + ", Validade: " + produtos[i].dataValidade +
                                   ", Quantidade: " + produtos[i].quantidade + ", Promoção: " + produtos[i].tipoPromocao + "%");
            }
        }

        if (!encontrado) {
            System.out.println("Produto não encontrado.");
        }
    }
}
