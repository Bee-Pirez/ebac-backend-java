import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do Aluno que deseja calcular a média: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a nota 4: ");
        double nota4 = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3, nota4);

        double media = aluno.calcularMedia();
        System.out.println("A média do aluno " + aluno.getNome() + " é " + media);

        scanner.close();
    }
}