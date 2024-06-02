package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class ProgramPrincipal {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		Mentoria mentoria = new Mentoria();
		Bootcamp bootcamp = new Bootcamp();

		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);

		curso2.setTitulo("curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);

		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());

		bootcamp.setNome("Bootcamp Java developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev devFabio = new Dev();

		devFabio.setNome("Fábio");
		devFabio.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Fábio:" + devFabio.getConteudoInscritos());
		devFabio.progredir();
		System.out.println("Conteúdos Inscritos Fábio:" + devFabio.getConteudoInscritos());
		System.out.println("Conteúdos Concluídos Fábio:" + devFabio.getConteudoConcluidos());
		System.out.println("XP:" + devFabio.calcularTotalXp());
		System.out.println("-");

		devFabio.progredir();
		System.out.println("Conteúdos Inscritos Fábio:" + devFabio.getConteudoInscritos());
		System.out.println("Conteúdos Concluídos Fábio:" + devFabio.getConteudoConcluidos());
		System.out.println("XP:" + devFabio.calcularTotalXp());
		System.out.println("-");

		devFabio.progredir();
		System.out.println("Conteúdos Inscritos Fábio:" + devFabio.getConteudoInscritos());
		System.out.println("Conteúdos Concluídos Fábio:" + devFabio.getConteudoConcluidos());
		System.out.println("XP:" + devFabio.calcularTotalXp());

	}

}
