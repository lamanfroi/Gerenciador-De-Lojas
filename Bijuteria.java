//Subclasse da Loja. (Bijuteria)
public class Bijuteria extends Loja {
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, 
                    Endereco endereco, Data dataFundacao, double metaVendas, int tamanhoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.metaVendas = metaVendas;
    }

    // Getters e Setters
    public double getMetaVendas() { return metaVendas; }
    public void setMetaVendas(double metaVendas) { this.metaVendas = metaVendas; }

    //Método toString()
    @Override
    public String toString() {
        return super.toString() + "\nMeta de Vendas: " + metaVendas;
    }
}