package com.infnet;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Professor> professores = new ArrayList<>();
    public static List<Disciplina> disciplinas = new ArrayList<>();
    public static List<Turma> turmas = new ArrayList<>();
    public static List<Aluno> alunos = new ArrayList<>();
    public static void main(String[] args) {
        //criando alunos
        alunos.add(new Aluno(10001, "Aluno 1"));
        alunos.add(new Aluno(10002, "Aluno 2"));
        alunos.add(new Aluno(10003, "Aluno 3"));
        alunos.add(new Aluno(10004, "Aluno 4"));

        //criando professores
        professores.add(new Professor(1, "João"));
        professores.add(new Professor(2, "José"));

        //criando disciplinas
        disciplinas.add(new Disciplina(1, "Java"));
        disciplinas.add(new Disciplina(2, ".NET"));
        disciplinas.add(new Disciplina(3, "PB"));


        //criando TURMA1001
        turmas.add(new Turma(1001));
        turmas.getFirst().addDisciplina(disciplinas.getFirst());
        turmas.getFirst().addProfessor(professores.get(1));
        professores.get(1).addTurma(turmas.getFirst());
        turmas.getFirst().addAluno(alunos.getFirst());
        alunos.getFirst().addTurma(turmas.getFirst());
        turmas.getFirst().addAluno(alunos.get(1));
        alunos.get(1).addTurma(turmas.getFirst());
        turmas.getFirst().addAluno(alunos.get(2));
        alunos.get(2).addTurma(turmas.getFirst());
        turmas.getFirst().addAluno(alunos.get(3));

        //criando TURMA2001
        turmas.add(new Turma(2001));
        turmas.get(1).addDisciplina(disciplinas.get(1));
        disciplinas.get(1).addTurma(turmas.get(1));
        turmas.get(1).addProfessor(professores.get(0));
        professores.get(0).addTurma(turmas.get(1));
        turmas.get(1).addAluno(alunos.get(0));
        alunos.get(0).addTurma(turmas.get(1));


        //criando TURMA3001
        turmas.add(new Turma(3001));
        turmas.get(2).addDisciplina(disciplinas.get(2));
        turmas.get(2).addProfessor(professores.get(0));
        professores.get(0).addTurma(turmas.get(2));
        turmas.get(2).addAluno(alunos.get(3));

        //OUTPUTS
        System.out.println("Alocação de Turmas: ");
        turmas.forEach(turma -> {
            System.out.println(turma.toString());
        });

        System.out.println(turmas.get(0).gerarPauta());

        System.out.println(alunos.get(0).exibirTurmas());

        System.out.println(professores.get(0).exibirTurmas());

        System.out.println(disciplinas.get(1).exibirTurmas());

    }
}
