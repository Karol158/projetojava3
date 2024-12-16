package biblioteca;

public class Registro  {
    private String data_pegoulivro;
    private String data_devolucao;
    private Dadosleitor dados_leitor;
    private Opiniao feedback;
    
    
    Registro(String data_pegoulivro, String data_devolucao) {
        this.data_pegoulivro = data_pegoulivro;
        this.data_devolucao = data_devolucao;
        
    }
    public Dadosleitor getDadosleitor(){
       return dados_leitor;
    }
    public void setDadosleitor(Dadosleitor dados_leitor){
       this.dados_leitor=dados_leitor;
    }
    
    public String getDataPegouLivro() {
        return this.data_pegoulivro;
    }

    public void setDataPegouLivro(String data_pegoulivro) {
        this.data_pegoulivro = data_pegoulivro;
    }

    public String getDataDevolucao() {
        return this.data_devolucao;
    }

    public void setDataDevolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }
    public Opiniao getOpiniao(){
       return this.feedback;
      }
      public void setOpiniao(Opiniao feedback){
       this.feedback=feedback;
      }

}
