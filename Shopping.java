public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public static void main(String[] args) {
        // Configurações iniciais
        Endereco enderecoShopping = new Endereco("Avenida Principal", "Rio de Janeiro", "RJ", "Brasil", "20000-000", "1000", null);
        Shopping shopping = new Shopping("Shopping Rio", enderecoShopping, 20);

        // Criando uma loja de alimentação
        Data dataAlvara = new Data(1, 1, 2023);
        Alimentacao lanchonete = new Alimentacao(
            "Lanchonete Sabor", 
            5, 
            2000, 
            enderecoShopping, 
            new Data(10, 5, 2020), 
            dataAlvara,
            30
        );

        // Adicionando ao shopping
        shopping.insereLoja(lanchonete);

        // Listando lojas de alimentação
        System.out.println("Lojas de alimentação: " + shopping.quantidadeLojasPorTipo("Alimentacao"));
    }
    
    public Shopping(String nome, Endereco endereco, int quantidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeLojas];
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int count = 0;
        String tipo = tipoLoja.toLowerCase();
        
        for (Loja loja : lojas) {
            if (loja != null) {
                switch (tipo) {
                    case "cosmético":
                    case "cosmetico":
                        if (loja instanceof Cosmetico) count++;
                        break;
                    case "vestuário":
                    case "vestuario":
                        if (loja instanceof Vestuario) count++;
                        break;
                    case "bijuteria":
                        if (loja instanceof Bijuteria) count++;
                        break;
                    case "alimentação":
                    case "alimentacao":
                        if (loja instanceof Alimentacao) count++;
                        break;
                    case "informática":
                    case "informatica":
                        if (loja instanceof Informatica) count++;
                        break;
                    default:
                        return -1;
                }
            }
        }
        return count;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica maisCara = null;
        double maiorSeguro = 0;
        
        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica info = (Informatica) loja;
                if (info.getSeguroEletronicos() > maiorSeguro) {
                    maiorSeguro = info.getSeguroEletronicos();
                    maisCara = info;
                }
            }
        }
        return maisCara;
    }

    // Getters e Setters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public Loja[] getLojas() {
        return lojas;
    }

    @Override
    public String toString() {
        return "Shopping: " + nome + "\n" + endereco + "\nQuantidade de Lojas: " + lojas.length;
    }
}