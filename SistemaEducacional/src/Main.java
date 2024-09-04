import classes.Aluno;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Bem Vindo ao Sistema Educacional!");

        String qtdAlunosString = JOptionPane.showInputDialog(null,"Digite o Total de Alunos para Cadastro");
        int qtdAlunos = Integer.parseInt(qtdAlunosString);



        //Uma lista que Possui chave e Valor que identifica uma sequencia de valores
        HashMap<String,List<Aluno>> maps = new HashMap<>();
        List<Aluno> alunos = new ArrayList<Aluno>();
        String nomeTurma = JOptionPane.showInputDialog(null,"Digite a Turma do Aluno");

        for (int i = 0; i < qtdAlunos; i++) {

            String nameAluno = JOptionPane.showInputDialog(null, "Digite o Nome do Aluno");
            String idadeAluno = JOptionPane.showInputDialog(null, "Digite a Idade do Aluno");
            String dataNascimento = JOptionPane.showInputDialog(null, "Digite a Data Nascimento do Aluno");
            String rgAluno = JOptionPane.showInputDialog(null, "Digite o Registro Geral do Aluno");
            String cpfAluno = JOptionPane.showInputDialog(null, "Digite o Cpf do Aluno");
            String nomeMaeAluno = JOptionPane.showInputDialog(null, "Digite o Nome da Mãe do Aluno");
            String nomePaiAluno = JOptionPane.showInputDialog(null, "Digite o Nome do Pai do Aluno");
            String dataMatricula = JOptionPane.showInputDialog(null, "Digite a Data da Matricula");
            String serie = JOptionPane.showInputDialog(null, "Digite a Serie Matriculada");
            String nomeEscola = JOptionPane.showInputDialog(null, "Digite o Nome da Instituição de Ensino");



            Aluno aluno1 = new Aluno();

            aluno1.setNome(nameAluno);
            aluno1.setIdade(Integer.valueOf(idadeAluno));
           aluno1.setDataNascimento(dataNascimento);
            aluno1.setRegistroGeral(rgAluno);
            aluno1.setNumeroCpf(cpfAluno);
            aluno1.setNomeMae(nomeMaeAluno);
            aluno1.setNomePai(nomePaiAluno);
            aluno1.setDataMatricula(dataMatricula);
            aluno1.setSerieMatriculado(serie);
            aluno1.setNomeEscola(nomeEscola);
            alunos.add(aluno1);



        /*Tornar Cadastro de Alunos Dinamicos, Determinando Quantidade */

          /*  System.out.println("========================= Informações Gerais Aluno Atual ============================");
            System.out.println("Nome do Aluno : " + nameAluno);
            System.out.println("Idade do Aluno :" + idadeAluno);
            System.out.println("Registro Geral :" + rgAluno );
            System.out.println("CPF : " + cpfAluno);
            System.out.println("Nome da Mãe : " + nomeMaeAluno);
            System.out.println("Nome do Pai : " + nomePaiAluno);
            System.out.println("Data Matricula : " + dataMatricula );
            System.out.println("Instituição de Ensino : " + nomeEscola );
            System.out.println("--------------------------------------------------");*/


        }
        maps.put(nomeTurma, alunos);




        // Exibir Alunos da Turma 1

        List<Aluno> turma1 = maps.get(nomeTurma);
        System.out.println("------------------------- Informações Gerais Alunos da " + nomeTurma + "-------------------------");
        if(turma1 != null){
            for(Aluno aluno : turma1){
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Idade: " + aluno.getIdade());
               System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
                System.out.println("Registro Geral: " + aluno.getRegistroGeral());
                System.out.println("CPF: " + aluno.getNumeroCpf());
                System.out.println("Nome da Mãe: " + aluno.getNomeMae());
                System.out.println("Nome do Pai: " + aluno.getNomePai());
                System.out.println("Data da Matrícula: " + aluno.getDataMatricula());
                System.out.println("Série Matriculada: " + aluno.getSerieMatriculado());
                System.out.println("Nome da Instituição: " + aluno.getNomeEscola());
                System.out.println("------------------------------------------------------------------------------------------");
            }
        }else{
            System.out.println("Não há alunos na " + nomeTurma);
        }


        /* Tornas Cadastro de Disciplinas Dinamicos, Determinando Quantidade */
/*
        String nomeDisciplina = JOptionPane.showInputDialog(null,"Digite o Nome da Disciplina");
        String notaDisciplinaString = JOptionPane.showInputDialog(null, "Digite a Nota da Disciplina : " + nomeDisciplina);
        double notaDisciplina = (Double.valueOf(notaDisciplinaString));

        String nomeDisciplina2 = JOptionPane.showInputDialog(null,"Digite o Nome da Disciplina");
        String notaDisciplinaString2 = JOptionPane.showInputDialog(null, "Digite a Nota da Disciplina : " + nomeDisciplina2);
        double notaDisciplina2 = (Double.valueOf(notaDisciplinaString2));*/

    /* Opção de Remover Disciplina Cadastrada */
      //  System.out.println("=========================================================================");









        }
    }
