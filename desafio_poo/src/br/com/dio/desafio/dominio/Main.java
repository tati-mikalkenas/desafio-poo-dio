package br.com.dio.desafio.dominio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Curso curso3=new Curso();
        curso3.setTitulo("Curso de Python");
        curso3.setDescricao("Para você que busca ampliar os conhecimentos básico em Python");
        curso3.setCargaHoraria(3);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Bootcamp bootcamp1= new Bootcamp();
        bootcamp1.setNome("Bootcamp de PHP");
        bootcamp1.setDescricao("Para você backend que busca ampliar seus conhecimentos em PHP");
        bootcamp1.getConteudos().add(curso3);


        Dev devTatiane = new Dev();
        devTatiane.setNome("Tatiane");
        devTatiane.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Tatiane:" + devTatiane.getConteudosInscritos());
        devTatiane.progredir();
        devTatiane.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Tatiane:" + devTatiane.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Tatiane:" + devTatiane.getConteudosConcluidos());
        System.out.println("XP:" + devTatiane.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        System.out.println("-------");

        Dev devMaria= new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos Maria"+ devMaria.getConteudosInscritos());
        System.out.println("XP:"+ devMaria.calcularTotalXp());

    }

}
