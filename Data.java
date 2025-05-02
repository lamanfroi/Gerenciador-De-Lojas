public class Data {
    private int dia;
    private int mes;
    private int ano;

    //Método Construtor
    public Data(int dia, int mes, int ano) {
        if (dataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida! Configurando para 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    //Método dataValidade
    private boolean dataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) return false;
        if (dia < 1) return false;
        
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (mes == 2 && verificaAnoBissexto()) {
            if (dia > 29) return false;
        } else {
            if (dia > diasPorMes[mes-1]) return false;
        }
        
        return true;
    }

    //Método verificaAnoBissexto() 
    public boolean verificaAnoBissexto() {
        return (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));
    }

    // Getters e Setters
    public int getDia(){
        return dia;
    }

    public void setDia(int dia){
        this.dia = dia;
    }
    
    public int getMes(){
        return mes;
    }

    public void setMes(int mes){
        this.mes = mes;
    }
    
    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    //Método toString
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}