public class Aluno {
    private String nome;
    private int idade;
    private String cpf;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public Aluno(String nome, int idade, String cpf, double nota1, double nota2,double nota3,double nota4) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double calcularMedia(){
        return (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4;
    }

    public String verificarStatus() {
        double media = calcularMedia();
        if(media >= 7){
            return "Aluno aprovado com sucesso!";
        } else if(media >= 5){
            return "Aluno em recuperação!";
        } else {
            return "Aluno reprovado!";
        }
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("Nota1: " + nota1);
        System.out.println("Nota2: " + nota2);
        System.out.println("Nota3: " + nota3);
        System.out.println("Nota4: " + nota4);
        System.out.println("Média" + calcularMedia());
        System.out.println("Status: " + verificarStatus());
    }
}
