//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("Beatriz", "Rua A, 123", "123.456.789-00", "Perez", 3000.0);
        System.out.println("Nome: " + pessoaFisica.getNome());
        System.out.println("Documento: " + pessoaFisica.getDocumento());
        System.out.println("Renda: " + pessoaFisica.getRenda());

        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa X", "Rua B, 456", "12.345.678/0001-99", "Empresa X LTDA");
        System.out.println("\nNome: " + pessoaJuridica.getNome());
        System.out.println("Documento: " + pessoaJuridica.getDocumento());
    }
}