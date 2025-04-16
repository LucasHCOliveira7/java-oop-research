public class Carro {

    // Atributos
    private String modelo;
    private String cor;
    private int ano;
    private String placa;
    private String combustivel;

    // Construtor
    public Carro(String modelo, String cor, int ano, String placa, String combustivel) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.placa = placa;
        this.combustivel = combustivel;
    }

    // Getters e Setters
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    // Métodos para simular ações do carro
    public void ligar() {
        System.out.println("Carro ligado.");
    }

    public void desligar() {
        System.out.println("Carro desligado.");
    }

    public void acelerar() {
        System.out.println("Carro acelerando...");
    }

    public void frear() {
        System.out.println("Carro freando...");
    }

    // Método main para testar a classe
    public static void main(String[] args) {

        Carro carro = new Carro("Fusca", "azul", 1970, "ABC-1234", "gasolina");
        
        System.out.println("INFOS DO CARRO:");
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Cor: " + carro.cor);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Placa: " + carro.placa);
        System.out.println("Combustível: " + carro.combustivel);

        carro.ligar();
        carro.acelerar();
        carro.frear();
        carro.desligar();
    }

}
