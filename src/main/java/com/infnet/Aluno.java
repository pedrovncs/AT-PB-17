package com.infnet;
import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private int matricula;
    private String nome;
    private List<Turma> turmas = new ArrayList<Turma>();

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String addTurma(Turma turma) {
        turma.addAluno(this);
        turmas.add(turma);
        return "Turma: " + turma.getCodigo() + " - adicionada com sucesso!";
    }

    public String exibirTurmas() {
        StringBuilder turmasLista = new StringBuilder();
        turmasLista.append("Alocação do Aluno: ").append(this.nome).append("\n");
        for (Turma turma : turmas) {
            turmasLista.append(turma.getNome());
        }
        return turmasLista.toString();
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

}
