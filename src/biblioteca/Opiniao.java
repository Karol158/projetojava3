package biblioteca;

public class Opiniao {
    private String opiniao;


    Opiniao(String opiniao){
        this.opiniao=opiniao;
    }
   public String getOpiniao(){
    return this.opiniao;
   }
   public void setOpiniao(String opiniao){
    this.opiniao=opiniao;
   }
   /* é uma agregação pois a opinao  existe sem precisar dos livros*/
}
