package biblioteca;

public class LivroCristao extends Livros {
    private String basebiblica;


    LivroCristao(String capa, String nome_livro, String nome_autor, int ano_escrito, 
         String genero, int ano_publicado, String basebiblica){
            super(capa, nome_livro, nome_autor, ano_escrito, genero, ano_publicado); 
            this.basebiblica=basebiblica;
         }
    
         public String getBasebiblica(){
            return basebiblica;
         }
         public void setDadosleitor(String basebiblica){
            this.basebiblica=basebiblica;
         }
       
}
