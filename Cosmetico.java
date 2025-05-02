//Subclasse da Loja. (Cosmético)
public class Cosmetico extends Loja {
    private double taxaComercializacao;

    //Método Construtor
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao, int tamanhoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.taxaComercializacao = taxaComercializacao;
    }

    // Getters e Setters
    public double getTaxaComercializacao() { return taxaComercializacao; }
    public void setTaxaComercializacao(double taxaComercializacao) { this.taxaComercializacao = taxaComercializacao; }

    //Método toString()
    @Override
    public String toString() {
        return super.toString() + "\nTaxa de Comercialização: " + taxaComercializacao;
    }
}