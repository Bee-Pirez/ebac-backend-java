public class PessoaFisica extends Pessoa{
    private String cpf;
    private String sobrenome;
    private Double renda;

    //construtor
    public PessoaFisica(String nome, String endereco, String cpf, String sobrenome, Double renda) {
        super(nome, endereco);
        this.cpf = cpf;
        this.sobrenome = sobrenome;
        this.renda = renda;
    }

    @Override
    public String getDocumento(){
        return cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }
}
