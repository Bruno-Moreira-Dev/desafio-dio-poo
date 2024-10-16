import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Descrição curso C#");
        curso2.setCargaHoraria(4);

        Conteudo conteudo1 = new Curso();
        conteudo1.setTitulo("Conteúdo curso Java");
        conteudo1.setDescricao("Descrição conteúdo curso Java");

        Conteudo conteudo2 = new Mentoria();
        conteudo2.setTitulo("Conteúdo mentoria Java");
        conteudo2.setDescricao("Descrição conteúdo mentoria Java");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(conteudo1);
        bootcamp.getConteudos().add(conteudo2);

        Dev dev1 = new Dev();
        dev1.setNome("Bruno");
        dev1.inscreverBootcamp(bootcamp);

        dev1.progredir();
        dev1.progredir();
        dev1.progredir();

        System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Joao");
        dev2.inscreverBootcamp(bootcamp);

        dev2.progredir();

        System.out.println("Conteúdos inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());

        System.out.println("=========================");
        System.out.println("=== Bootcamp Info ===");
        System.out.println(bootcamp);
        System.out.println("=========================");
    }
}