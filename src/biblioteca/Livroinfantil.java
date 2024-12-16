package biblioteca;

public class Livroinfantil extends Livros{
    private String linguagem;
  
    Livroinfantil(String capa, String nome_livro, String nome_autor, int ano_escrito, 
       String genero, int ano_publicado, String linguagem){
          super(capa, nome_livro, nome_autor, ano_escrito, genero, ano_publicado); 
          this.linguagem=linguagem;
       }
       public String getLinguagem(){
          return linguagem;
       }
       public void setLinguagem(String linguagem){
          this.linguagem=linguagem;
       }
      
}
