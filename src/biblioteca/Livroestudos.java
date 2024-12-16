package biblioteca;

public class Livroestudos extends Livros {
    private String dadoscientificos;

    Livroestudos(String capa, String nome_livro, String nome_autor, int ano_escrito, 
    String genero, int ano_publicado, String dadoscientificos){
       super(capa, nome_livro, nome_autor, ano_escrito, genero, ano_publicado); 
       this.dadoscientificos=dadoscientificos;
    }
    public String getDadoscientificos(){
       return dadoscientificos;
    }
    public void setDadoscientificos(String dadoscientificos){
       this.dadoscientificos=dadoscientificos;
    }
    
}
