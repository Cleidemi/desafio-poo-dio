package br.com.dio.desafio.domínio;
import br.com.dio.desafio.domínio.Curso;
import br.com.dio.desafio.domínio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo ("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        //System.out.println (curso1);
        //System.out.println (curso2);
        //System.out.println (mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCleide = new Dev();
        devCleide.setNome("Cleide");
        devCleide.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Cleide:" + devCleide.getConteudosInscritos());
        devCleide.progredir();
        devCleide.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Cleide:" + devCleide.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Cleide:" + devCleide.getConteudosConcluidos());
        System.out.println("XP:" + devCleide.calcularTotalXp());

        System.out.println("---------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}


    }
}