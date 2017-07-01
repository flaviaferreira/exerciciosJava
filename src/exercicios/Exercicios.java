package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class Exercicios {

    public static void main(String[] args) {
        Integer numeroAlunos = 0;
        Double mediaTurma = 0d;
        List<Aluno> listaNomes = new ArrayList<Aluno>();
        
        numeroAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos: "));
        
        for (int i = 1; i <= numeroAlunos; i++) {
            Aluno aluno = new Aluno();
            
            aluno.setNome((JOptionPane.showInputDialog("Digite o nome do " + i + "º aluno:")));
            aluno.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1 do " + i + "º aluno:")));
            aluno.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2 do " + i + "º aluno:")));
            listaNomes.add(aluno);
            
            mediaTurma = mediaTurma + aluno.getMedia();
        }
        
        Collections.sort(listaNomes);
        JOptionPane.showMessageDialog(null, listaNomes);
        mediaTurma = mediaTurma / numeroAlunos;
        JOptionPane.showMessageDialog(null, "Media da turma: " + mediaTurma);
    }
    
}