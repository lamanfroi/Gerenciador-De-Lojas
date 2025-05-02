//Subclasse da Loja. (Informática)
public class Informatica extends Loja {
    private double seguroEletronicos;

    //Método Construtor
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos, int tamanhoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.seguroEletronicos = seguroEletronicos;
    }

    // Getters e Setters
    public double getSeguroEletronicos() { return seguroEletronicos; }
    public void setSeguroEletronicos(double seguroEletronicos) { this.seguroEletronicos = seguroEletronicos; }

    //Método toString()
    @Override
    public String toString() {
        return super.toString() + "\nSeguro de Eletrônicos: " + seguroEletronicos;
    }
}