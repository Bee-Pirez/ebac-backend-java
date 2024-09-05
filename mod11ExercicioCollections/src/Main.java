import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes separados por vírgula:");
        String input = scanner.nextLine();

        // Separar os nomes por vírgula
        String[] nomesArray = input.split(",");

        // Armazenar na lista
        List<String> nomesList = new ArrayList<>();
        for (String nome : nomesArray) {
            nomesList.add(nome.trim()); // Remove espaços em branco
        }

        //ordenar ordem alfabética
        Collections.sort(nomesList);
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomesList) {
            System.out.println(nome);
        }


        //


        System.out.println("Digite nomes e sexo separados por ponto e vírgula (nome,sexo; nome,sexo;):");
        String inputSexo = scanner.nextLine();
        String[] paresSexoArray = inputSexo.split(";");

        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

        for (String par : paresSexoArray) {
            String[] partes = par.split(",");
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim();

                if ("Masculino".equalsIgnoreCase(sexo)) {
                    nomesMasculinos.add(nome);
                } else if ("Feminino".equalsIgnoreCase(sexo)) {
                    nomesFemininos.add(nome);
                }
            }
        }

        //ordenar por gênero
        Collections.sort(nomesMasculinos);
        Collections.sort(nomesFemininos);

        System.out.println("Nomes Masculinos:");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }

        System.out.println("Nomes Femininos:");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }

        scanner.close();
    }
}