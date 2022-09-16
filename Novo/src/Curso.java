import java.util.ArrayList;
import java.util.List;

public class Curso {
    
    int Carga_horária;
    String Nome;
    String nivel;
    Professor professor;
    List<Aluno> aluno;
    List<Aluno> email;

    public Curso(String Nome, String nivel, int Carga_horária, Professor professor){
        this.Nome = Nome;
        this.nivel = nivel;
        this.Carga_horária = Carga_horária;
        this.professor = professor;
        this.aluno = new ArrayList<>();
    }

    public void realizarM(Aluno aluno){
        this.aluno.add(aluno);
        
    }
    public int getQAM(){
        return this.aluno.size();
    }
    public void setNome(String nome){
        this.Nome = nome;
    }
    public void setCarga_Horária(int ch){
        this.Carga_horária = ch;
    }
    public String getNome(){
        return this.Nome;
    }
    public String getNivel(){
        return this.nivel;
    }
    public int getCarga_Horária(){
        return this.Carga_horária;
    }
    public String getNameProfessor(){
        return this.professor.getNome();
    }

    public Professor getProfessor(){
        return professor;
    }

    public List<Aluno> getAluno(){
        return aluno;
    }

}
