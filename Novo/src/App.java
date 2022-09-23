import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class App {

    static List<Curso> cursos = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        Professor p1 = new Professor(JOptionPane.showInputDialog(null, "Qual é o nome do professor? "));
        List<Integer> opcoes = new ArrayList<>();
        opcoes.add(1);
        opcoes.add(2);
        opcoes.add(3);
        opcoes.add(4);
        opcoes.add(5);
        opcoes.add(6);

        int opcaoSelecionad = 1;
        while (opcoes.get(opcaoSelecionad) != 6) {
            opcaoSelecionad = exibeMenu(opcoes);
            if (opcoes.get(opcaoSelecionad) == 1) {
                cadastrarCurso(p1);
            } else if (opcoes.get(opcaoSelecionad) == 2) {
                matricularAluno();
            } else if (opcoes.get(opcaoSelecionad) == 3) {
                exibeCursos();
            } else if (opcoes.get(opcaoSelecionad) == 4) {
                exibeAlunos();
            }
        }
        System.out.println(cursos.size());
    }
    private static void exibeAlunos() {
        
    }

    private static void exibeCursos() {
        String info = "";
        for (Curso curso : cursos) {
            info = info + curso.getNome() + " ch: " + curso.getCarga_Horária() + "\n";
            for (Aluno aluno : curso.getAluno()) {
                info = info + " - " + aluno.getNome() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, info, "Cursos", JOptionPane.PLAIN_MESSAGE);
    }

    private static int exibeMenu(List<Integer> opcoes) {
        Object[] optionsArray = opcoes.toArray();
        int opcaoSelecionad = JOptionPane.showOptionDialog(null,
                "1. Cadastrar curso \n2. Cadastrar aluno \n3. Exibir cursos \n4 .Exibir alunos \n5. Certificado \n6. Encerrar",
                "Selecione",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                optionsArray, null);
        return opcaoSelecionad;
    }

    private static void matricularAluno() {
        List<String> opcoes = new ArrayList<>();
        for (Curso curso : cursos) {
            opcoes.add(curso.getNome());
        }
        Object[] optionsArray = opcoes.toArray();
        int opcaoSelecionada = JOptionPane.showOptionDialog(null,
                "Selecion o curso",
                "Cursos",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                optionsArray, null);
        for(int x = 0; x < 1; x++){
            String nomeCursoSelecionado = opcoes.get(opcaoSelecionada);
            String nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno");
            int confirmacao_de_nome_do_aluno = JOptionPane.showConfirmDialog(null, "O nome do aluno é " + nomeAluno +"?");
            if(confirmacao_de_nome_do_aluno == 0){
                String emailAluno = JOptionPane.showInputDialog("Informe o email do aluno");
                Aluno novoAluno = new Aluno(nomeAluno, emailAluno);
                for (Curso curso : cursos) {
                    if (curso.getNome().equals(nomeCursoSelecionado)) {
                        curso.realizarM(novoAluno);
                        break;
                }
            }
            break;
        }else if(confirmacao_de_nome_do_aluno == 1){}
            x--;
        }
        
    }

    private static void cadastrarCurso(Professor p1) {
        String nomeCurso = JOptionPane.showInputDialog("Informe o nome do curso");
        String nivelCurso = JOptionPane.showInputDialog("Informe o nível do curso");
        String chCurso = JOptionPane.showInputDialog("Informe a CH do curso");
        Curso novoCurso = new Curso(nomeCurso, nivelCurso, Integer.parseInt(chCurso), p1);
        cursos.add(novoCurso);
    }

    
    }
    
