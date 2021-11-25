package ed;

import java.util.Arrays;

public class Vetor {

    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0; //guarda a posição vazia do array

    public void adiciona(Aluno aluno) {
        this.alunos[totalDeAlunos] = aluno;
        System.out.println(aluno + " adicionado na posição: " + totalDeAlunos);
        totalDeAlunos++;
    }

    public String toString() {
        return Arrays.toString(alunos);
    }

    public int tamanho() {
        return totalDeAlunos;
    }

    public boolean contem(Aluno aluno) {
        for(int a = 0; a < totalDeAlunos; a++){
            if(aluno.equals(alunos[a])){
                return true;
            }
        }
        return false;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >=0 && posicao < totalDeAlunos;
    }

    public Aluno pega(int posicao) {

        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição inválida");
        }

        return alunos[posicao];
    }

}
