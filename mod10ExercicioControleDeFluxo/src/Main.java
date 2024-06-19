import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static ArrayList<Aluno> listaAlunos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean sair = false;

        while (!sair) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    criarAluno();
                    break;
                case 2:
                    listarAlunos();
                    break;
                case 3:
                    buscarAlunoPorCpf();
                    break;
                case 0:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        }
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("MENU:");
        System.out.println("1 - Criar Aluno");
        System.out.println("2 - Listar todos os alunos");
        System.out.println("3 - Ver status do aluno por CPF");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void criarAluno() {
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do aluno: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado

        System.out.print("Digite o CPF do aluno: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite a nota 1 do aluno: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota 2 do aluno: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota 3 do aluno: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a nota 4 do aluno: ");
        double nota4 = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, idade, cpf, nota1, nota2, nota3, nota4);
        listaAlunos.add(aluno);
        System.out.println("Aluno criado com sucesso!\n");
    }

    private static void listarAlunos() {
        System.out.println("Lista de Alunos:");
        for (Aluno aluno : listaAlunos) {
            aluno.exibirInformacoes();
            System.out.println("-".repeat(30));
        }
    }

    private static void buscarAlunoPorCpf() {
        System.out.print("Digite o CPF do aluno que deseja buscar: ");
        String cpfBusca = scanner.nextLine();

        boolean encontrado = false;
        for (Aluno aluno : listaAlunos) {
            if (aluno.getCpf().equals(cpfBusca)) {
                aluno.exibirInformacoes();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Aluno com CPF " + cpfBusca + " não encontrado.\n");
        }
    }
}