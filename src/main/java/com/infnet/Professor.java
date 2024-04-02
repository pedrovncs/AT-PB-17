package com.infnet;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private int matricula;
    private String nome;

    private List<Turma> turmas = new ArrayList<Turma>();

    public Professor(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void addTurma(Turma turma) {
        turmas.add(turma);
    }

    public String exibirTurmas() {
        StringBuilder turmasLista = new StringBuilder();
        turmasLista.append("Alocação do Professor: ").append(this.nome).append("\n");
        for (Turma turma : turmas) {
            turmasLista.append("\nCódigo da Turma: ").append(turma.getCodigo()).append("\n");
            turmasLista.append("Disciplina: ").append(turma.getDisciplina().getNome()).append("\n");
        }
        return turmasLista.toString();
    }
}
