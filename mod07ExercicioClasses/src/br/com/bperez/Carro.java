package br.com.bperez;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    private double preco;
    private double velocidade;

    //construtor
    public Carro(String marca, String modelo, String cor, String placa, double preco , double velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.preco = preco;
        this.velocidade = velocidade;
    }

    //getters and setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }


    //métodos
    public void exibirInformacoes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Placa: " + placa);
        System.out.println("Preco: " + preco);
        System.out.println("Velocidade: " + velocidade);
    }
}
