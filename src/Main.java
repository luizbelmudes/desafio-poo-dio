import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Curso cursoCpp = new Curso();
        curso2.setTitulo("curso c++");
        curso2.setDescricao("Descrição curso c++");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoriaCpp = new Mentoria();
        mentoria.setTitulo("mentoria de C++");
        mentoria.setDescricao("descricao mentoria C++");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descriçao Bootcamp Java Developer");
        bootcamp.getCondeudos().add(curso1);
        bootcamp.getCondeudos().add(curso2);
        bootcamp.getCondeudos().add(mentoria);
        bootcamp.getCondeudos().add(cursoCpp);
        bootcamp.getCondeudos().add(mentoriaCpp);

        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Luiz" + devLuiz.getConteudosInscritos());
        devLuiz.progredir();
        devLuiz.progredir();
        System.out.println("Conteudos Concluidos Luiz" + devLuiz.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Luiz" + devLuiz.getConteudosInscritos());
        System.out.println("XP: " + devLuiz.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao" + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos Concluidos Joao" + devJoao.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Joao" + devJoao.getConteudosInscritos());
        System.out.println("XP: " + devJoao.calcularTotalXp());


    }
}