package ed;

public class VetorTeste {

    public static void main(String args[]) {
        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Sônia");
        Aluno a3 = new Aluno("Joaquim");
        Aluno a4 = new Aluno("Aldino");
        Aluno a5 = new Aluno("Samanta");
        Aluno a6 = new Aluno("Paulina");
        Aluno a7 = new Aluno("Sofia");
        Aluno a8 = new Aluno("Kenny");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a3);
        lista.adiciona(a4);

        System.out.println(lista);
        System.out.println("Joaquim está na lista? " + lista.contem(a3));

        Aluno algumAluno = lista.pega(2);
        System.out.println(algumAluno);

        lista.adiciona(8, a8);
        System.out.println(lista);
    }

}
