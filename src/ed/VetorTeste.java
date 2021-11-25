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
        System.out.println( a1 + " adicionado na posição: " + lista.tamanho());
        lista.adiciona(a2);
        System.out.println( a2 + " adicionado na posição: " + lista.tamanho());
        lista.adiciona(a3);
        System.out.println( a3 + " adicionado na posição: " + lista.tamanho());
        lista.adiciona(a4);
        System.out.println( a4 + " adicionado na posição: " + lista.tamanho());

        System.out.println(lista);

    }

}
