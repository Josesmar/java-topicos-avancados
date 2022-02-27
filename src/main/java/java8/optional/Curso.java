package java8.optional;

import java.util.List;

public class Curso {

    private String nome;
    private List<Aluno> listaAluno;

    public Curso() {
    }

    public Curso(String nome) {
        this.nome = nome;
        this.listaAluno = listaAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getListaAluno() {
        return listaAluno;
    }

    public void setListaAluno(List<Aluno> listaAluno) {
        this.listaAluno = listaAluno;
    }
}
