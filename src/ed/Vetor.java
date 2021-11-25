package ed;

import java.util.Arrays;

public class Vetor {

    private Aluno[] alunos = new Aluno[100];

    public void adiciona(Aluno aluno) {
        for(int a = 0; a < alunos.length; a++) {
            if(alunos[a] == null) {
                alunos[a] = aluno;
                break;
            }
        }
    }

    public String toString() {
        return Arrays.toString(alunos);
    }

}
