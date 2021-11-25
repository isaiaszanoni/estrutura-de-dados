package ed;

import java.util.Arrays;

public class Vetor {

    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0; //guarda a posição vazia do array

    public void adiciona(Aluno aluno) {
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;

    }

    public String toString() {
        return Arrays.toString(alunos);
    }

    public int tamanho() {
        return totalDeAlunos;
    }

}
