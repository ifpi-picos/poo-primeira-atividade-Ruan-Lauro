public class Professor {
    
     String Nome;
    String Email;
    String Formacao;

    public Professor(String nome){
        this.Nome = nome;
    }

    public void setNome(String nome){
        this.Nome = nome;
    }

    public String getNome(){
        return this.Nome;
    }

    @Override
    public boolean equals(Object obj){
        return this.Nome.equals(((Professor) obj).Nome);
    }
}
