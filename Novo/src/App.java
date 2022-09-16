import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        Professor p1 = new Professor("Bob");
        Curso c1 = new Curso("ADS","Superior",2000,p1);

        System.out.println("Nome do curso: " + c1.getNome() + ", Professor: " + p1.getNome());

        for(int i = 0; i < 3; i++){
            String nomeAluno = JOptionPane.showInputDialog(null,"Insirao nome do aluno");
            if(nomeAluno == null){
                break;
            }
            int resultado = JOptionPane.showConfirmDialog(null, "Um dos alunos é " + nomeAluno + "?");
            if(resultado == 0){
                String emailAluno = JOptionPane.showInputDialog(null, "Insira o e-mail do aluno");
                c1.realizarM(new Aluno(nomeAluno, emailAluno));
            } else if(resultado == 2){
                break;
            }else{
                
            }
            
        }

        JOptionPane.showMessageDialog(null, "Curso:" + c1.getNome() + "\n Alunos: "  + c1.getAluno(), "Dados do Curso", 1);

    }
    }
    
