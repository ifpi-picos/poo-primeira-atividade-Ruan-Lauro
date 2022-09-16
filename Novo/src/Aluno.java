public class Aluno {
    String Nome;
    String Email;

    public Aluno(String nome, String email){
        this.Nome = nome;
        this.Email = email;
    }

    public String getNome(){
        return this.Nome;
    }

    public String getEmail(){
        return this.Email;
    }

  @Override
  public String toString() {
      return "Aluno = " + getNome() + " E-mail = " + getEmail();
  }  
}
